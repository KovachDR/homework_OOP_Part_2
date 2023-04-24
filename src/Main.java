public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("car1",4);
        Car car2 = new Car("car2",4);

        Truck truck1 = new Truck("truck1",6);
        Truck truck2 = new Truck("truck2",8);

        Bicycle bicycle1 = new Bicycle("bicycle1",2);
        Bicycle bicycle2 = new Bicycle("bicycle2",2);

        ServiceStation station = new ServiceStation();
        station.checkCar(car1);
        station.checkCar(car2);
        station.checkTruck(truck1);
        station.checkTruck(truck2);
        station.checkBicycle(bicycle1);
        station.checkBicycle(bicycle2);
    }
}