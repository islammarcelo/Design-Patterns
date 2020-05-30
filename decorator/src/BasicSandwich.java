public class BasicSandwich implements Sandwich{
    @Override
    public Double getPrise() {
        return 10.0;
    }

    @Override
    public String getDescription() {
        return "Bread";
    }
}
