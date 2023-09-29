package org.example;

public class Person {
    // Encapsulated
    // Class Definition
    // Class Property/Instance Variables
    // Class Members
    // Math.random()
    // Integer.parseInt()

    public static String getPersonDetails() {
        return type;
    }
    static String type = "Zombie";
    public String firstName; // Exposed member
    String lastName;
    String street;
    String city;
    String state;
    private int idNumber;

    // Constructor
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getIdNumber() {
        return this.idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    // Getters and Setters
    // Getter - returns a class variable
    // Setter - updates the value of a class variable
    public String getFullName() { // camelCase
        return this.firstName + " " + this.lastName;
    }
}
