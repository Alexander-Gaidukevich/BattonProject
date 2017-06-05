package dao;

import bean.Car;

import java.util.ArrayList;
import java.util.List;

public class CarsList {
    private static List<Car> list = new ArrayList<Car>();

    static {
        list.add(new Car("1", "RED", 100));
        list.add(new Car("2", "Yellow", 200));
        list.add(new Car("3", "Green", 300));
        list.add(new Car("4", "Blue", 400));
        list.add(new Car("5", "Brown", 500));
        list.add(new Car("6", "White", 600));
        list.add(new Car("7", "Orange", 700));
        list.add(new Car("8", "Gray", 800));
        list.add(new Car("9", "Black", 900));
    }

    public static List<Car> getList() {
        return list;
    }
}

