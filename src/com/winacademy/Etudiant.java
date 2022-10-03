package com.winacademy;

import java.util.*;

public class Etudiant extends User{
    private String dateEntree;
    private static Scanner scanner=new Scanner(System.in);
    private static List<Etudiant> etudiants=new ArrayList<>();
    public Etudiant(int id, String nom, String prenom, String tel, String mail, String password, String role, String dateEntree) {
        super(id, nom, prenom, tel, mail, password, role);
        this.dateEntree = dateEntree;
    }
    public static void EtudiantMenu() {
        Scanner s = new Scanner(System.in);
        int ch = 0;
        do {
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY ALL");
            System.out.println("3.SEARCH");
            System.out.println("4.UPDATE Email and Password");
            System.out.println("0.EXIT");
            System.out.println("Enter Your Choice : ");
            ch = s.nextInt();

            switch (ch) {
                case 1:
                    System.out.println();
                    insertEtudiant(scanner);
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    displayList();
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    System.out.println();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Donner id de l'etudiant à modifier:");
                    int id=scanner.nextInt();
                    scanner.nextLine();
                    update(id,scanner);
                    System.out.println();
                    break;
            }
        } while (ch != 0);
    }
public static void insertEtudiant( Scanner scanner){
        User u=User.insertUser(Role.ETUDIANT.toString());
        System.out.println("Donner la date d'entree d'etudiant: ");
        String dateEntre = scanner.nextLine();
        scanner.nextLine();
        etudiants.add(new Etudiant(u.id, u.nom, u.prenom, u.tel, u.mail,u.password, u.role,dateEntre));


}

    public static void displayList() {
        System.out.println("------------------");
        etudiants.stream().forEach(etudiant -> System.out.println(etudiant));
        System.out.println("------------------");
    }
    @Override
    public String toString() {
        return "Etudiant{" +

                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", tel='" + tel + '\'' +
                ", mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", dateEntree='" + dateEntree + '\'' +
                '}';
    }
}
