package com.winacademy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class College {
    private int college_id;
    private String college_Name;
    private String siteInternet;
    private static List<College> colleges=new ArrayList<>();
    public static List<Departement>departements=new ArrayList<>();
    public College(int college_id, String college_Name, String siteInternet) {
        this.college_id = college_id;
        this.college_Name = college_Name;
        this.siteInternet = siteInternet;
    }
    public int getCollege_id() {
        return college_id;
    }

    public void setCollege_id(int college_id) {
        this.college_id = college_id;
    }

    public String getCollege_Name() {
        return college_Name;
    }

    public void setCollege_Name(String college_Name) {
        this.college_Name = college_Name;
    }

    public String getSiteInternet() {
        return siteInternet;
    }

    public void setSiteInternet(String siteInternet) {
        this.siteInternet = siteInternet;
    }

    public static void collegeMenu() {
        Scanner s = new Scanner(System.in);
        int ch = 0;
        do {
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY ALL");
            System.out.println("3.SEARCH");
            System.out.println("4.UPDATE");
            System.out.println("0.EXIT");
            System.out.println("Enter Your Choice : ");
            ch = s.nextInt();

            switch (ch) {
                case 1:
                    System.out.println();
                    insertCollege();
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
                case 4:
                    System.out.println();
                    // updateList();
                    System.out.println();
                    break;
            }
        } while (ch != 0);
    }
    public static void insertCollege() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrer Id :");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Entrer le nom du college :");
        String nom = scanner.nextLine();
        System.out.println("Entrer le site web du college :");
        String siteInternet = scanner.nextLine();
        colleges.add(new College(id, nom, siteInternet));
    }

    public static void displayList() {
        System.out.println("------------------");
        colleges.stream().forEach(c->System.out.println(c));
        System.out.println("------------------");

    }

    @Override
    public String toString() {
        return "College{" +
                "college_id=" + college_id +
                ", college_Name='" + college_Name + '\'' +
                ", siteInternet='" + siteInternet + '\'' +
                ", departements=" + departements +
                '}';
    }
}
