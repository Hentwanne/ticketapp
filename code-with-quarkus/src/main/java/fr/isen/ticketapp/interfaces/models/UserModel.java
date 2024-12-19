package fr.isen.ticketapp.interfaces.models;

import fr.isen.ticketapp.interfaces.models.enums.ROLE;

public class UserModel {
    public int id;

    public String nom;

    public String email;

    public String motDePasse;

    public String dateDerniereConnexion;

    public boolean actif;

    public ROLE role;

    public TicketModel ticketModel;

}
