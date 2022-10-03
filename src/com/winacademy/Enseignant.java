package com.winacademy;

import java.util.Date;

public class Enseignant extends User {
    private Date dateFonction;
    private String matiere;
    public Enseignant(int id, String nom, String prenom, String tel, String mail, String password, String role, Date dateFonction, String matiere) {
        super(id, nom, prenom, tel, mail, password, role);
        this.dateFonction = dateFonction;
        this.matiere = matiere;
    }
}
