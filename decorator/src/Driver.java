public class Driver {
    public static void main(String [] args){
        Sandwich basicSandwich =new Shutta((new BasicSandwich())) ;
        System.out.printf("Description: %s%n",basicSandwich.getDescription());
        System.out.printf("Cost: %.2f",basicSandwich.getPrise());
    }
}
