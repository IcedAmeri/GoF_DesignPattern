package gof.designpatterns._03_behavioral_patterns._10_template._02_after;

public class Client {
    public static void main(String[] args) {
        FileProcessor fileProcessor = new FileProcessor("number.txt");
        int result = fileProcessor.process(((sum, number) -> sum += number));
        System.out.println(result);
    }
}
