package com.choucairtesting.demo.opencart.models;

public class loginModels {

    String user;
    String pass;

    public loginModels(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }


    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }
}
