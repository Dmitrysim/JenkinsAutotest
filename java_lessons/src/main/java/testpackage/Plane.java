package testpackage;

public class Plane implements Transport{
    @Override
    public void go() {
        System.out.println("we are flying");
    }

    @Override
    public void stop() {
        System.out.println("we are landing");
    }

    public void setSpeed(int speed) {
        System.out.println("speed: " + speed);
    }
}
