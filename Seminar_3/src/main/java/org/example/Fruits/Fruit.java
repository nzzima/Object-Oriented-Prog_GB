package org.example.Fruits;

public enum Fruit {
    APPLE("Яблоко"),
    PINAPPLE("Персик"),
    ORANGE("Апельсин"),
    BANANA("Банан"),
    WATERMELON("Арбуз");
    private String nameFruit;

    Fruit(String nameFruit) {
        this.nameFruit = nameFruit;
    }

    public String getNameFruit() {
        return nameFruit;
    }
}
