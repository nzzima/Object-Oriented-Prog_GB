package org.example.market;

import java.beans.beancontext.BeanContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Product> dairies = new ArrayList<>(Arrays.asList(
                new Product("Milk", 35, 8.0),
                new Product("Yogurt", 25, 7.5)
        ));
        Category dairy = new Category("Dairy products", dairies); //Молочные изделия

        List<Product> meats = new ArrayList<>(Arrays.asList(
                new Product("Chicken", 120, 7.5),
                new Product("Beef", 230, 9.0),
                new Product("Pork", 160, 8.5)
        ));
        Category meat = new Category("Meat products", meats); //Мясные изделия

        List<Product> drinks = new ArrayList<>(Arrays.asList(
                new Product("Juice", 55, 7.0),
                new Product("Soda", 65, 6.5)
        ));
        Category drink = new Category("Drinks", drinks); //Напитки
        drink.add(new Product("Water", 20, 9.0));

        System.out.println("-------------------MARKET BEFORE PURCHASES-------------------"); //Каталог товаров до покупок
        System.out.println(dairy);
        System.out.println(meat);
        System.out.println(drink);
        System.out.println("-------------------------------------------------------------");

        User Michael = new User("Michael", 12345, new Basket());
        User Kate = new User("Kate", 67890, new Basket());

//        System.out.println(Michael);
//        System.out.println(Kate);


        System.out.println("------------------PURCHASES-----------------"); //Покупки
        Michael.buy("Beef", meat);
        Kate.buy("Juice", drink);
        Kate.buy("Beef", meat);
        Michael.buy("Water", drink);
        System.out.println("--------------------------------------------");

        System.out.println(Michael);
        System.out.println(Kate);

        System.out.println("-------------------MARKET AFTER PURCHASES-------------------"); //Каталог товаров после покупок
        System.out.println(dairy);
        System.out.println(meat);
        System.out.println(drink);
        System.out.println("-------------------------------------------------------------");
    }
}
