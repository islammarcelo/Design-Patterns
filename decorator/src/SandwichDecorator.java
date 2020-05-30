
public abstract class SandwichDecorator implements Sandwich{
    private Sandwich sandwich;

    public SandwichDecorator(Sandwich sandwich) {
        this.sandwich = sandwich;
    }



    @Override
    public Double getPrise() {
        return this.sandwich.getPrise();
    }

    @Override
    public String getDescription() {
        return this.sandwich.getDescription();
    }
}
