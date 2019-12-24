package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            age = 0;
            this.age = age;
        }
        this.age = age;
    }

    public boolean isTeen() {
        return age > 12 && age < 20;
    }

    public String getFullName() {
        if (getFirstName().isEmpty() && getLastName().isEmpty()) {
            return "";
        }
        if (getLastName().isEmpty()) {
            return getFirstName();
        }
        if (getFirstName().isEmpty()) {
            return getLastName();
        }
        return getFirstName() + " " + getLastName();
    }
}
