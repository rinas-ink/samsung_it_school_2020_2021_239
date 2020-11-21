package lesson2;

import org.junit.Assert;
import org.junit.Test;

/**
 * {@link Animal}
 * */
public class AnimalTest {

    @Test
    public void catTest() {
        Assert.assertEquals("MEOW", new Cat().say());
    }

    @Test
    public void cowTest() {
        Assert.assertEquals("MOO", new Cow().say());
    }

    @Test
    public void sphinxTest() {
        Assert.assertEquals("MEOW AUF", new Sphinx().say());
    }

}
