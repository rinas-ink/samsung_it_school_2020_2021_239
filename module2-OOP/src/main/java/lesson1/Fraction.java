package lesson1;

public class Fraction {

    private static int left, right;
    private static int numeratorLimit;
    private static int denominatorLimit;
    private int numerator, denominator;

    private Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public static void setLimits(int left, int right,
                                 int up, int down) {
        Fraction.left = left;
        Fraction.right = right;
        Fraction.numeratorLimit = up;
        Fraction.denominatorLimit = down;
    }

    public static Fraction getNextFraction() {
        // TODO: 07.11.2020
        return new Fraction(1, 2);
    }
}
