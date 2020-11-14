package lesson1;

public class Vector {

    private double x;
    private double y;

    public Vector(Vector vector) {
        x = vector.x;
        y = vector.y;
    }

    public Vector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getLength() {
        return Math.sqrt(x * x + y * y);
    }

    public double getAngleX() {
        return (Math.asin(y / getLength()) * 180) / Math.PI;
    }

    public double getAngleY() {
        return 90 - getAngleX();
    }

    public Vector scale(double k) {
        x *= k;
        y *= k;
        return this;
    }

    public Vector negate() {
        x = -x;
        y = -y;
        return this;
    }

    public Vector transmute(double angle) {
        // todo
        return this;
    }

    public Vector add(Vector vector) {
        x += vector.x;
        y += vector.y;
        return this;
    }

    public double scalarMultiply(Vector vector) {
        return x * vector.x + y * vector.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
