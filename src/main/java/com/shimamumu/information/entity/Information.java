package com.shimamumu.information.entity;

public class Information {
    private int id;
    private String name;
    private String diseasename;

    public Information(int id, String name, String diseasename) {
        this.id = id;
        this.name = name;
        this.diseasename = diseasename;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDiseasename() {
        return diseasename;
    }
}
