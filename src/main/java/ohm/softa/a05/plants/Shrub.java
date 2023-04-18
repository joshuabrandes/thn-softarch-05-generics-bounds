package ohm.softa.a05.plants;

public class Shrub extends Plant{

    public Shrub(double height, String family, String name) {
        super(height, family, name);
    }

    @Override
    public PlantColor getColor() {
        return PlantColor.GREEN;
    }

    @Override
    public String toString() {
        return "Shrub{" +
                "height=" + height +
                ", family='" + family + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
