public class App {
  public static void main(String[] args) throws Exception {
    String name = "Bro";

    // boolean result = name.equalsIgnoreCase("bro");
    // int result = name.length();
    // char result = name.charAt(0);
    // int result = name.indexOf("B");
    // boolean result = name.isEmpty();
    // String result = name.toUpperCase();
    // String result = name.toLowerCase();
    // String result = name.trim();
    String result = name.replace('o', 'a');


    System.out.println(result);
  }
}