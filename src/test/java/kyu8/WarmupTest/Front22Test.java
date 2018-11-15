package kyu8.WarmupTest;

import kyu8.Warmup.Front22;
import org.junit.Assert;
import org.junit.Test;

public class Front22Test {
    Front22 f22 = new Front22();
    @Test
    public void haTest() {
        Assert.assertEquals("HaHaHa", f22.front22("Ha"));
    }

    @Test
    public void kittenTest() {
        Assert.assertEquals("kikittenki", f22.front22("kitten"));
    }

    @Test
    public void abcTest() {
        Assert.assertEquals("ababcab", f22.front22("abc"));
    }
}
