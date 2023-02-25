public class Truck extends Transport {

        private boolean isLoaded;

        public Truck(int weight, byte[] coordinate){
        super(weight, coordinate);
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

    public Truck(int weight, byte[] coordinate, boolean isLoaded){
        super(weight, coordinate);
        this.isLoaded = isLoaded;
    }
    public void setLoaded(boolean loaded){
            isLoaded = loaded;
    }
    public void getLoaded(){
            if (isLoaded)
                System.out.println("Грузовик загружен");
            else
                System.out.println("Грузовик не загружен");

    }
}
