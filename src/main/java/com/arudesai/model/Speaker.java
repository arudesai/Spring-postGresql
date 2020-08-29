package com.arudesai.model;

public class Speaker {


    private String firstName;
    private String listName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String toString() {
        return "Speaker{" +
                "firstName='" + firstName + '\'' +
                ", listName='" + listName + '\'' +
                '}';
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }
}
