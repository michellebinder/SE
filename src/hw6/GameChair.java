package hw6;

public class GameChair {

    Player [] players = new Player[2];

    public void play() {
        System.out.println("Let's play a game called " + Game.getName());
        //Game betMore = new Game();
    }

    public void start(Game betMore, Player p1) {
        System.out.println(p1.getName() + " has successfully started the game!");
    }
}
