public class Slat extends SandwichDecorator {
    public Slat(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public Double getPrise() {
        return super.getPrise() + 0.5;
    }

    @Override
    public String getDescription() {
        return super.getDescription() +" "+"Slat";
    }
}
