package gof.designpatterns._04_builder._02_after;

import gof.designpatterns._04_builder._01_before.TourPlan;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        TourPlanBuilder builder = new DefaultTourBuilder();

        TourDirector director = new TourDirector(builder);
        TourPlan tourPlan = director.cancunTrip();
        TourPlan tourPlan1 = director.longBeachTrip();
    }
}
