public class Car extends Transport {
        public Car(float speed, int weight, String color, byte[] coordinate){
//        Join to DB
        super(speed, weight, color, coordinate);
    }

    @Override
    public void moveObject(float speed) {
        System.out.println("Наш объект двигается со скоростью: " + speed);
    }
    @Override
    public boolean stopObject(float speed) {
        this.speed = 0;
        return true;
    }
}
