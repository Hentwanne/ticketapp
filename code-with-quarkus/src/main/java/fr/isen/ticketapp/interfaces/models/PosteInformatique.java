package fr.isen.ticketapp.interfaces.models;

import java.util.ArrayList;
import java.util.List;
import fr.isen.ticketapp.interfaces.models.enums.ETAT_POSTE;

public class PosteInformatique {
    public int id;

    public UserModel utilisateurAffecte;

    public ETAT_POSTE etat;

    public String configuration;

    public List<UserModel> userModel = new ArrayList<UserModel> ();

}
