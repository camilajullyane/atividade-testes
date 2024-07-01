package mathexemples;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class MathExamples 
{
    public static void main( String[] args )
    {
        int intNumA = 5;
        int intNumB = 3;
        double dblNumC = 5.2d;
        double dblNumD = 3.1d;
        double dblNumE = 0.1f;
        double dblNumF = 0.2f;
        double dblNumG = -9f;

        RoundingMode rmHalfUp = RoundingMode.HALF_UP;
        BigDecimal bdNumE = new BigDecimal (0.1).setScale(1, rmHalfUp);
        BigDecimal bdNumF = new BigDecimal (0.2).setScale(1, rmHalfUp);



        System.out.println(intNumA + " + " +  intNumB + " = " + add(intNumA,intNumB));
        System.out.println(intNumA + " x " + intNumB + " = "+ multiply(intNumA,intNumB));
        System.out.println(intNumA +  " - " + intNumB + " = " + subtract(intNumA,intNumB));
        System.out.println(intNumA +  " mod " + intNumB + " = " + modulo(intNumA,intNumB));
        System.out.println(intNumA +  " to the power of " + intNumB + " = " + exponent(intNumA,intNumB));
        System.out.println(dblNumC + " + " + dblNumD + " = " + add(dblNumC,dblNumD));
        System.out.println(dblNumE + " + " + dblNumF + " = " + add(dblNumE, dblNumF));
        System.out.println((0.1f == 0.1d));
        System.out.println(bdNumE + " + " + bdNumF + " = " + add(bdNumE, bdNumF));
        System.out.println("The cube root of " + dblNumC + " = " + cubeRoot(dblNumC));
        System.out.println("The absolute value of " + dblNumC + " = " + absoluteVal(dblNumC));
        System.out.println("The absolute value of " + dblNumG + " = " + absoluteVal(dblNumG));
    }

    public static int add(int intNum1, int intNum2) {
        return intNum1 + intNum2;
        }

    public static int multiply(int intNum1, int intNum2) {
        return intNum1 * intNum2;     
        }
    
    public static int subtract(int intNum1, int intNum2) {
        return intNum1 - intNum2;
    }

    public static int modulo(int intDividend, int intDivisor) {
        return intDividend % intDivisor;
    }

    public static int exponent(int base, int power) {
        return (int) Math.pow(base, power);
    }
    
    public static BigDecimal add(BigDecimal bdNum1, BigDecimal bdNum2) {
        return bdNum1.add(bdNum2);
    }

    public static Double add(double dblNum1, double dblNum2) {
        return dblNum1 + dblNum2;
    }

    public static double cubeRoot(double number) {
        return Math.cbrt(number);    
     }

     public static double absoluteVal(double number) {
        return Math.abs(number);  
    }
}
