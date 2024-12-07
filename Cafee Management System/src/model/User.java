/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Hp
 */
public class User {
   private int id;
   private String name;
   private String email;
   private String mobleNumber;
   private String adress;
   private String password;
   private String securityQustion;
   private String anser;
   private String status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobleNumber() {
        return mobleNumber;
    }

    public void setMobleNumber(String mobleNumber) {
        this.mobleNumber = mobleNumber;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSecurityQustion() {
        return securityQustion;
    }

    public void setSecurityQustion(String securityQustion) {
        this.securityQustion = securityQustion;
    }

    public String getAnser() {
        return anser;
    }

    public void setAnser(String anser) {
        this.anser = anser;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
   
}
