public class App {
  public static void main(String[] args) throws Exception {

    Human human1 = new Human("Rick", 65, 70);
    Human human2 = new Human("Morty", 16, 50);

    human1.eat();
    human2.drink();
  }
}
