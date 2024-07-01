package mathexemples;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class MathExamplesTest 
{
   
    @Test
    void testAdd()
    {
        assertEquals(8, MathExamples.add(5,3));
    }

    @Test
    void testMultiply() 
    {
        assertEquals(15, MathExamples.multiply(5,3));
    }

    @Test
    void testSubtract() {
        assertEquals(2, MathExamples.subtract(5, 3));
    }

    @Test
    void testModulo() {
        assertEquals(2, MathExamples.modulo(5, 3));
    }

    @Test
    void testExponent() {
        assertEquals(125, MathExamples.exponent(5, 3));
    }
}
