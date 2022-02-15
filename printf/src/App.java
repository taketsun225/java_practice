public class App {
  public static void main(String[] args) throws Exception {
    // System.out.printf("%d This is a format string", 123);
    boolean myBoolean = true;
    char myChar = '@';
    String myString = "Bro";
    int myInt = 50;
    double myDouble = 1000;

    System.out.printf("%b", myBoolean);
    System.out.printf("%c", myChar);
    System.out.printf("%s", myString);
    System.out.printf("%d", myInt);
    System.out.printf("%f", myDouble);

    System.out.printf("Hello %-10s", myString);

    System.out.printf("You have this much money %.2f", myDouble);

    System.out.printf("You have this much money %+f", myDouble);
    System.out.printf("You have this much money %020f", myDouble);
    System.out.printf("You have this much money %,f", myDouble);
  }
}
