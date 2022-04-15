import java.util.Scanner;

public class MoonComputerTests {

    public void testBasicInputOutput() {
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        System.out.println(scan);
        scanner.close();
        //return scan;
    }

    public void testLogicalOperators() {
        //Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner("false false false");
        boolean b1 = scanner.nextBoolean();
        boolean b2 = scanner.nextBoolean();
        boolean b3 = scanner.nextBoolean();
        boolean AND = b1&&b2&&b3;
        boolean OR = b1||b2||b3;
        System.out.println(AND + " " + OR);
        scanner.close();
    }
    //Test output on Hello Java standard input
    public static void main(String[] args) {
        MoonComputerTests computerTests = new MoonComputerTests();
      //computerTests.testBasicInputOutput();
        computerTests.testLogicalOperators();
      //

    }
}
