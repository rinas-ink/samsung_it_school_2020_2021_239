package lesson2;

public class Sphinx extends Cat {

    @Override
    public String say() {
        System.out.println("AUF");
        return super.say() + " AUF";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Sphinx clone() throws CloneNotSupportedException {
        return (Sphinx) super.clone();
    }

    @Override
    public String toString() {
        return String.format("Sphinx: name = %s, age = %d", name, age);
    }
}
