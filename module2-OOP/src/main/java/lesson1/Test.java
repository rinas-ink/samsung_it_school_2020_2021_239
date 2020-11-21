package lesson1;

import lesson2.Animal;
import lesson2.Cat;
import lesson2.Cow;
import lesson2.Sphinx;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void animalSay(Animal animal) {
        animal.say();
    }

    public static void main(String[] args) {

        Vector vector = new Vector(5, 5);
        System.out.println(vector);
        System.out.println(vector.getLength());
        System.out.println(vector.getAngleX());
        System.out.println(vector.getAngleY());

        // emplace
        vector.negate()
                .add(new Vector(3, 3))
                .scale(0.5)
                .add(new Vector(3, 1));
        System.out.println(vector);
        System.out.println(vector.getLength());
        System.out.println(vector.getAngleX());
        System.out.println(vector.getAngleY());

        Animal cat = new Cat();
        Animal cow = new Cow();
        cat.say();
        cow.say();

        animalSay(new Cow());
        animalSay(new Cat());
        animalSay(new Sphinx());
    }
}
