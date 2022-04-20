public class ReturnIFreturn {
    public int calculateDistance(int distance){
        if (distance < 0) {
            return distance * -1;
        }

        return distance;
    }
    //Test output
    public static void main(String[] args) {
        //SaveStarShip ship = new SaveStarShip();
        ReturnIFreturn ship = new ReturnIFreturn();

        //Should be 10
        System.out.println(ship.calculateDistance(-2871));
    }
}
