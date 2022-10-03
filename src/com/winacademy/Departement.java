package com.winacademy;

public class Departement {
    private int departement_id;
    private int nom;

    public Departement(int departement_id, int nom) {
        this.departement_id = departement_id;
        this.nom = nom;
    }

    public int getDepartement_id() {
        return departement_id;
    }

    public void setDepartement_id(int departement_id) {
        this.departement_id = departement_id;
    }

    public int getNom() {
        return nom;
    }

    public void setNom(int nom) {
        this.nom = nom;
    }
}
