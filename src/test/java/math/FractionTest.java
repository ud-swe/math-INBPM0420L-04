package math;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
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
        assertFraction(1, 4, new Fraction(1, 4));
        assertFraction(-13, 27, new Fraction(13, -27));
        assertFraction(5, 7, new Fraction(-5, -7));
        assertFraction(4, 2, new Fraction(4, 2));
        ArithmeticException e = assertThrows(ArithmeticException.class, () -> new Fraction(11, 0));
        assertEquals("Division by zero", e.getMessage());
    }

    @Test
    public void testFractionInt() {
        assertFraction(0, 1, new Fraction(0));
        assertFraction(3, 1, new Fraction(3));
        assertFraction(-13, 1, new Fraction(-13));
    }

    @Test
    public void testAddInt() {
        Fraction f = new Fraction(13, 7);
        assertFraction(27, 7, f.add(2));
        assertFraction(-1, 7, f.add(-2));
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
        Fraction f = new Fraction(1, 3);
        Fraction g = new Fraction(2, 3);
        assertFraction(3, 3, f.add(g));
        assertFraction(3, 3, g.add(f));

        Fraction h = new Fraction(23, 74);
        Fraction i = new Fraction(32, 42);
        assertFraction(3334, 3108, h.add(i));
        assertFraction(3334, 3108, i.add(h));

        Fraction j = new Fraction(-70, 30);
        Fraction k = new Fraction(32, 65);
        assertFraction(-3590, 1950, j.add(k));
        assertFraction(-3590, 1950, k.add(j));
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
    @DisplayName("Some fails, but not me!")
    public void testReduce() {
        // TODO (OX3YA0)
        Fraction test1 = new Fraction(8,4);
        Fraction test2 = new Fraction(-9,3);
        Fraction test3 = new Fraction(16,-4);
        Fraction test4 = new Fraction(-25,-5);
        Fraction test5 = new Fraction(7,5);
        Fraction test6 = new Fraction(-2, 3);
        Fraction test7 = new Fraction(7, -11);
        Fraction test8 = new Fraction(-13, -23);

        assertFraction(2,1, test1.reduce());
        assertFraction(-3,1, test2.reduce());
        assertFraction(-4,1, test3.reduce());
        assertFraction(5,1, test4.reduce());
        assertFraction(7, 5, test5.reduce());
        assertFraction(-2, 3, test6.reduce());
        assertFraction(-7, 11, test7.reduce());
        assertFraction(13, 23, test8.reduce());
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
