package com.example.maddfire2;

public class Student {
    private String ID ;
    private  String name;
    private String address;
    private int conNo ;

    public Student() {
    }

    /*public Student(String ID, String name, String address, int conNo) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.conNo = conNo;
    }*/

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

    public int getConNo() {
        return conNo;
    }

    public void setConNo(int conNo) {
        this.conNo = conNo;
    }
}
