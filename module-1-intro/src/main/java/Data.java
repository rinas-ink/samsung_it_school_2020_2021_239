import java.io.DataOutputStream;

public class Data {

    void foo(int n) {
        int a = switch (n) {
            case 1 -> 2;
            case 2 -> 3;
            default -> 777;
        };
    }

    void textBlock() {
        Person person = new Person("Ivan", 12);
        System.out.println(person);
        String block = """
                        <html>
                            <p>Lol</p>
                        </html>
                        """;
        System.out.println(block);
    }

    public static void main(String[] args) {
        new Data().textBlock();
    }
}
