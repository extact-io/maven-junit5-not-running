package io.extact.maven.sample.multiple;

import io.extact.maven.sample.Calculator;

public class MultipleOperator implements Calculator {
    @Override
    public int calculate(int a, int b) {
        return a * b;
    }
}
