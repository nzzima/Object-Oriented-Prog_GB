package org.example.market;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Product> purchased;

    public Basket() {
        this.purchased = new ArrayList<>();
    }

    public List<Product> getPurchased() {
        return purchased;
    }

    public void setPurchased(List<Product> purchased) {
        this.purchased = purchased;
    }

    /**
     * Метод добавления товара в массив купленных товаров
     * @param product Купленный товар
     */
    public void add(Product product) {
        purchased.add(product);
    }

    @Override
    public String toString() {
        return "" + purchased;
    }
}

