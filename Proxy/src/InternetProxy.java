import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InternetProxy implements ISP{
    private List<String> blocks = Arrays.asList("Facebook","Twitter","Whats");
    @Override
    public String serverSite(String url) {
        if(blocks.contains(url)){
            return "Blocked";
        }
        return new Vodafone().serverSite(url);
    }
}
