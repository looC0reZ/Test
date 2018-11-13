package me.georg;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class GnomeTest extends TestCase {
    @Test
    public void testSort1() {
        int good[] = {4, 8, 15, 16, 23, 42};
        int toSort[] = {8, 16, 23, 42, 4, 15};
        int sortMas[] = Gnome.sort(toSort);
        Assert.assertArrayEquals(good, sortMas);
    }

    @Test
    public void testSort2() {
        int good[] = {4, 4, 15, 16, 23, 23};
        int toSort[] = {4, 16, 23, 23, 4, 15};
        int sortMas[] = Gnome.sort(toSort);
        Assert.assertArrayEquals(good, sortMas);
    }

    @Test
    public void testSort3() {
        int good[] = {-1, -1, 0, 0, 1, 1};
        int toSort[] = {0, 0, 1, -1, 1, -1};
        int sortMas[] = Gnome.sort(toSort);
        Assert.assertArrayEquals(good, sortMas);
    }
}