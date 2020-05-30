import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args){
        List<String> sites = Arrays.asList("Facebook","Twitter","Whats","Acadox","Yalla Kora");
        ISP Internet = new InternetProxy();
        for (String string : sites){
           System.out.println(Internet.serverSite(string));
        }

    }
}

