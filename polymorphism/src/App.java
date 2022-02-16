public class App {
  public static void main(String[] args) throws Exception {

    Car car = new Car();
    Bicycle bike = new Bicycle();
    Boat boat = new Boat();

    Vehicle[] racers = {car, bike, boat};

    for(Vehicle x : racers) {
      x.go();
    }
  }
}
