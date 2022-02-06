package gof.designpatterns._03_behavioral_patterns._11_visitor._01_before;

public interface Device {
    void print(Circle circle);
    void print(Rectangle rectangle);
    void print(Triangle triangle);
}
