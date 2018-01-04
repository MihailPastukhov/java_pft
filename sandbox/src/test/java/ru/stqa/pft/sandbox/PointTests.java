package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testDistance() {
        Point a = new Point(1, 1);
        Point b = new Point(5, 1);
        Assert.assertEquals(a.distanceToPoint(b), 4.0);
    }
}
