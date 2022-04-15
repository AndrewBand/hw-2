public class Counter {
    public  long current(long number){
        return number;
    }
    public long next(long number){
        return ++number;
    }
    public long prev(long number){
        return --number;
    }
    public static void main (String[] args){

        Counter ca = new Counter();

        System.out.println("ca.current = " + ca.current(5));
        System.out.println("ca.next = " + ca.next(5));
        System.out.println("ca.prev = " + ca.prev(5));

    }
}
