package gof.designpatterns._01_creational_patterns._04_builder._02_after;

import gof.designpatterns._01_creational_patterns._04_builder._01_before.TourPlan;

public class App {
    public static void main(String[] args) {
        TourPlanBuilder builder = new DefaultTourBuilder();

        TourDirector director = new TourDirector(builder);
        TourPlan tourPlan = director.cancunTrip();
        TourPlan tourPlan1 = director.longBeachTrip();
    }
}
