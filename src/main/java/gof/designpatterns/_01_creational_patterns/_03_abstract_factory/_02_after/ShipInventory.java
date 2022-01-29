package gof.designpatterns._01_creational_patterns._03_abstract_factory._02_after;

import gof.designpatterns._01_creational_patterns._02_factory_method._02_after.Ship;
import gof.designpatterns._01_creational_patterns._02_factory_method._02_after.ShipFactory;
import gof.designpatterns._01_creational_patterns._03_abstract_factory._01_before.WhiteShipFactory;

public class ShipInventory {
    public static void main(String[] args) {
//        ShipFactory shipFactory = new WhiteShipFactory(new WhitePartsProFactory());
        ShipFactory shipFactory = new WhiteShipFactory(new WhiteShipPartsFactory());
        Ship ship = shipFactory.createShip();
        System.out.println(ship.getAnchor().getClass());
        System.out.println(ship.getColor().getClass());
    }
}
