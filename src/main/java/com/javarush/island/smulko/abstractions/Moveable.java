package com.javarush.island.smulko.abstractions;

import com.javarush.island.smulko.entity.map.Cell;

@FunctionalInterface
public interface Moveable {

    void move(Cell target);
}
