public class ExonNames {
    public boolean areNamesEqual(String name1, String name2){
        return name1.equals(name2);
    }
    public String makeFullName(String firstName, String lastName){
        return String.join(" " , firstName.toLowerCase() , lastName.toUpperCase() );
    }
    public boolean isNameLucky(String name){
        return name.toLowerCase().contains("a") || name.toUpperCase().contains("A") || name.toLowerCase().contains("o") || name.toUpperCase().contains("O");
    }
    public String getNameCode(String name){
        return String.valueOf(name.toUpperCase().charAt(0))+String.valueOf(name.toUpperCase().charAt(name.length()-1));
    }
    public boolean isMoneyName(String name){
        return
                        name.charAt(0) >= '0' &&
                        name.charAt(0)<='9' &&
                        name.charAt(name.length() - 1) >='0' &&
                        name.charAt(name.length() - 1) <='9'
                ;
    }
    public boolean isInvisibleName(String name){
        return
                name.strip().length() ==0
                ;
    }
    public String makeNamePositive(String name){
        return
                name.replace("no","yes").replace("No","Yes").replace("nO","yes").replace("NO","YES")
        ;
    }
    public String makeHalfOfName(String name){
        return name.substring(0, (int)(name.length()/2));
    }

    //Test output
    public static void main(String[] args) {
        ExonNames names = new ExonNames();

        //Should be true
        boolean namesEqual = names.areNamesEqual("nm", "nm");
        System.out.println("names.areNamesEqual(\"nm\", \"nm\") = " + namesEqual);

        //Should be "exor BIGO"
        String fullName = names.makeFullName("exor", "bigo");
        System.out.println("names.makeFullName(\"exor\", \"bigo\") = " + fullName);

        //Should be true
        boolean isNameLucky = names.isNameLucky("Bigo");
        System.out.println("names.isNameLucky(\"Bigo\") = " + isNameLucky);

        String nameCode = names.getNameCode("boRA");
        System.out.println("names.getNameCode(\"boRA\") = " + nameCode);

        System.out.println("getNameCode(\"xds\") = " + names.getNameCode("x"));

        boolean isMoneyName = names.isMoneyName("31Boss31");
        System.out.println("names.isMoneyName(" + isMoneyName + ") = " + isMoneyName);

        String invisibleName = "\ndfg";
        boolean isInvisible = names.isInvisibleName(invisibleName);
        System.out.println("names.isInvisibleName(" + invisibleName + ") = " + isInvisible);
        System.out.println("invisibleName = " + invisibleName);

        String positive = names.makeNamePositive("NoMont");
        System.out.println("names.makeNamePositive(\"NoMont\") = " + positive);

        String halfOfName = names.makeHalfOfName("Gurk");
        System.out.println("names.makeHalfOfName(\"Gurk\") = " + names.makeHalfOfName("Gurk"));

        System.out.println("============================================");
    }
}