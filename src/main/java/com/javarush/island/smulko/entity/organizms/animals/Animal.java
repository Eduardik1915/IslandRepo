package com.javarush.island.smulko.entity.organizms.animals;

import com.javarush.island.smulko.abstractions.Moveable;
import com.javarush.island.smulko.entity.map.Cell;
import com.javarush.island.smulko.entity.organizms.Organism;
import com.javarush.island.smulko.entity.preferences.Fields;

public abstract class Animal
        extends Organism
        implements Moveable{

    public Animal(Fields fields) {
        super(fields);
    }

    @Override
    public void move(Cell start) {
        int steps = this.getSpeed();
        Cell target = start.getLastCell(steps);
        target.addOrganismToSet(this.getClass(), this);
        start.removeOrganismFromSet(this.getClass(), this);
    }

}
