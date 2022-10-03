package com.winacademy;

import java.util.Date;

public class Etudiant extends User{
    private Date dateEntree;
    public Etudiant(int id, String nom, String prenom, String tel, String mail, String password, String role, Date dateEntree) {
        super(id, nom, prenom, tel, mail, password, role);
        this.dateEntree = dateEntree;
    }
}
