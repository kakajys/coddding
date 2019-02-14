package net.neoremind.mycode.designpattern.builder;

/**
 * The entry
 * @author kakajys
 */
public class BuilderApplication {

    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(NyPizza.Size.SMALL)
                .addTopping(Pizza.Topping.SAUSAGE).addTopping(Pizza.Topping.ONION).build();
        for (Pizza.Topping topping : pizza.toppings) {
            System.out.println(topping.name());
        }
        Calzone calzone = new Calzone.Builder()
                .addTopping(Pizza.Topping.HAM).sauceInside().build();
    }
}
