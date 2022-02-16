public class App {
  public static void main(String[] args) throws Exception {

    Car car = new Car();

    car.go();

    Bicycle bike = new Bicycle();

    bike.stop();

    System.out.println(car.doors);
    System.out.println(bike.pedals);
  }
}
