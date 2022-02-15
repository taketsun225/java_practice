import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {

    double x;
    double y;
    double z;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter side x: ");
    x = scanner.nextDouble();

    System.out.println("Enter side y: ");
    y = scanner.nextDouble();

    z = Math.sqrt((x * x) + (y * y));

    System.out.println("The hypotenuse is :" + z);

    scanner.close();
  }
}


// double x = 3.14;
    // double y = 10;

    // double z = Math.max(x, y);
    // double z = Math.abs(y);
    // double z = Math.sqrt(y);
    // double z = Math.round(x);
    // double z = Math.ceil(x);
    // double z = Math.floor(x);

    // System.out.println(z);
