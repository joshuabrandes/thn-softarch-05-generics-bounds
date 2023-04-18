package ohm.softa.a05.tests.models;

import ohm.softa.a05.plants.PlantColor;
import ohm.softa.a05.plants.Shrub;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ShrubTest {

    @Test
    void colorAlwaysGreen() {
        var testShrub = new Shrub(1.0, "Test", "Test");
        assertEquals(testShrub.getColor(), PlantColor.GREEN);
    }
}
