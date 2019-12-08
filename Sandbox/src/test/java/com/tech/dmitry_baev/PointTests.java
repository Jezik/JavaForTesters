package com.tech.dmitry_baev;

import org.testng.Assert;
import org.testng.annotations.Test;

public class PointTests {

    @Test
    public void testDistance() {
        Point point1 = new Point(4, 3);
        Point point2 = new Point();
        Assert.assertEquals(point1.getDistance(point2), 5);
    }
}
