public class Truck extends Auto{
    String model;
    int power;
    boolean trailer;
    Truck(String firm, double maxSpeed,String model, int power, boolean trailer){
        super(firm,maxSpeed);
        this.model = model;
        this.power = power;
        this.trailer = trailer;
    }
}
