package io.extact.maven.sample.div;

import io.extact.maven.sample.Calculator;

public class DivOperator implements Calculator {
    @Override
    public int calculate(int a, int b) {
        return a / b;
    }
}
