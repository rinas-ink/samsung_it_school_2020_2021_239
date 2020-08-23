import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void test() {
        HelloWorld hw = new HelloWorld();
        Assert.assertEquals(2, hw.funcForTest(1));
    }
}
