public class MarsEarthHelper {
    public int convertAppleCount(float count){
        return (int) count;
    }
    public static void main(String[] args) {
        MarsEarthHelper helper = new MarsEarthHelper();

        //Should be 10
        System.out.println("convertAppleCount(10f) = " + helper.convertAppleCount(10f));

        float v = 10.99999f;
        String r = String.format("%.2" ,v);
        System.out.println(r);
    }
}