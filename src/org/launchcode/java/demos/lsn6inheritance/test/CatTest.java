package org.launchcode.java.demos.lsn6inheritance.test;


import org.junit.Assert;
import org.junit.Test;
import org.launchcode.java.demos.lsn6inheritance.HouseCat;


public class CatTest {

    @Test
    public void inheritsSuperInFirstConstructor() {
        HouseCat keyboardCat = new HouseCat("Keyboard Cat", 7);
        Assert.assertEquals(7, keyboardCat.getWeight(), .001);
    }

}
