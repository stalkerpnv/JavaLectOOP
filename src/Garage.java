import java.util.ArrayList;
import java.util.Arrays;

public class Garage {
    public ArrayList<Auto> garage = new ArrayList<>();
    public void addCar(Auto auto){
        garage.add(auto);
    }
    public boolean findCar(Auto auto){
        return garage.contains(auto);
    }
    public Garage(ArrayList< Auto> n){//конструктор для внесения существующего списка машин
        garage = n;
    }
    public Garage(){//конструктор для внесения существующего списка машин
    }
    public void printGarage(){
        System.out.println("В гараже");
        for (Auto a: garage){
            System.out.println(a.toString());
        }
    }
    public void printCar(){
        System.out.println("Cars");
        for (Auto a: garage){
            if(a instanceof Car) System.out.println(a.toString());
        }
    }
    public void printTruck(){
        System.out.println("Trucks");
        for (Auto a: garage){
            if(a instanceof Truck) System.out.println(a.toString());
        }
    }
}
