package com.nemil.springaop.AroundAnnotation_SpringProxy;

public class Passenger {

    private int id;
    private String Name;

    @Override
    public String toString() {
        return "Passenger{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
