public class MoonRobotVespenGasDetector {

    public boolean isAcidOk(int acidValue, int minAcid, int maxAcid){
        return acidValue>=minAcid && acidValue<=maxAcid;
    }
    public boolean isDensityOk(int density){
        return 1000<=density && density<=5000 || 10000<=density && density<=15000;
    }
    public boolean isTemperatureOk(boolean cold){
        return cold==false;
    }

    public boolean isGroundOkForVespenGas(int acidValue, int minAcid, int maxAcid, int density, boolean cold){

        //   MoonRobotVespenGasDetector rv = new MoonRobotVespenGasDetector();
        //return (acidValue>=minAcid && acidValue<=maxAcid) && ( 1000<=density && density<=5000 || 10000<=density && density<=15000) && (cold==false);
        return isAcidOk( acidValue,  minAcid,  maxAcid) && isDensityOk( density) && isTemperatureOk(cold);
    }

    public static void main (String[] args){
        MoonRobotVespenGasDetector rv = new MoonRobotVespenGasDetector();

        System.out.println("isAcidOk(100, 50, 150) = " + rv.isAcidOk(100, 50, 150));
        System.out.println("isDensityOk(1500) = " + rv.isDensityOk(1500));
        System.out.println("isDensityOk(3000) = " + rv.isDensityOk(3000));
        System.out.println("isTemperatureOk(false) = " + rv.isTemperatureOk(false));
        System.out.println("isGroundOkForVespenGas(120, 75, 150, 7500, false) = " + rv.isGroundOkForVespenGas(120, 75, 150, 7500, false));

    }

}
