package mathexemples;


public class MathExamples 
{
    public static void main( String[] args )
    {
        int intNumA = 5;
        int intNumB = 3;

        System.out.println(intNumA + " + " +  intNumB + " = " + add(intNumA,intNumB));
        System.out.println(intNumA + " x " + intNumB + " = "+ multiply(intNumA,intNumB));
    }

    public static int add(int intNum1, int intNum2) {
        return intNum1 + intNum2;
        }

    public static int multiply(int intNum1, int intNum2) {
        return intNum1 * intNum2;     
        }
}
