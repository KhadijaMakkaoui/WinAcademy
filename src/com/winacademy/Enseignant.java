package com.winacademy;

        import java.util.*;

        import static java.lang.System.exit;

public class Enseignant extends User{
    private String dateFonction;
    private  String matiere;
    private static List<Enseignant> enseignants=new ArrayList<>();
    static List<Matiere> Mat = new ArrayList<>();
    static String matiere_choix;


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
                    MatiereMenu();
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
                    System.out.println("Donner id de l'enseignant à modifier:");
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
        Mat.addAll(Arrays.asList(Matiere.MATIERE_1, Matiere.MATIERE_2, Matiere.MATIERE_3, Matiere.MATIERE_4, Matiere.MATIERE_5));

        int ch;
        do {
            System.out.println("Veuillez choisir la matiere que va enseigner ce prof:");
            System.out.println("1." + Matiere.MATIERE_1);
            System.out.println("2." + Matiere.MATIERE_2);
            System.out.println("3." + Matiere.MATIERE_3);
            System.out.println("4." + Matiere.MATIERE_4);
            System.out.println("5." + Matiere.MATIERE_5);
            System.out.println("0.EXIT");
            System.out.println("Enter Your Choice : ");
            ch = s.nextInt();


            if (ch > 0 && ch <= 5) {
                matiere_choix = Mat.get(ch - 1).toString();
                return;
            }
            else exit(0);

        } while (ch != 0 || (ch > 0 && ch <= 5));


    }

    public static void insertEnseignant( Scanner scanner){
        User u=User.insertUser(Role.ENSEIGNANT.toString());
        System.out.println("Donner la date de fonction du enseignant: ");
        String dateFct = scanner.nextLine();
        enseignants.add(new Enseignant(u.id, u.nom, u.prenom, u.tel, u.mail,u.password, u.role, dateFct,matiere_choix));


    }


    public static void displayList() {
        System.out.println("------------------");
        enseignants.stream().forEach(enseignant -> System.out.println(enseignant));
        System.out.println("------------------");
    }

    @Override
    public String toString() {
        return "Enseignant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", tel='" + tel + '\'' +
                ", mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", dateFonction='" + dateFonction + '\'' +
                ", matiere='" + matiere + '\'' +
                '}';
    }
}
