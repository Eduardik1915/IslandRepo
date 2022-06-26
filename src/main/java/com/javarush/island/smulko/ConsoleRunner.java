package com.javarush.island.smulko;

import com.javarush.island.smulko.entity.map.GameMap;

public class ConsoleRunner {

    public static void main(String[] args) throws CloneNotSupportedException {
        GameMap map = new GameMap(5, 5);
        map.initialize();
        map.initializeLiveOnMap();
        map.getNextCells();
        map.printMap();

    }
}
