import junit.framework.Assert;

import org.junit.Test;

public class MyTest {

    @Test
    public void passingTest() {
        Assert.assertEquals("foo", "foo");
    }

    @Test
    public void failingTest() {
        Assert.assertEquals("foo", "bar");
    }
}
