public class Client {
    public static void main(String [] args){
        for (int i = 1; i < 3; i++){
            Enemy enemy = FactoryEnemy.createEnemy(i);
            enemy.show();
        }
    }
}
