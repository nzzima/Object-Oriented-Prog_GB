package org.example.calculator.service;

import java.util.List;
import java.util.Objects;

public interface SumService {
    String sum(List<? extends Number> numbers);
}
