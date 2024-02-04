package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BoxWithNumbers<T extends Number> {
    private T[] array;

    public BoxWithNumbers(T[] array) {
        this.array = array;
    }

    public Double average() {
        Double res = 0.0;
        for (int i = 0; i < array.length; i++) {
            res += (Double) array[i].doubleValue();
        }
        res = res / array.length;
        return res;
    }
    public boolean compareAverage(BoxWithNumbers<? extends Number> box2){
        return average() > box2.average();
    }

    public boolean compareAverage(Double average1, Double average2){
        return average1 > average2;
    }
}
