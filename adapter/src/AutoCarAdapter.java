public class AutoCarAdapter implements Car {
    AutoCar autoCar = new AutoCar();

    public AutoCarAdapter(AutoCar autoCar) {
        this.autoCar = autoCar;
    }

    @Override
    public void run() {
        autoCar.go();
    }

    @Override
    public void stop() {
        autoCar.warring();
    }
}
