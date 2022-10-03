package com.winacademy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Role {
    private int role_id;
    private String role_title;
    private static List<Role> roles = new ArrayList<>();
    public Role(int role_id, String role_title) {
        this.role_id = role_id;
        this.role_title = role_title;
    }
    public static void RoleMenu() {
        Scanner s = new Scanner(System.in);
        int ch = 0;
        do {
            System.out.println("1.INSERT");
            System.out.println("2.DISPLAY ALL");
            System.out.println("0.EXIT");
            System.out.println("Enter Your Choice : ");
            ch = s.nextInt();

            switch (ch) {
                case 1:
                    System.out.println();
                    insertRole();
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    displayList();
                    System.out.println();
                    break;
            }
        }while (ch!=0);
    }
    public static void insertRole(){

        Scanner role = new Scanner(System.in);
        System.out.println("Entrer le id du role:");
        int id = role.nextInt();
        role.nextLine();
        System.out.println("Entrer le titre du role:");
        String titre = role.nextLine();
        roles.add(new Role(id,titre));
    }
    public static void displayList() {
        System.out.println("------------------");
        Iterator<Role> itr = roles.iterator();
        while (itr.hasNext()) {
            Role r = itr.next();
            System.out.println(r);
        }
        System.out.println("------------------");

    }
    @Override
    public String toString() {
        return "Role{" +
                "role_id=" + role_id +
                ", role_title='" + role_title + '\'' +
                '}';
    }
}
