package fr.eseo.dis.couroulu.android_eseo_project.Data;

/**
 * Created by Loulou on 20/12/2017.
 */

public class User {
    private int idUser;
    private String username;
    private String surname;
    private String forename;
    private String salt;
    private String password;


    public int getIdUser() {
        return idUser;
    }

    public String getForename() {
        return forename;
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public String getSalt() {
        return salt;
    }

    public String getSurname() {
        return surname;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
