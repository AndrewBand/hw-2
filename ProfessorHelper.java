class ProfessorHelper {
    public boolean areNumbersCool(int number1, int number2) {
        return number1 == number2;
    }
    public boolean areNumbersFatal(int first, int second){
        return ((first*5)+3)!=second ;
    }

    //Test output
    public static void main(String[] args) {
        ProfessorHelper helper = new ProfessorHelper();
        System.out.println("areNumbersCool(3, 3) = " + helper.areNumbersCool(65, 55)); //Should be true
        System.out.println("areNumbersFatal(1, 8) = " + helper.areNumbersFatal(65, 55)); //Should be true
        System.out.println("areNumbersFatal(1, 8) = " + helper.areNumbersFatal(20, 50)); //Should be true
        System.out.println("areNumbersFatal(1, 8) = " + helper.areNumbersFatal(10, 53)); //Should be true
    }
}