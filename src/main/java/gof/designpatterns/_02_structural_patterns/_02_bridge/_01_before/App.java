package gof.designpatterns._02_structural_patterns._02_bridge._01_before;

import gof.designpatterns._02_structural_patterns._02_bridge._02_after.KDA;
import gof.designpatterns._02_structural_patterns._02_bridge._02_after.PoolParty;
import gof.designpatterns._02_structural_patterns._02_bridge._02_after.아리;

public class App {

    public static void main(String[] args) {
        Champion kda아리 = new 아리(new KDA());
        kda아리.skillQ();
        kda아리.skillW();

        Champion poolParty아리 = new 아리(new PoolParty());
        poolParty아리.skillQ();
        poolParty아리.skillW();
    }
}
