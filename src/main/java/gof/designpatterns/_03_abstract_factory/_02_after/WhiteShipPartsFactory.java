package gof.designpatterns._03_abstract_factory._02_after;


import gof.designpatterns._03_abstract_factory._01_before.WhiteAnchor;
import gof.designpatterns._03_abstract_factory._01_before.WhiteWheel;

public class WhiteShipPartsFactory implements ShipPartsFactory {
    @Override
    public Anchor createAnchor() {
        return new WhiteAnchor();
    }

    @Override
    public Wheel createWheel() {
        return new WhiteWheel();
    }
}
