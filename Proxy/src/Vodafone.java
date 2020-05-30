public class Vodafone implements ISP{
    private int browsingSpeed = 10;

    public int getBrowsingSpeed() {
        return browsingSpeed;
    }

    public void setBrowsingSpeed(int browsingSpeed) {
        this.browsingSpeed = browsingSpeed;
    }

    @Override

    public String serverSite(String url) {

        return String.format("hTTp://%s.com",url);
    }

}
