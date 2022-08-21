public class DieselEngine extends IcEngines{

    private String fuelType;
    private String emission;

    public DieselEngine(long modelNo, int maxPower, int maxRpm, int displacement, int numberOfCylinders, String fuelType, String emission) {
        super(modelNo, maxPower, maxRpm, displacement, numberOfCylinders);
        this.fuelType = fuelType;
        this.emission = emission;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getEmission() {
        return emission;
    }

    public void setEmission(String emission) {
        this.emission = emission;
    }

    public void dispaly(){
        System.out.println("Specifications of Diesel Engine : ");
        System.out.println("Model No. = " + getModelNo());
        System.out.println("Max Power = " + getMaxPower());
        System.out.println("Max RPM = " + getMaxRpm());
        System.out.println("Displacement = " + getDisplacement());
        System.out.println("No. Of Cylinders = " + getNumberOfCylinders());
        System.out.println("fuelType = " + getFuelType());
        System.out.println("emission = " + getEmission());
    }
}