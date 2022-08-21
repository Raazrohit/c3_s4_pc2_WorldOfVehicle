public class Engine {
    private long modelNo;
    private String displacement;
    private int maxPower;
    private int maxRpm;
    private int noOfCylinders;

    public Engine(long modelNo, int maxPower, int maxRpm) {
        this.modelNo = modelNo;
        this.maxPower = maxPower;
        this.maxRpm = maxRpm;
    }

    public long getModelNo() {
        return modelNo;
    }

    public void setModelNo(long modelNo) {
        this.modelNo = modelNo;
    }


    public int getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(int maxPower) {
        this.maxPower = maxPower;
    }

    public int getMaxRpm() {
        return maxRpm;
    }

    public void setMaxRpm(int maxRpm) {
        this.maxRpm = maxRpm;
    }

}
