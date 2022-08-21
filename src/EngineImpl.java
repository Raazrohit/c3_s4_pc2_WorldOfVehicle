public class EngineImpl {
    public static void main(String[] args) {
        PetrolEngine object = new PetrolEngine(14525, 450, 1300, 800, 4, "Petrol","High");
        DieselEngine object1 = new DieselEngine(15265, 412, 900, 4500, 2, "Diesel", "Low");
        ElectricEngines object2 = new ElectricEngines(4562, 855, 1500, "Lithium ion", 250);
        GasEngine object3 = new GasEngine(4561, 7500, 1800, 4561, 4, "Gaseous Fuel", "Low");
        object.display();
        System.out.println(" ");
        object1.dispaly();
        System.out.println(" ");
        object2.display();
        System.out.println(" ");
        object3.display();
    }
}