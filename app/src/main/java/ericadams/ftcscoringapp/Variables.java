package ericadams.ftcscoringapp;

/**
 * Created by Allison Adams on 12/8/2016.
 */

public class Variables {
    private int CenterCountIntD;
    private int CornerCountIntD;

    private int CornerCountIntA;
    private int CenterCountIntA;
    private int BeaconScoreIntA = 0;
    private int ParkedScoreIntA = 0;
    private int CornerScoreIntA = 0;
    private int CenterScoreIntA = 0;
    private int CapballScoreIntA = 0;

    private int DriverScoreIntD;
    private int CenterScoreIntD;
    private int CornerScoreIntD;

    private int EndScoreIntE;
    private int CapballScoreIntE;
    private int BeaconScoreIntE;


    public int getCenterCountIntD() {
        return CenterCountIntD;
    }

    public void setCenterCountIntD(int centerCountIntD) {
        CenterCountIntD = centerCountIntD;
    }
    public void incrementCornerCountIntD(){
        CornerCountIntD = CornerCountIntD + 1;
    }
    public void decrementCornerCountIntD(){
        CornerCountIntD = CornerCountIntD - 1;
    }
    public void incrementCenterCountIntD(){
        CenterCountIntD = CenterCountIntD + 1;
    }
    public void decrementCenterCountIntD(){
        CenterCountIntD = CenterCountIntD - 1;
    }

    public int getCornerCountIntD() {
        return CornerCountIntD;
    }

    public void setCornerCountIntD(int cornerCountIntD) {
        CornerCountIntD = cornerCountIntD;
    }

    public int getCornerCountIntA() {
        return CornerCountIntA;
    }

    public void setCornerCountIntA(int cornerCountIntA) {
        CornerCountIntA = cornerCountIntA;
    }
    public void decrementCenterCountIntA(){
        CornerCountIntA = CornerCountIntA - 1;
    }
    public void incrementCenterCountIntA(){
        CenterCountIntA = CenterCountIntA + 1;
    }

    public int getCenterCountIntA() {
        return CenterCountIntA;
    }

    public void setCenterCountIntA(int centerCountIntA) {
        CenterCountIntA = centerCountIntA;
    }

    public int getAutoScoreIntA() {
        return ((CornerCountIntA * 5) + (CenterCountIntA * 15) + BeaconScoreIntA + ParkedScoreIntA + CapballScoreIntA);
    }


    public int getBeaconScoreIntA() {
        return BeaconScoreIntA;
    }

    public void setBeaconScoreIntA(int beaconScoreIntA) {
        BeaconScoreIntA = beaconScoreIntA;
    }

    public int getParkedScoreIntA() {
        return ParkedScoreIntA;
    }

    public void setParkedScoreIntA(int parkedScoreIntA) {
        ParkedScoreIntA = parkedScoreIntA;
    }

    public int getCornerScoreIntA() {
        return CornerScoreIntA;
    }

    public void decrementCornerCountIntA(){
        CornerCountIntA = CornerCountIntA - 1;
    }
    public void incrementCornerCountIntA(){
        CornerCountIntA = CornerCountIntA + 1;
    }


    public int getCenterScoreIntA() {
        return CenterScoreIntA;
    }

    public void setCenterScoreIntA(int centerScoreIntA) {
        CenterScoreIntA = centerScoreIntA;
    }

    public int getCapballScoreIntA() {
        return CapballScoreIntA;
    }

    public void setCapballScoreIntA(int capballScoreIntA) {
        CapballScoreIntA = capballScoreIntA;
    }

    public int getDriverScoreIntD() {
        return DriverScoreIntD;
    }

    public void setDriverScoreIntD(int driverScoreIntD) {
        DriverScoreIntD = driverScoreIntD;
    }

    public int getCenterScoreIntD() {
        return CenterScoreIntD;
    }

    public void setCenterScoreIntD(int centerScoreIntD) {
        CenterScoreIntD = centerScoreIntD;
    }

    public int getCornerScoreIntD() {
        return CornerScoreIntD;
    }

    public void setCornerScoreIntD(int cornerScoreIntD) {
        CornerScoreIntD = cornerScoreIntD;
    }

    public int getEndScoreIntE() {
        return EndScoreIntE;
    }

    public void setEndScoreIntE(int endScoreIntE) {
        EndScoreIntE = endScoreIntE;
    }

    public int getCapballScoreIntE() {
        return CapballScoreIntE;
    }

    public void setCapballScoreIntE(int capballScoreIntE) {
        CapballScoreIntE = capballScoreIntE;
    }

    public int getBeaconScoreIntE() {
        return BeaconScoreIntE;
    }

    public void setBeaconScoreIntE(int beaconScoreIntE) {
        BeaconScoreIntE = beaconScoreIntE;
    }

    public int getTotalScoreInt() {
        return (CapballScoreIntE + BeaconScoreIntE) + (CornerCountIntD) + (CenterCountIntD * 5) + ((CornerCountIntA * 5) + (CenterCountIntA * 15) + BeaconScoreIntA + ParkedScoreIntA + CapballScoreIntA);
    }
    public void Reset(){
        CapballScoreIntA = 0;
        CapballScoreIntE = 0;
        BeaconScoreIntE = 0;
        CornerCountIntD = 0;

        CenterCountIntD = 0;

        CornerCountIntA = 0;

        CenterCountIntA = 0;
        BeaconScoreIntA = 0;
        ParkedScoreIntA = 0;
    }

}
