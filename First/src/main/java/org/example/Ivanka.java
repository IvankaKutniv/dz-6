package org.example;

public class Ivanka {
    private String profession;
    private int experience;

    Ivanka (String profession, int experience) {
        this.profession = profession;
        this.experience = experience;
    }

    public String getProfession() {
        return profession;
    }

    public int getExperience() {
        return experience;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }
}
