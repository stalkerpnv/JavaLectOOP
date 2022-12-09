public class Car extends Auto{
    String model;
    int numdoors;
    boolean fullTime;
    public Car(String firm, double maxSpeed, String model, int numdoors, boolean fullTime){
        super(firm,maxSpeed);
        this.model = model;
        this.numdoors = numdoors;
        this.fullTime = fullTime;
    }
}
