package com.winacademy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class User {
    static List<User> al = new ArrayList<>();


        protected int id;
        protected String nom,prenom,tel,mail,password;
        protected int role;
        public User(int id,String nom,String prenom,String tel,String mail,String password,int role) {
            this.id=id;
            this.nom=nom;
            this.prenom=prenom;
            this.tel=tel;
            this.mail=mail;
            this.password=password;
            this.role=role;

        }

        public static void UserMenu() {
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
                    insertUser();
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
    public static void insertUser() {
        Scanner id = new Scanner(System.in);
        Scanner nom = new Scanner(System.in);
        Scanner prenom = new Scanner(System.in);
        Scanner tel = new Scanner(System.in);
        Scanner mail = new Scanner(System.in);
        Scanner password = new Scanner(System.in);
        Scanner role = new Scanner(System.in);
        System.out.println("Enter User Id :");
        int u_id = id.nextInt();
        System.out.println("Enter User first Name :");
        String fname = prenom.nextLine();
        System.out.println("Enter User last Name :");
        String lname = nom.nextLine();
        System.out.println("Enter User tel :");
        String u_tel = tel.nextLine();
        System.out.println("Enter User mail :");
        String u_mail= mail.nextLine();
        System.out.println("Enter User Password :");
        String u_password =password.nextLine();
        System.out.println("Enter User role id :");
        int u_role = role.nextInt();
        role.nextLine();
        al.add(new User(u_id, lname, fname, u_tel, u_mail,u_password, u_role));
    }

    public static void displayList() {
        System.out.println("------------------");
        Iterator<User> itr = al.iterator();
        while (itr.hasNext()) {
            User u = itr.next();
            System.out.println(u);
        }
        System.out.println("------------------");

    }

    @Override
    public String toString() {
        return "Id:"+this.id+" -Full Name: "+this.nom+" "+this.prenom;
    }
    /* public static void searchList() {
        boolean found = false;
        Scanner sId = new Scanner(System.in);
        System.out.println("Enter Employee Id to Search:");
        int studentId = sId.nextInt();
        "-".repeat(20);
        Iterator<StudentDto> itr = al.iterator();
        while (itr.hasNext()) {
            StudentDto student = itr.next();
            if (student.getStudentId() == studentId) {
                System.out.println("Record Found");
                System.out.println(student);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Record Not Found");
        }
        "-".repeat(20);
    }

    public static void updateList() {
        boolean found = false;
        Scanner sId = new Scanner(System.in);
        Scanner sName = new Scanner(System.in);
        Scanner sFaculty = new Scanner(System.in);
        System.out.println("Enter Employee Id to Update:");
        int studentId = sId.nextInt();
        "-".repeat(20);
        ListIterator<StudentDto> itr = al.listIterator();
        while (itr.hasNext()) {
            StudentDto student = itr.next();
            if (student.getStudentId() == studentId) {
                System.out.println("Enter new Student Name :");
                String studentName = sName.nextLine();
                System.out.println("Enter new Student Faculty :");
                String studentFaculty = sFaculty.nextLine();
                itr.set(new StudentDto(studentId, studentName, studentFaculty));
                found = true;
            }
        }
        if (!found) {
            System.out.println("Record Not Found");
        } else {
            System.out.println("Record Updated Successfully");
        }
        "-".repeat(20);
    }*/
}


