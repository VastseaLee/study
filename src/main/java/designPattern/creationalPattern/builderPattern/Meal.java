package designPattern.creationalPattern.builderPattern;

import java.util.LinkedList;
import java.util.List;

public class Meal {
    private List<Item> items;
    private float cost;

    public Meal() {
        this.items = new LinkedList<>();
        cost = 0.0f;
    }

    public void addItem(Item item) {
        items.add(item);
        cost += item.price();
    }

    public void showItem() {
        System.out.println("品名\t价格\t");
        System.out.println("-----------------------------");
        for (Item item : items) {
            System.out.println(item.name() + "\t" + item.price() + "\t");
        }
        System.out.println("-----------------------------");
        System.out.println("合计：\t" + cost + "\t");
    }

    public static void main(String[] args) {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        meal.showItem();
    }
}
