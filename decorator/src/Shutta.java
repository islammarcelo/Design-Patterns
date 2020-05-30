public class Shutta extends SandwichDecorator {
    public Shutta(Sandwich sandwich) {
        super(sandwich);
    }

    @Override
    public Double getPrise() {
        return super.getPrise() + 1;
    }

    @Override
    public String getDescription() {
        return super.getDescription() +" "+"Shutta" ;
    }
}
