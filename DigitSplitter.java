public class DigitSplitter {
    public int getFirstDigit(int number){
        return number/10;
    }
    public int getSecondDigit(int number){
        return number-(getFirstDigit(number)*10);
    }
    public static void main (String[] args){
        DigitSplitter ds = new DigitSplitter();
        int number = 15;

        System.out.println("getFirstDigit(" + number + ") = " + ds.getFirstDigit(number));
        System.out.println("getSecondDigit(" + number + ") = " + ds.getSecondDigit(number));
    }
}
