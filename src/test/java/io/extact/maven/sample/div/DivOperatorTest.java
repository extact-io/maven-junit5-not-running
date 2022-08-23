package io.extact.maven.sample.div;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

import io.extact.maven.sample.Calculator;

public class DivOperatorTest {

    private Calculator ope = new DivOperator();

    @Test
    public void test() {
        var actual = ope.calculate(6, 3);
        assertThat(actual).isEqualTo(2);
    }
}
