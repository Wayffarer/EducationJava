public class Main {
    public static void main(String[] args) {
        Car bmw = new Car(250.5f,2500,"Red",new byte[] {0 ,0 ,0});

         Truck truck = new Truck(5600,new  byte[]{100, 0, 100}, false);
         truck.setLoaded(true);
         truck.getLoaded();
    }
}