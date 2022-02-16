public class App {
  public static void main(String[] args) throws Exception {

    Hero hero1 = new Hero("Batman", 42, "$$$");
    Hero hero2 = new Hero("Superman", 43, "everything");

    System.out.println(hero2.toString());

    // System.out.println(hero1.name);
    // System.out.println(hero1.age);
    // System.out.println(hero1.power);
  }
}
