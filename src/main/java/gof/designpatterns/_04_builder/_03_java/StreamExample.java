package gof.designpatterns._04_builder._03_java;

import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        Stream.Builder<String> stringStreamBuilder = Stream.builder();
        Stream<String> names = stringStreamBuilder.add("keesun").add("whiteShip").build();
        names.forEach(System.out::println);
    }
}
