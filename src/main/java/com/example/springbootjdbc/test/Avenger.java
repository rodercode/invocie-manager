package com.example.springbootjdbc.test;

import java.util.Arrays;

public class Avenger {

    private String name;
    private int age;
    private String powerSource;

    private final String[] powerSources = {"Magic", "Technology", "Deity", "Training"};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPowerSource() {
        return powerSource;
    }

    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }

    public String[] getPowerSources() {
        return powerSources;
    }

    @Override
    public String toString() {
        return "Avenger{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", powerSource='" + powerSource + '\'' +
                ", powerSources=" + Arrays.toString(powerSources) +
                '}';
    }
}
