public class Car extends Transport implements ILights {
    public Engine engine = new Engine();
    private boolean isOn;

    public Car(float speed, int weight, String color, byte[] coordinate){
//        Join to DB
        super(speed, weight, color, coordinate);
    }
    public Car() {}

    @Override
    public void moveObject(float speed) {
        System.out.println("Наш объект двигается со скоростью: " + speed);
    }
    @Override
    public boolean stopObject(float speed) {
        this.speed = 0;
        return true;
    }

    @Override
    public void setLight(boolean set) {
        this.isOn = set;
    }

    @Override
    public void blinkLight() {
        System.out.println("Мы моргаем фарами");
    }
}
