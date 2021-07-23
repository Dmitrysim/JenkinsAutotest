package mypackage;

import testpackage.Cars;
import testpackage.Plane;

import java.util.*;

//  Коллекции

public class TestClass {

    public static void main(String [] args) {
        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(7);
        list.add(8);
        list.add(12);

        System.out.println(list.get(0));
        System.out.println(list.get(3));
        list.set(0, 200);
        System.out.println(list.get(0));
        list.removeAll(list);

        for(int i = 0; i < 1200; i+=100) {
            list.add(i);
        }

        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Коллекция Map
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "green");
        map.put(2, "white");
        map.put(3, "red");
        map.put(4, "black");
        map.put(5, "grey");
        map.put(6, "yellow");
        map.put(7, "purple");

        System.out.println(map.containsKey(90));
        System.out.println(map.containsValue("green"));

        System.out.println(map.get(2));
        System.out.println(map.size());
//        map.clear();
//        System.out.println(map.size());

        Set<Integer> keys = map.keySet();
        Iterator<Integer> iter = keys.iterator();

        while (iter.hasNext()) {
            System.out.println(map.get(iter.next()));
        }

        Map<String, String> map2 = new HashMap<>();
        map2.put("V", "P");
        map2.put("A", "R");
        map2.put("D", "S");

        Car car1 = new Car();
        car1.addWeight(200);

        Car car2 = new Car("yellow");
        System.out.println(car2.color);

        Car car3 = new Car("Red", 2100, 222, 120);
        System.out.println(car3.color);
        System.out.println(car3.weight);
        System.out.println(car3.height);

        Cat cat = new Cat();
        Dog dog = new Dog();

        cat.name = "Menet";
        dog.name = "Sharik";

        cat.color = "White";
        dog.color = "Black";

        cat.walk("Backyard");
        dog.walk("Park");

        cat.feed("Milk");
        dog.sit();

        System.out.println("Cat name is: " + cat.name);
        System.out.println("Dog color is: " + dog.color);

        Cars bmw = new Cars();
        bmw.go();
        bmw.stop();

        Plane plane = new Plane();
        plane.go();
        plane.setSpeed(200);
        plane.stop();
        plane.stop();
        plane.stop();
        plane.stop();
    }
}
