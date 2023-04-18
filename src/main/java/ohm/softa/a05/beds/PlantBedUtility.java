package ohm.softa.a05.beds;

import ohm.softa.a05.plants.Plant;
import ohm.softa.a05.plants.PlantColor;

public abstract class PlantBedUtility<T extends Plant> {
    private PlantBedUtility() {
    }

    public void repot(PlantBed<T> from, PlantColor color, PlantBed<? super T> to) {
        from.getPlantsByColor(color).forEach(to::add);
        from.getPlantsByColor(color).forEach(from::remove);
    }
}
