import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class charTest {
    public static void main(String[] args) {
        char numASCII = 'F';
        System.out.println(numASCII);

        int X = 23;
        boolean javaAfter20 = true;
        boolean javaOpposite = !javaAfter20;

        System.out.println("javaAfter20 = " + javaAfter20);

        int A = 31+30+31+30+31+30+31+30+31;
        System.out.println("A = "+A);

        long yearSecondCount = 365*24*60*60L;
        System.out.println("yearSecondCount = " + yearSecondCount);

        float s = 10f;
        float quarterOfMayDayCount = (float) (Math.floor((31f/4)*s)/s);
        System.out.println("quarterOfMayDayCount = "+quarterOfMayDayCount);

        float quarterOfMayDayCount1 = 31.455f ;
        System.out.println("quarterOfMayDayCount1_0 = " + quarterOfMayDayCount1);
        System.out.println("quarterOfMayDayCount1 = " + Math.round(quarterOfMayDayCount1));

        //MathContext context = new MathContext(5 , );
/*
        DecimalFormat df = new DecimalFormat("#.#");

        df=2.1f;
        float floatUPdf = 25f;
        System.out.println("df = " + df());
 */
float value = 31f;
BigDecimal bDes = new BigDecimal(value/4);
bDes = bDes.setScale(1 , RoundingMode.UP);
        System.out.println("bDes = "+bDes);


        double doublrVal = 0.3 + 0.3 + 0.1 + 0.2;
        System.out.println("doublrVal = " + doublrVal);


    }
}
