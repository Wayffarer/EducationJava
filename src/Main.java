public class Main {
    public static void main(String[] args) {
        Transport bmw = new Transport();
        bmw.setValues(250.5f,2500,"Red",new byte[] {0 ,0 ,0});
        String res1 = bmw.getValues();
        System.out.println(res1);
//        bmw.speed = 250.5f;
//        bmw.weight = 2500;
//        bmw.color = "Red";
//        bmw.coordinate = new byte[] {0 ,0 ,0};

        Transport truck = new Transport();
        truck.speed = 140.5f;
        truck.weight = 5600;
        truck.color = "Blue";
        truck.coordinate = new  byte[]{100, 0, 100};
        String res2= truck.getValues();
        System.out.println(res2);
    }
}