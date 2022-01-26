package gof.designpatterns._04_builder._03_java;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        String result = stringBuilder.
                append("whiteShip").
                append("keesun")
                .toString();
        System.out.println("result = " + result);
    }
}
