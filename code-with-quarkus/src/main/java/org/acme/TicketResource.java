package org.acme;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.isen.ticketapp.interfaces.models.TicketModel;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

@Path("/tickets")
public class TicketResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getTickets() {
        try {
            // Lire le fichier JSON à partir des ressources
            String filePath = getClass().getClassLoader().getResource("ticket.json").getPath();

            // Lire le contenu du fichier
            byte[] jsonData = Files.readAllBytes(Paths.get(filePath));

            // Mapper le JSON vers une liste d'objets TicketModel
            ObjectMapper mapper = new ObjectMapper();
            List<TicketModel> tickets = mapper.readValue(jsonData, mapper.getTypeFactory().constructCollectionType(List.class, TicketModel.class));

            // Retourner la liste en réponse
            return Response.ok(tickets).build();
        } catch (IOException e) {
            e.printStackTrace();
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity("Erreur lors de la lecture du fichier JSON").build();
        }
    }
}
