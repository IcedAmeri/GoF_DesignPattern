package gof.designpatterns._02_structural_patterns._07_proxy._01_before;

public class Client {
    public static void main(String[] args) {
        GameService gameService = new GameService();
        gameService.startGame();
    }
}
