package com.company;

public class Product {
    int id;
    String name;
    String detail;
    String instructor;

    public Product(){}

    public Product(int id, String name, String detail, String instructor) {
        this();
        this.id = id;
        this.name = name;
        this.detail = detail;
        this.instructor = instructor;
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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }
}
