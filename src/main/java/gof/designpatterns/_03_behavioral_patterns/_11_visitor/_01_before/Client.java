package gof.designpatterns._03_behavioral_patterns._11_visitor._01_before;

public class Client {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle();
        Device device = new Pad();
        rectangle.accept(device);
    }
}
