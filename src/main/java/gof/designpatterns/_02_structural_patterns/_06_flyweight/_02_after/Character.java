package gof.designpatterns._02_structural_patterns._06_flyweight._02_after;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class Character {

    private char value;
    private String color;
    private Font font;

    public Character(char value, String color, Font font) {
        this.value = value;
        this.color = color;
        this.font = font;
    }
}
