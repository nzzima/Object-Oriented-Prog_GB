package org.example;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void animalInfo() {
        System.out.println("Animal " + name);
    }

    protected void voice() {
        System.out.println("Animal " + name + "voice something");
    }

    protected void jump() {
        System.out.println("Animal " + name + " jumped");
    }
}
