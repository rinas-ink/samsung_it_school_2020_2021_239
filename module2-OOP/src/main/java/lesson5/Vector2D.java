package lesson5;

import java.util.Locale;


public class Vector2D {

    public static int count = 0;

    public double vX, vY;

    public Vector2D() {
        vX = 1;
        vY = 1;
        count++;
    }

    public Vector2D(double vX, double vY) {
        this.vX = vX;
        this.vY = vY;
        count++;
    }

    public Vector2D(Vector2D vector2D) {
        vX = vector2D.vX;
        vY = vector2D.vY;
        count++;
    }

    public void print() {
        System.out.printf(Locale.US, "(%.2f, %.2f)\n", vX, vY);
    }

    public double length() {
        return Math.sqrt(vX * vX + vY * vY);
    }

    public void add(Vector2D vector2D) {
        vX += vector2D.vX;
        vY += vector2D.vY;
    }

    public void sub(Vector2D vector2D) {
        vX -= vector2D.vX;
        vY -= vector2D.vY;
    }

    public void scale(double scaleFactor) {
        vX *= scaleFactor;
        vY *= scaleFactor;
    }

    public void normalized() {
        double div = length();
        vX /= div;
        vY /= div;
    }

    public double dotProduct(Vector2D  v) {
        return vX * v.vX + vY * v.vY;
    }

}
