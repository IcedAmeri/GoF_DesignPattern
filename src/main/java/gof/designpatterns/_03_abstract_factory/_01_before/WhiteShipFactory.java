package gof.designpatterns._03_abstract_factory._01_before;

import gof.designpatterns._02_factory_method._02_after.DefaultShipFactory;
import gof.designpatterns._02_factory_method._02_after.Ship;
import gof.designpatterns._02_factory_method._02_after.WhiteShip;
import gof.designpatterns._03_abstract_factory._02_after.ShipPartsFactory;

public class WhiteShipFactory extends DefaultShipFactory {

    private ShipPartsFactory shipPartsFactory;

    public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
        this.shipPartsFactory = shipPartsFactory;
    }

    @Override
    public Ship createShip() {
        Ship ship = new WhiteShip();
        ship.setAnchor(shipPartsFactory.createAnchor());
        ship.setWheel(shipPartsFactory.createWheel());
        return ship;
    }
}
