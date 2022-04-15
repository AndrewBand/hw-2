public class MarsValueConverter {

    public int changeMoneyAmount(float startAmount, float toRemove){
        return (int)(startAmount - toRemove);
    }
    public byte calculateMoneySum(int sum1, int sum2){
        return (byte)(sum1+sum2);
    }
    public short halfOfMoney(double startMoney){
        return (short)(startMoney/2);
    }


    public static void main(String[] args) {
        MarsValueConverter mc = new MarsValueConverter();
        System.out.println("changeMoneyAmount(100f, 40.5f) =" + mc.changeMoneyAmount(100f, 40.5f));
        System.out.println("calculateMoneySum(50, 40) = " + mc.calculateMoneySum(50, 40));
        System.out.println("halfOfMoney(1000.9999) = " + mc.halfOfMoney(1000.9999));

    }
}
