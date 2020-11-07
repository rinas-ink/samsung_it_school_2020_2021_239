package lesson1;

public class Cat {

    // in class
    // свойства класса
    private final String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // alt + insert

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // anywhere
    // методы класса
    public void say() {
        System.out.println("MEOW");
    }

    // default = package private
    void sleep() {
        age++;
        System.out.println("ZZZZZZ....");
    }
}
