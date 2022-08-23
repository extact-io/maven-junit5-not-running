package io.extact.maven.sample.sub;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import io.extact.maven.sample.Calculator;

class SubtractOperatorTest {

    private Calculator ope = new SubtractOperator();

    @Test
    void test() {
        var actual = ope.calculate(6, 3);
        assertThat(actual).isEqualTo(3);
    }
}
