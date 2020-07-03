package exercises.technology;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Program {

    SmartPhone pixel;
    Laptop spectre;

    @Before
    public void createPhoneAndLaptop() {
        pixel = new SmartPhone(2019, 400.00, "Google", "Pixel 3A", "Single");
        spectre = new Laptop(2017, 1000, "HP", "Spectre x360", 7);
    }

    @Test
    public void laptopAndPhoneHaveUniqueIds() {
        Assert.assertNotEquals(pixel.getId(), spectre.getId());
    }

    @Test
    public void laptopReturnsBatteryLife() {
        Assert.assertEquals("String", spectre.getBatteryLifeHours(), 7, .001);
    }
    
            
}
