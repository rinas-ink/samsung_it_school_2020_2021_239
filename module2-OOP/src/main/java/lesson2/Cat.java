package lesson2;

public class Cat extends Animal {

    // override - динамический (межклассовый)
    // полиморфизм
    @Override
    public String say() {
        System.out.println("MEOW");
        return "MEOW";
    }
}
