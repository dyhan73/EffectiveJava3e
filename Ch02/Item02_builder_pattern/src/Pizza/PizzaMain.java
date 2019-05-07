package Pizza;

public class PizzaMain {
    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(NyPizza.Size.SMALL).addTopping(Pizza.Topping.SAUSAGE)
                .addTopping(Pizza.Topping.ONION).build();
        System.out.println(pizza);

        Calzone calzone = new Calzone.Builder().addTopping(Pizza.Topping.HAM).sauceInside().build();
        System.out.println(calzone);

        Calzone calzone2 = new Calzone.Builder().sauceInside().build();
        System.out.println(calzone2);
    }
}
