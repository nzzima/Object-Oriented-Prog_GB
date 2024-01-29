package org.example.market;

import java.util.SortedMap;

public class User {
    private String login;
    private int pass;
    private Basket basket;

    public User(String login, int pass, Basket basket) {
        this.login = login;
        this.pass = pass;
        this.basket = basket;
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public int getPass() {
        return pass;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    /**
     * Метод покупки выбранного товара пользователем (Добавление товара в корзину
     * и удаление из категории товаров). Если желаемого товара не существует, то
     * выводится сообщение в консоль об отсутствии товара в магазине
     * @param name Название выбранного товара
     */
    public void buy(String name, Category category) {
        for (Product product : category.getProducts()) {
            if (product.getName().equals(name)) {
                basket.add(product);
                category.remove(product);
                System.out.println(login + " buy " + product.getName());
                return;
            }
        }
        System.out.println(login + " tries to buy " + name + " but the product does not exist");
    }

    @Override
    public String toString() {
        return "User{" +
                "login = '" + login + '\'' +
                ", pass = " + pass +
                ", basket = " + basket +
                '}';
    }
}
