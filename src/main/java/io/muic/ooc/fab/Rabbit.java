package io.muic.ooc.fab;

public class Rabbit extends Animal {

    @Override
    protected Location moveToNewLocation() {
        return field.freeAdjacentLocation(getLocation());
    }

    @Override
    protected Animal breedOne(boolean randomAge, Field field, Location location) {
        return AnimalFactory.createAnimal(AnimalType.RABBIT, field,location);
    }

    @Override
    protected int getMaxAge() {
        return 40;
    }

    @Override
    protected double getBreedingProbability() {
        return 0.12;
    }

    @Override
    protected int getMaxLitterSize() {
        return 4;
    }

    @Override
    protected int getBreedingAge() {
        return 5;
    }
}