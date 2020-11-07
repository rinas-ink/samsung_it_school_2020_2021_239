package lesson1;

public class Rectangle {

    public static int rectCounter = 0;
    private double weight, height;

    public Rectangle(double weight, double height) {
        this.weight = weight;
        this.height = height;
        rectCounter++;
    }

    public Rectangle() {
        weight = 1;
        height = 1;
        rectCounter++;
    }

    public Rectangle(Rectangle r) {
        weight = r.weight;
        height = r.height;
        rectCounter++;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDiagonalLength() {
        return Math.sqrt(weight * weight + height * height);
    }

    public double getSquare() {
        return weight * height;
    }

    public double getAngleA() {
        //|__ sinA = (double) height / getDiagonalLength()
        // A = arcsin(sinA) 3,14 = 180 , 1 = 180 / 3.14
        return Math.asin(height / getDiagonalLength()) * 180 / Math.PI;
    }
}
