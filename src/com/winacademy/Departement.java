package com.winacademy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class Departement {
    private int departement_id;
    private String nom;
    private int id_responsable=0;
    //private static List<Departement> departements=new ArrayList<>();


    public Departement(int departement_id, String nom,int id_responsable) {
        this.departement_id = departement_id;
        this.nom = nom;
        this.id_responsable=id_responsable;
    }

    public int getDepartement_id() {
        return departement_id;
    }

    public void setDepartement_id(int departement_id) {
        this.departement_id = departement_id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public static void departementMenu() {
        Scanner s = new Scanner(System.in);
        int ch = 0;
        do {
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY ALL");
            System.out.println("3.SEARCH");
            System.out.println("4.ASSIGN RESPONSIBLE");
            System.out.println("0.EXIT");
            System.out.println("Enter Your Choice : ");
            ch = s.nextInt();

            switch (ch) {
                case 1:
                    System.out.println();
                    insertDepartement();
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    displayList();
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    //searchList();
                    System.out.println();
                    break;
                case 0:
                    break;
            }
        } while (ch != 0);
    }
    public static void insertDepartement() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer Id :");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Entrer le nom du departement :");
        String nom = scanner.nextLine();

        College.departements.add(new Departement(id, nom,0));
    }

    public static void displayList() {
        System.out.println("------------------");
        College.departements.stream().forEach(dep->System.out.println(dep));
        System.out.println("------------------");

    }

    @Override
    public String toString() {
        return "Departement{" +
                "departement_id=" + departement_id +
                ", nom='" + nom + '\'' +
                ", id_responsable=" + id_responsable +
                '}';
    }
}
