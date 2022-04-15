import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        String b = scanner.next();

        System.out.println(a + " , " + b);
        scanner.close();

        scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        System.out.println(x);
    }
}
