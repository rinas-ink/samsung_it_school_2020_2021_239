package lesson5;

interface Moveable {
    void move(float dx, float dy);

    void resize(float koeff);
}

abstract class Figure {

    private float x, y;

    public Figure(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public abstract float getArea();

    public abstract float getPerimeter();
}

class Rectangle extends Figure implements Moveable {

    private float width, height;

    public Rectangle(float x, float y,
                     float width, float height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public float getArea() {
        return width * height;
    }

    @Override
    public float getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public void move(float dx, float dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }

    @Override
    public void resize(float koeff) {
        width *= koeff;
        height *= koeff;
    }

    @Override
    public String toString() {
        return "Rectangle\n" +
                "Center: (" + (getX() + width / 2) +
                ", " + (getY() + height / 2) + ")\n" +
                "Height: " + height + "\n" +
                "Width: " + width;
    }
}

class Circle extends Figure implements Moveable {

    float radius;

    public Circle(float x, float y, float radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public float getArea() {
        return (float) (Math.PI * radius * radius);
    }

    @Override
    public float getPerimeter() {
        return (float) (2 * Math.PI * radius);
    }

    @Override
    public void move(float dx, float dy) {
        setX(getX() + dx);
        setY(getY() + dy);
    }

    @Override
    public void resize(float koeff) {
        radius *= koeff;
    }

    @Override
    public String toString() {
        return "Circle\n" +
                "Center: (" + getX() + ", " + getY() + ")\n" +
                "Radius: " + radius;
    }
}
