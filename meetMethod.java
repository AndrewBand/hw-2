public class meetMethod {
    public int sum(int a, int b){
        return a+b;
    }
    public float twice(float num) {
        return num/(0.5f);
    }
    public int twicedSum(int  a , int b){
        //int d = sum();
        return 2*sum( a, b);
    }

    public int S = 3;
    public static void main (String[] args){
        meetMethod me = new meetMethod();
        System.out.println(me.sum(9,7));
        //System.out.println(S);
        System.out.println(me.twice(7));
        System.out.println(me.twicedSum(4 , 5));



    }
}
