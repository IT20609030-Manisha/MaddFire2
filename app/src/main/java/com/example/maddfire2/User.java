package com.example.maddfire2;

public class User {

    private String ID;
    private String name;
    private String address;
    private Integer Contactnumber;

    public User() {
    }

    public User(String ID, String name, String address, Integer contactnumber) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        Contactnumber = contactnumber;
    }

    public User(String name, String address, Integer contactnumber) {
        this.name = name;
        this.address = address;
        Contactnumber = contactnumber;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getContactnumber() {
        return Contactnumber;
    }

    public void setContactnumber(Integer contactnumber) {
        Contactnumber = contactnumber;
    }
}
