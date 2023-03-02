public class Main {
    public static void main(String[] args) {
//        Car bmw = new Car(250.5f,2500,"Red",new byte[] {0 ,0 ,0});
//        bmw.engine.SetValues(false,2000);
//        bmw.engine.info();
//
//         Truck truck = new Truck(5600,new  byte[]{100, 0, 100}, false);
//         truck.engine.SetValues(true,340);
//         truck.engine.info();
//         truck.setLoaded(true);
//         truck.getLoaded();

         Car flyCar = new Car(450.5f,2500,"Red",new byte[] {0 ,0 ,0}){
             @Override
             public void moveObject(float speed) {
                 super.moveObject(speed);

                 this.engine.isReady(true);
                 System.out.println("Машина летит, ёпт");
             }
         };
         flyCar.moveObject(450);
    }
}