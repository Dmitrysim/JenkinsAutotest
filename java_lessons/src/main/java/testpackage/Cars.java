package testpackage;

public class Cars implements Transport{
    @Override
    public void go() {
        System.out.println("We are driving");
    }

    @Override
    public void stop() {
        System.out.println("Stop");
    }
}
