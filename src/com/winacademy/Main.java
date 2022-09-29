package com.winacademy;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.System.exit;


public class Main {

    public static void main(String[] args) {
        String[] Options={"1-College Management",
            "2-Users Management",
            "3-Roles Management",
            "4-Salle Management",
            "5-Matieres Management",
            "6-Exit"
    };
        Scanner scanner=new Scanner(System.in);
        int option=1;
        while (option!=6){
            Menu.printMenu(Options);
            try {
                option = scanner.nextInt();
                switch (option){
                    case 1: User.crudLoop(); break;
                    case 2: break;
                    case 3: break;
                    case 4: break;
                    case 5: break;
                    case 6: exit(0);
                }
            }
            catch (InputMismatchException ex){
                System.out.println("Please enter an integer value between 1 and " + Options.length);
                scanner.next();
            }
            catch (Exception ex){
                System.out.println("An unexpected error happened. Please try again");
                scanner.next();
            }
        }
    }
}
