package fr.isen.ticketapp.interfaces.services;

import java.util.List;
import fr.isen.ticketapp.interfaces.models.TicketModel;

public interface TicketService {
    List<TicketModel> GetAllTicket();

    TicketModel GetTicketById(final int id);

    TicketModel AddTicket(final TicketModel ticket);

    boolean removeTicket(final int TicketId);

    TicketModel updateTicket(final TicketModel newTicket);

}
