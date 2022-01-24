package org.zapto.trywithfun.sequentialdigits;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTestCase {

    private final Solution solution = new Solution();

    @Test
    void sequentialDigitsTest() {
        var result = solution.sequentialDigits(100, 300);
        Assertions.assertEquals(2, result.size());
        Assertions.assertEquals(123, result.get(0));
        Assertions.assertEquals(234, result.get(1));

        result = solution.sequentialDigits(1000, 13000);
        Assertions.assertEquals(7, result.size());
        Assertions.assertEquals(1234, result.get(0));
        Assertions.assertEquals(2345, result.get(1));
        Assertions.assertEquals(3456, result.get(2));
        Assertions.assertEquals(4567, result.get(3));
        Assertions.assertEquals(5678, result.get(4));
        Assertions.assertEquals(6789, result.get(5));
        Assertions.assertEquals(12345, result.get(6));
    }
}
