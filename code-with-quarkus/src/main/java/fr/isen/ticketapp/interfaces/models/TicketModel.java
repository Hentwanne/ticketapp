package fr.isen.ticketapp.interfaces.models;

import java.util.ArrayList;
import java.util.List;
import fr.isen.ticketapp.interfaces.models.enums.ETAT_TICKET;
import fr.isen.ticketapp.interfaces.models.enums.IMPACT;

public class TicketModel {
    private int id;

    public IMPACT impact;

    public ETAT_TICKET etat;

    public String titre;

    public String description;

    public String dateCreation;

    public String dateMisAJour;

    public UserModel utilisateurCreateur;

    public PosteInformatique poste;

    public List<PosteInformatique> posteInformatique = new ArrayList<PosteInformatique> ();

}
