package org.example;

public class Main {
    public static void main(String[] args) {
        Double[] array1 = {1.0, 2.0, 3.0, 4.0};

        BoxWithNumbers<Double> numbers1 = new BoxWithNumbers<>(array1);
        System.out.println("numbers1.average() = " + numbers1.average());

        Double[] array2 = {5.0, 6.0, 7.0};
        BoxWithNumbers<Double> numbers2 = new BoxWithNumbers<>(array2);

        Double average1 = numbers1.average();
        Double average2 = numbers2.average();

        System.out.println("numbers2.average() = " + numbers2.average());
        System.out.println("numbers1.compareAverage(average1, average2) = " + numbers1.compareAverage(average1, average2));

        Integer[] boxInt = {1,2,3, 100};
        BoxWithNumbers<Integer> numbers3 = new BoxWithNumbers<>(boxInt);

        System.out.println("numbers3.average() = " + numbers3.average());

        String[] box4 = {"qwe", "fgh"};
        //BoxWithNumbers<String> str = new BoxWithNumbers<>(box4);

        System.out.println("numbers2.compareAverage(numbers3) = " + numbers2.compareAverage(numbers3));
        //System.out.println("str.compareAverage(numbers1) = " + str.compareAverage(numbers1));
    }
}