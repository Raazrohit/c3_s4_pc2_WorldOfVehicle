public class Electrical extends Engine {

    private String batteryType;

    public Electrical(long modelNo, int maxPower, int maxRpm, String batteryType) {
        super(modelNo, maxPower, maxRpm);
        this.batteryType = batteryType;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public void setBatteryType(String batteryType) {
        this.batteryType = batteryType;
    }
}
