public class ProfShop {
    public boolean isPriceOk(int price){
        return price!=1000;
    }
    public float calculateRegularDiscountPrice(float price){
        return price*0.9f;
    }
    public boolean isDiscount50(int price){
        return 4*price == 1000;
    }
    public boolean isPriceHappy(int price, int year, int day){
        return year*day == price;
    }

    public static void main (String[] args){
        ProfShop ps = new ProfShop();
        System.out.println("isPriceOk(1500) = " + ps.isPriceOk(1500));
        System.out.println("calculateRegularDiscountPrice(1500) = " + ps.calculateRegularDiscountPrice(1500));
        System.out.println("isDiscount50(256) = " + ps.isDiscount50(256));
        System.out.println("isPriceHappy(23700, 3950, 6) = " + ps.isPriceHappy(23700, 3950, 6));

    }
}
