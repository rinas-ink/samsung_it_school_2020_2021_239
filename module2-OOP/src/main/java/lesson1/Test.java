package lesson1;

import java.util.Arrays;

public class Test {

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
    }
}
