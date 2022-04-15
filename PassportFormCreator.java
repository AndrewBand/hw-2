import java.util.Scanner;


public class PassportFormCreator  {
    public void createForms(){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String sename = scanner.nextLine();
        int ageINyeare = scanner.nextInt();
        scanner.close();
        System.out.println(name + " " + sename + " " + ageINyeare*10);
        System.out.println(name.toUpperCase());
        System.out.println(sename.toUpperCase());
        System.out.println(ageINyeare*10);
    }

    public static void main (String[] args) throws Exception{

        PassportFormCreator passportFormCreator = new PassportFormCreator();
        passportFormCreator.createForms();
    }
}
