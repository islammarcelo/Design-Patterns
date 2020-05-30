public class Client {
    public static void main(String[] args){
        Car manualCar = new ManualCar();
        Car autoCar = new AutoCarAdapter(new AutoCar());

        driver(manualCar);
        driver(autoCar);
    }

    private static void driver(Car manualCar) {
        manualCar.run();
        manualCar.stop();
    }
}
