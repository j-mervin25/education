package com.example.sample;

public class Dataclass {

    private String firstname;
    private String lastname;
    private String profile;  // Add this line

    public Dataclass(String firstname, String lastname, String profile) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.profile = profile;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getProfile() {
        return profile;
    }

}
