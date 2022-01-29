package gof.designpatterns._02_structural_patterns._06_flyweight._02_after;

import lombok.Getter;

@Getter
public class Font {

    final String family;
    final int size;

    public Font(String family, int size) {
        this.family = family;
        this.size = size;
    }
}
