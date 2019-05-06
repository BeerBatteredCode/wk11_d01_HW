import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterbottle;

    @Before
    public void before() {
        waterbottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume() {
        assertEquals(100, waterbottle.getVolume());
    }

    @Test
    public void takingDrinkRemovesTen() {
        waterbottle.takeDrink();
        waterbottle.takeDrink();
        waterbottle.takeDrink();
        assertEquals(70, waterbottle.getVolume());
    }

    @Test
    public void emptyBottle() {
        waterbottle.emptyBottle();
        assertEquals(0, waterbottle.getVolume());
    }

    @Test
    public void fullBottle() {
        waterbottle.emptyBottle();
        waterbottle.fullBottle();
        assertEquals(100, waterbottle.getVolume());
    }
}