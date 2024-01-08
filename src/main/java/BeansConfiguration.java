import entities.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.Collections;

@Configuration
public class BeansConfiguration {

    @Bean
    public Pizzas margherita() {
        Pizzas pizza = new Pizzas();
        pizza.setName("Margherita");
        pizza.setPrice(8.99);
        return pizza;
    }

    @Bean
    public Toppings prosciutto() {
        return new Toppings("Prosciutto");
    }

    @Bean
    public Toppings ananas() {
        return new Toppings("Ananas");
    }

    @Bean
    public ToppingsCombo hawaiianPizza() {
        ToppingsCombo hawaiianPizza = new ToppingsCombo();
        hawaiianPizza.setName("Hawaiian Pizza");
        hawaiianPizza.setPrice(11.99);
        hawaiianPizza.setToppings(Arrays.asList(prosciutto(), ananas()));
        return hawaiianPizza;
    }

    @Bean
    public Drinks coke() {
        Drinks coke = new Drinks();
        coke.setName("Coca Cola");
        coke.setPrice(2.5);
        coke.setSize("Medium");
        return coke;
    }

