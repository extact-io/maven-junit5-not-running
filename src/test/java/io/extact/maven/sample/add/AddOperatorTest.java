package io.extact.maven.sample.add;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import io.extact.maven.sample.Calculator;

class AddOperatorTest {

    private Calculator ope = new AddOperator();

    @Test
    void test() {
        var actual = ope.calculate(6, 3);
        assertThat(actual).isEqualTo(9);
    }
}
