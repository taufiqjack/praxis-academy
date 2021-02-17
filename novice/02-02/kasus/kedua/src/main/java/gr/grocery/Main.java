package gr.grocery;

import java.util.ArrayList;
import java.util.List;

import gr.grocery.Grocery.Apple;
import gr.grocery.Grocery.Fruit;

public class Main {
    public static void main(String[] args) {
        Grocery store = new Grocery();
        List<? super Fruit> fruitsBasket = new ArrayList<>();
        store.fill(fruitsBasket);

        assert (fruitsBasket.size() == 3);

        List<Apple> anotherBasket = new ArrayList<>();
        anotherBasket.add(new Apple("apple", 5, "US"));
        anotherBasket.add(new Apple("apple", 8, "UK"));
        anotherBasket.add(new Apple("apple", 9, "CN"));

        assert(store.getBiggestFruit(anotherBasket).getSize() == 9);
    }

    public void fill(List<? super Fruit> fruitBasket) {
        fruitBasket.add(new Apple("apple", 5, "US"));
        fruitBasket.add(new Apple("apple", 8, "UK"));
        fruitBasket.add(new Apple("apple", 9, "CN"));
    }

    public Fruit getBiggestFruit(List<? extends Fruit> fruits) {
        assert (!fruits.isEmpty());
        int len = fruits.size();
        Fruit biggestFruit = fruits.get(0);
        for (int i = 0; i < len; i++) {
            if (fruits.get(i).getSize() > biggestFruit.getSize()) {
                biggestFruit = fruits.get(i);
            }
        }
        return biggestFruit;
    }
}
