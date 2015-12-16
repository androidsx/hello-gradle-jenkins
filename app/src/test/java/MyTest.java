import junit.framework.Assert;

import org.junit.Test;

public class MyTest {

    @Test
    public void passingTest() {
        Assert.assertEquals("foo", "foo");
    }

    @Test
    public void sometimesFailingTest() {
        Assert.assertEquals("bar", "bar");
    }
}
