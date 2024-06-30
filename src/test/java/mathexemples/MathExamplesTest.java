package mathexemples;

import static org.junit.Assert.assertTrue;
// import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MathExamplesTest 
{
   
    @Test
    void testAdd()
    {
        assertEquals(8,MathExamples.add(5,3));
    }
}
