package gof.designpatterns._03_behavioral_patterns._11_visitor._01_before;

public class Circle implements Shape {
    @Override
    public void accept(Device device) {
        device.print(this);
    }
}
