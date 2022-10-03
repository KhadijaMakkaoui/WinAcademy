package com.winacademy;

        import java.util.*;

public class Enseignant extends User{

    private static List<Enseignant> enseignants=new ArrayList<>();
    private String dateFonction;
    private static String matiere;
    public Enseignant(int id, String nom, String prenom, String tel, String mail, String password, String role, String dateFonction, String matiere) {
        super(id, nom, prenom, tel, mail, password, role);
        this.dateFonction = dateFonction;
        this.matiere = matiere;
    }
    public static void EnseignatMenu() {
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
                    insertEnseignant(scanner);
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
    public static void MatiereMenu() {
        Scanner s = new Scanner(System.in);
        List<Matiere> Mat = new ArrayList<>();
        Mat.addAll(Arrays.asList(Matiere.MATIERE_1, Matiere.MATIERE_2, Matiere.MATIERE_3, Matiere.MATIERE_4, Matiere.MATIERE_5));
        int ch;
        do {

            System.out.println("1." + Matiere.MATIERE_1);
            System.out.println("2." + Matiere.MATIERE_2);
            System.out.println("3." + Matiere.MATIERE_3);
            System.out.println("4." + Matiere.MATIERE_4);
            System.out.println("5." + Matiere.MATIERE_5);
            System.out.println("0.EXIT");
            System.out.println("Enter Your Choice : ");
            ch = s.nextInt();

            if (ch > 0 && ch <= 5) matiere = Mat.get(ch - 1).toString();
        } while (ch != 0 || (ch > 0 && ch <= 5));


    }

    public static void insertEnseignant( Scanner scanner){
        User u=User.insertUser(Role.ETUDIANT.toString());
        System.out.println("Donner la date de fonction du enseignant: ");
        String dateFct = scanner.nextLine();
        scanner.nextLine();
        //enseignants.add(new Enseignant(u.id, u.nom, u.prenom, u.tel, u.mail,u.password, u.role, dateFct));


    }

    public static void displayList() {
        System.out.println("------------------");
        enseignants.stream().forEach(enseignant -> System.out.println(enseignant));
        System.out.println("------------------");
    }

}
