package ohm.softa.a05.beds;

import lombok.AllArgsConstructor;
import ohm.softa.a05.collections.SimpleList;
import ohm.softa.a05.plants.Plant;
import ohm.softa.a05.plants.PlantColor;

@AllArgsConstructor
public class PlantBed<T extends Plant> {

    SimpleList<T> plants;

    public void add(T t) {
        plants.add(t);
    }

    public int size() {
        return plants.size();
    }

    public SimpleList<T> getPlantsByColor(PlantColor color) {
        return plants.filter(p -> p.getColor() == color);
    }

    public void remove(T t) {
        plants.remove(t);
    }
}
