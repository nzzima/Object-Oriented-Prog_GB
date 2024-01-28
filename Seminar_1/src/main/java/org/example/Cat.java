package org.example;

public class Cat extends Animal{

    private String color;
    private Integer age;

    public Cat(String name, String color, Integer age) {
        super(name);  //Из родительского класса Animal
        this.color = color;
        this.age = age;
    }

    public Cat() {
    }

    public String getColor() {
        return color;
    }

    public Integer getAge() {
        return age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(Integer age) {
        if (age >= 0 && age < 40) {
            this.age = age;
        } else {
            System.out.println("Введенный возраст некорректен! ");
        }
    }

    @Override
    protected void voice() {
        System.out.println(toString() + " Meow");
    }

    @Override
    protected void animalInfo() {
        super.animalInfo();
    }

    @Override
    protected void jump() {
        super.jump();
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + super.getName() + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }

}