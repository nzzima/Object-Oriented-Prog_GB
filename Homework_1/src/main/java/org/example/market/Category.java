package org.example.market;

import java.util.List;

public class Category {
    private String name;
    private List<Product> products;

    public Category(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }

    public Category() {}

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    /**
     * Метод добавления товара в категорию
     * @param product Товар
     */
    public void add(Product product) {
        products.add(product);
    }

    /**
     * Метод удаления товара из категории
     * @param product Товар
     */
    public void remove(Product product) {
        products.remove(product);
    }

    @Override
    public String toString() {
        return "\n" +
                name +
                products;
    }
}
