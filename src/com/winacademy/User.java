package com.winacademy;

public class User {

        protected int id;
        protected String nom,prenom,tel,mail,password;
        protected int role;
        public User(String nom,String prenom,String tel,String mail,String password,int role) {
            this.nom=nom;
            this.prenom=prenom;
            this.tel=tel;
            this.mail=mail;
            this.password=password;
            this.role=role;

        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getNom() {
            return nom;
        }
        public void setNom(String nom) {
            this.nom = nom;
        }
        public String getPrenom() {
            return prenom;
        }
        public void setPrenom(String prenom) {
            this.prenom = prenom;
        }
        public String getTel() {
            return tel;
        }
        public void setTel(String tel) {
            this.tel = tel;
        }
        public String getMail() {
            return mail;
        }
        public void setMail(String mail) {
            this.mail = mail;
        }
        public String getPassword() {
            return password;
        }
        public void setPassword(String password) {
            this.password = password;
        }
        public int getRole() {
            return role;
        }
        public void setRole(int role) {
            this.role = role;
        }




}
