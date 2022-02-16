public class App {
  public static void main(String[] args) throws Exception {
    
    Pizza pizza = new Pizza();
    // Pizza pizza = new Pizza("thicc crust");
    // Pizza pizza = new Pizza("thicc crust", "tomato");
    // Pizza pizza = new Pizza("thicc crust", "tomato", "mozzerella");
    // Pizza pizza = new Pizza("thicc crust", "tomato", "mozzerella", "pepperoni");

    System.out.println("Here are the ingredients of your pizza: ");
    System.out.println(pizza.bread);
    System.out.println(pizza.sauce);
    System.out.println(pizza.cheese);
    System.out.println(pizza.topping);
  }
}
