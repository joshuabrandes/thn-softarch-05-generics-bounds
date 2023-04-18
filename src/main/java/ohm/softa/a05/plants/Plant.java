package ohm.softa.a05.plants;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;

@AllArgsConstructor
@Getter
public abstract class Plant implements Comparable<Plant> {
    double height;
    String family;
    String name;

    public abstract PlantColor getColor();

    @Override
    public int compareTo(Plant o) {
        return Double.compare(height, o.height);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Plant)) return false;
        Plant plant = (Plant) o;
        return Double.compare(plant.height, height) == 0 && Objects.equals(family, plant.family) && Objects.equals(name, plant.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.toString());
    }
}
