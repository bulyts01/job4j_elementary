package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenExistTrue() {
        double ab = 2.0;
        double bc = 2.0;
        double ca = 2.0;
        boolean result = Triangle.exist(ab, bc, ca);
        Assert.assertTrue(result);
    }

    @Test
    public void whenExistFalse() {
        double ab = 1.0;
        double bc = 1.0;
        double ca = 2.0;
        boolean result = Triangle.exist(ab, bc, ca);
        Assert.assertFalse(result);
    }
}