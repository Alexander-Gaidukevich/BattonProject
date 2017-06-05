package dao;

import bean.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalsList {
    private static List<Animal> list = new ArrayList<Animal>();

    static {
        list.add(new Animal("11", "RED", 10));
        list.add(new Animal("22", "Yellow", 20));
        list.add(new Animal("33", "Green", 30));
        list.add(new Animal("44", "Blue", 40));
        list.add(new Animal("55", "Brown", 50));
        list.add(new Animal("66", "White", 60));
        list.add(new Animal("77", "Orange", 70));
        list.add(new Animal("88", "Gray", 80));
        list.add(new Animal("99", "Black", 90));
    }

    public static List<Animal> getList() {
        return list;
    }
}
