package com.javaweb.demo.models;

public class Student {
    private int id;
    private String name;
    private String address;
    private double point;

    public Student(int id, String name, String address, double point) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.point = point;
    }

    public Student() {
    }

    public Student(String name, String address, double point) {
        this.name = name;
        this.address = address;
        this.point = point;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }
}
