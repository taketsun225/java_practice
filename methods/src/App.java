public class App {
  public static void main(String[] args) throws Exception {
    
    int x = 3;
    int y = 4;

    int z = add(x, y);

    System.out.println(z);
  }

  static int add(int x, int y) {

    int z = x + y;
    return z;
  }
}


// public static void main(String[] args) throws Exception {

//   String name = "Bro";
//   int age = 22;

//   hello(name, age);
// }

// static void hello(String name, int age) {
//   System.out.println("Hello " + name);
//   System.out.println("You are " + age);
// }
