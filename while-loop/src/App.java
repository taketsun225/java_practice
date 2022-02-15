import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    String name = "";

    while (name.isBlank()) {
      System.out.println("Enter your name: ");
      name = scanner.nextLine();
    }
    
    System.out.println("Hello " + name);
  }
}
