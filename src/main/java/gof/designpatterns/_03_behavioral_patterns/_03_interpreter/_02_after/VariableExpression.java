package gof.designpatterns._03_behavioral_patterns._03_interpreter._02_after;

import java.util.Map;

public class VariableExpression implements PostfixExpression {

    private Character character;

    public VariableExpression(Character character) {
        this.character = character;
    }

    @Override
    public int interpret(Map<Character, Integer> context) {
        return context.get(this.character);
    }
}
