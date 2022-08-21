public class ElectricEngines extends  Electrical{

    private double voltage;

    public ElectricEngines(long modelNo, int maxPower, int maxRpm, String batteryType, double voltage) {
        super(modelNo, maxPower, maxRpm, batteryType);
        this.voltage = voltage;
    }

    public double getVoltage() {
        return voltage;
    }

    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    public void display(){
        System.out.println("Specifications of Electric Engine : ");
        System.out.println("Model No. = " + getModelNo());
        System.out.println("Max Power = " + getMaxPower());
        System.out.println("Max RPM = " + getMaxRpm());
        System.out.println("Voltage = " + getVoltage());
        System.out.println("Battary Type = " + getBatteryType());
    }
}
