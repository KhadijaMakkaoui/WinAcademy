package com.winacademy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class User {
    static List<User> users = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);


        protected int id;
    protected String nom;
    protected String prenom;
    protected String tel;
    protected String mail;
    protected String password;

        protected String role;
        public User(int id,String nom,String prenom,String tel,String mail,String password,String role) {
            this.id=id;
            this.nom=nom;
            this.prenom=prenom;
            this.tel=tel;
            this.mail=mail;
            this.password=password;
            this.role=role;

        }

    public User() {

    }

    public static void UserMenu() {
        Scanner s = new Scanner(System.in);
        int ch = 0;
        do {
            System.out.println("1.INSERT ADMIN");
            System.out.println("2.DISPLAY ALL USERS");
            System.out.println("3.UPDATE Email and Password");
            System.out.println("4.SEARCH BY ROLE");
            System.out.println("0.EXIT");
            System.out.println("Enter Your Choice : ");
            ch = s.nextInt();

            switch (ch) {
                case 1:
                    System.out.println();
                    insertUser((Role.ADMIN).toString());
                    System.out.println();
                    break;
                case 2:
                    System.out.println();
                    displayList();
                    System.out.println();
                    break;
                case 3:
                    System.out.println();
                    System.out.println("Donner id du user à modifier:");
                    int id=scanner.nextInt();
                    scanner.nextLine();
                    update(id,scanner);
                    System.out.println();
                    break;
                    case 4:
                    System.out.println();

                        searchByRole();
                    System.out.println();
                    break;

            }
        } while (ch != 0);
    }
    public static User insertUser(String role) {
        System.out.println("Enter User Id :");
        int u_id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter User first Name :");
        String fname = scanner.nextLine();
        System.out.println("Enter User last Name :");
        String lname = scanner.nextLine();
        System.out.println("Enter User tel :");
        String u_tel = scanner.nextLine();
        System.out.println("Enter User mail :");
        String u_mail= scanner.nextLine();
        System.out.println("Enter User Password :");
        String u_password =scanner.nextLine();
        scanner.nextLine();
        users.add(new User(u_id, lname, fname, u_tel, u_mail,u_password, role));
        return users.get(users.size()-1);
        }

    public static void displayList() {
        System.out.println("------------------");
        Iterator<User> itr = users.iterator();
        while (itr.hasNext()) {
            User u = itr.next();
            System.out.println(u);
        }
        System.out.println("------------------");

    }


    public static User findById(int idToFind)
    {
        for (User u : users) {
            if (u.id== idToFind) {
                return u;
            }
        }
        return null;
    }
    public static void update(int id, Scanner scanner)
    {

        if (findById(id)!=null) {
            User u = findById(id);
            System.out.println("Entrer le nouveau mail");
            u.mail= scanner.nextLine();
            System.out.println("Entrer le nouveau passwor");
            u.password= scanner.nextLine();

            System.out.println("Modifier avec succes");
        }
        else {
            System.out.println("User n'existe pas");
        }
    }
    public static void searchByRole() {
            String role_search;
        List<String> roles = Stream.of(Role.values())
                .map(r -> r.name())
                .collect(Collectors.toList());

        do {
            System.out.println("Donner le role:");
            role_search = scanner.nextLine();

        } while (!roles.contains(role_search));

        String finalRole_search = role_search;
        users.stream().filter(u -> finalRole_search.equals(u.role)).forEach(u -> System.out.println(u));

    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", tel='" + tel + '\'' +
                ", mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}


