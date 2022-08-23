package io.extact.maven.sample.multiple;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import io.extact.maven.sample.Calculator;

class MultipleOperatorTest {

    private Calculator ope = new MultipleOperator();

    @Test
    void test() {
        var actual = ope.calculate(6, 3);
        assertThat(actual).isEqualTo(18);
    }
}
