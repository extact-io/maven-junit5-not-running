package io.extact.maven.sample.add;

import io.extact.maven.sample.Calculator;

public class AddOperator implements Calculator {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}
