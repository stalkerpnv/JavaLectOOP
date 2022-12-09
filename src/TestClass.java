public class TestClass {
    public static void main(String[] args) {
        Garage garage = new Garage();
        Truck truck = new Truck("Ford", 200,"f",100,true);
        Truck truck2 = new Truck("A", 150,"f",100,false);
        Truck truck3 = new Truck("B", 190,"f",100,true);
        garage.addCar(truck);
        garage.addCar(truck2);
        garage.addCar(truck3);

        Car car2 = new Car("n",200,"m",4,true);
        garage.addCar(car2);
        garage.printGarage();
        garage.printCar();
        garage.printTruck();
    }
}
