package lesson1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("Vaska", 1);
        Rectangle rect = new Rectangle(3, 3);
        rect = new Rectangle(3, 3);
        rect = new Rectangle(3, 3);
        System.out.println(rect.getDiagonalLength());
        System.out.println(rect.getAngleA());
        System.out.println(Rectangle.rectCounter);

    }
}
