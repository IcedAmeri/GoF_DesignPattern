package gof.designpatterns._02_structural_patterns._07_proxy._02_after;

public class Client {
    public static void main(String[] args) {
        GameService gameService = new GameServiceProxy();
        gameService.startGame();
    }
}
