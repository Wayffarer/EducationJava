public class Transport {
    public float speed;
    public int weight;
    public String color;
    public byte[] coordinate;
    public void setValues(float _speed, int _weight, String _color, byte[] _coordinate){
        speed = _speed;
        weight =_weight;
        color = _color;
        coordinate = _coordinate;
    }
    public String getValues() {
        String info = "Object speed: " + speed + ". Object weight: " + weight + ". Object color: " + color + "." + "\n";
        String infoCoordinates = "Coordinates:\n";
        for (int i = 0; i < coordinate.length; i++) {
            infoCoordinates += coordinate[i] + "\n";
        }
        return info + infoCoordinates;
    }
}
