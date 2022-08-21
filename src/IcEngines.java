public class IcEngines extends Engine{
    private int displacement;
    private int NumberOfCylinders;

    public IcEngines(long modelNo, int maxPower, int maxRpm, int displacement, int numberOfCylinders) {
        super(modelNo, maxPower, maxRpm);
        this.displacement = displacement;
        NumberOfCylinders = numberOfCylinders;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public int getNumberOfCylinders() {
        return NumberOfCylinders;
    }

    public void setNumberOfCylinders(int numberOfCylinders) {
        NumberOfCylinders = numberOfCylinders;
    }
}
