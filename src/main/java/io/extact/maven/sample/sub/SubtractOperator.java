package io.extact.maven.sample.sub;

import io.extact.maven.sample.Calculator;

public class SubtractOperator implements Calculator {
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
