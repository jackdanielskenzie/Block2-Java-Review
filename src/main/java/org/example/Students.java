package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Students {
    @JsonProperty("city")
    private String city;
    @JsonProperty("age")
    private String age;
    @JsonProperty("lastname")
    private String lastname;
    @JsonProperty("firstname")
    private String firstname;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}
