package com.company;

public class User {

    int[] id = new int[3];
    String[] login = new String[3];
    String[] password = new String[3];

    public User(int array, int id, String login, String password) {
        this.id[array] = id;
        this.login[array] = login;
        this.password[array] = password;

        System.out.println("id = " + this.id[array] +
                "; логин = " + this.login[array] +
                "; password = " + this.password[array]);
    }

    public static void main(String[] args) {
        User first = new User(0, 5, "admin", "abc");
        User second = new User(1, 2, "Maks", "12345");
        User third = new User(2, 1, "Luck", "Maks045");
    }
}
