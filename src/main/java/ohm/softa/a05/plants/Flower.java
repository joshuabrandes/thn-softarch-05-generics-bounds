package ohm.softa.a05.plants;

import lombok.EqualsAndHashCode;
import lombok.ToString;

public class Flower extends Plant {
    private final PlantColor color;

    public Flower(double height, String family, String name, PlantColor color) {
        super(height, family, name);
        if (color == PlantColor.GREEN) {
            throw new IllegalArgumentException("Flowers cannot be green!");
        }
        this.color = color;
    }

    @Override
    public PlantColor getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "color=" + color +
                ", height=" + height +
                ", family='" + family + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
