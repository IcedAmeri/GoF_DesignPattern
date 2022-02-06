package gof.designpatterns._03_behavioral_patterns._10_template._02_after;

public class Multiply implements Operator {
    @Override
    public int getResult(int result, int number) {
        return result *= number;
    }
}
