public class ManualCar implements Car {

    @Override
    public void run() {
        System.out.println("Speed :)");
    }

    @Override
    public void stop() {
        System.out.println("Stop!");
    }
}
