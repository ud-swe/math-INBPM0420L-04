package math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FractionTest {

    private void assertFraction(int expectedNumerator, int expectedDenominator, Fraction actual) {
        assertAll("fraction",
                () -> assertEquals(expectedNumerator, actual.getNumerator(), "Invalid numerator"),
                () -> assertEquals(expectedDenominator, actual.getDenominator(), "Invalid denominator")
        );
    }

    @Test
    public void testFractionIntInt() {
        fail();
    }

    @Test
    public void testFractionInt() {
        fail();
    }

    @Test
    public void testAddInt() {
        fail();
    }

    @Test
    public void testSubtractInt() {
        fail();
    }

    @Test
    public void testMultiplyInt() {
        // TODO (TJ7DFK)
        fail();
    }

    @Test
    public void testDivideInt() {
        // TODO (BZNJWP)
        fail();
    }

    @Test
    public void testPow() {
        // TODO (KO981Y)
        fail();
    }

    @Test
    public void testAddFraction() {
        // TODO (TOZF9M)
        fail();
    }

    @Test
    public void testSubtractFraction() {
        // TODO (UW7GG6)
        fail();
    }

    @Test
    public void testDivideFraction() {
        // TODO (FXCGCX)
        fail();
    }

    @Test
    public void testMultiplyFraction() {
        // TODO (KY8HK3)
        fail();
    }

    @Test
    public void testReciprocal() {
        // TODO (GFD8XO)
        fail();
    }

    @Test
    public void testAbs() {
        // TODO (BQYCKN)
        fail();
    }

    @Test
    public void testIsZero() {
        // TODO (BQYCKN)
        fail();
    }

    @Test
    public void testReduce() {
        // TODO (OX3YA0)
        fail();
    }

    @Test
    public void testToString() {
        // TODO (HG6IYU)
        fail();
    }

    @Test
    public void testByteValue() {
        fail();
    }

    @Test
    public void testDoubleValue() {
        // TODO (O2VTJT)
        fail();
    }

    @Test
    public void testFloatValue() {
        // TODO (O2VTJT)
        fail();
    }

    @Test
    public void testIntValue() {
        // TODO (H2P5YM)
        fail();
    }

    @Test
    public void testLongValue() {
        // TODO (H2P5YM)
        fail();
    }

    @Test
    public void testShortValue() {
        fail();
    }

    @Test
    public void testClone() {
        // TODO (B0G7OP)
        fail();
    }

    @Test
    public void testHashCode() {
        fail();
    }

    @Test
    public void testEquals() {
        // TODO (DOKP92)
        fail();
    }

}
