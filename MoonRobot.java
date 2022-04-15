public class MoonRobot {
    public boolean canOvercomeHole(int holeDepth, int batteryPercent) {
        return holeDepth < 34 || batteryPercent > 67;
    }

    public boolean canJumpOverHill(int hillHeight, int batteryPercent) {
        return hillHeight <= 150 && batteryPercent >= 90;
    }
    public boolean areSensorsOk(boolean isEngineWorking, boolean isRobotStanding){
        //return  (isEngineWorking==true ||isEngineWorking!=true)&& isRobotStanding==false;
        if(isEngineWorking==true && isRobotStanding==false){
            return true;
        }
        if(isEngineWorking==true && isRobotStanding==true){
            return false;
        }
        return true;
    }

    //Test output
    public static void main(String[] args) {
        MoonRobot robot = new MoonRobot();

        //Should be false
        System.out.println("canOvercomeHole(50, 60) = " + robot.canOvercomeHole(50, 60));

        //Should be true
        System.out.println("canJumpOverHill(100, 90) = " + robot.canJumpOverHill(100, 90));

        //Should be false
        System.out.println("areSensorsOk(true, true) = " + robot.areSensorsOk(true, true));
        System.out.println("areSensorsOk(false, true) = " + robot.areSensorsOk(false, true));
        System.out.println("areSensorsOk(false, false) = " + robot.areSensorsOk(false, false));

    }
}

