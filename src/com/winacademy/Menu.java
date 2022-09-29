package com.winacademy;

import java.util.Scanner;


public class Menu {

    public static void printMenu(String[] options){
        for (String option : options){
            System.out.println(option);
        }
        System.out.print("Choose your option : ");
    }


}
