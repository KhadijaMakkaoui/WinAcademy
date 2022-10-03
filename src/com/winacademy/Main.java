package com.winacademy;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.exit;


public class Main {

    public static void main(String[] args) {
        String[] Options={"------Main menu-------",
                "1-College Management",
            "2-Users Management",
            "3-Departement Management",
            "4-Etudiants Management",
            "5-Enseignants Management",
                "6-Creer ou Afficher les roles",
            "0-Exit"
    };
        Scanner scanner=new Scanner(System.in);
        int option=1;
        while (option!=0){
            Menu.printMenu(Options);
            try {
                option = scanner.nextInt();
                scanner.nextLine();
                switch (option){
                    case 1: College.collegeMenu(); break;
                    case 2: User.UserMenu(); break;
                    case 3: break;
                    case 4: Etudiant.EtudiantMenu();break;
                    case 5: Enseignant.EnseignatMenu();break;
                    case 6: break;
                    case 0: scanner.close();exit(0);
                }
            }
            catch (InputMismatchException ex){
                System.out.println("Veuillez entrer un nombre entier entre 1 et " + Options.length);
                scanner.next();
            }
            catch (Exception ex){
                System.out.println("An unexpected error happened. Please try again");
                scanner.next();
            }
        }
    }
}
