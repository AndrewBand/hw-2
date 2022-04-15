import java.math.BigDecimal;

public class MarsCalculator {

    public int sum(int a , int b, int c){
        return a+b+c;
    }
    public int sub(int  a, int b, int c){
        return a-b-c;
    }
    public int multiply(int a, int b, int c){
        return sum(a , b, c)*sub(a , b, c);
    }
    public float divide(int a, int b, int c){
        return sum(a , b, c)/10f;
    }
    public static void main (String[] args){

        float x = (float) -58888888888888999999999999999999999999988888888888.5d;
        System.out.println("x = " + x);

        int i = (int) 555555555555555551L;
        System.out.println("i = " + i);

        int intValue = (int) 5.7d;
        System.out.println("intValue = " + intValue);

        System.out.println("Math.round(5.7d) = " + Math.round(5.7d));

        float fValue = 0.3f + 0.3f + 0.1f + 0.2f;
        System.out.println("fValue = " + fValue);

        BigDecimal bdResult =
                new BigDecimal("0.3")
                        .add(new BigDecimal("0.3"))
                        .add(new BigDecimal("0.1"))
                        .add(new BigDecimal("0.2"));
        System.out.println("bdResult = " + bdResult);

        MarsCalculator me = new MarsCalculator();
        System.out.println("sum = "+ me.sum(1,2 , 3));
        System.out.println("sub = "+ me.sub(1,2 , 3));
        System.out.println("multiply = "+ me.multiply(1,2 , 3));
        System.out.println("divide = "+ me.divide(1,2 , 3));
    }
}
