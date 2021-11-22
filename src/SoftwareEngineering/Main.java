package SoftwareEngineering;

import java.util.Scanner;

import static SoftwareEngineering.Game.numbersPlayer1;
import static SoftwareEngineering.Game.numbersPlayer2;

public class Main {

    public static void main(String[] args) {

        GameChair chair = new GameChair();
        Player p1 = new Player("Computer");
        Player p2 = new Player("Michelle");
        Game betMore = new Game("betMore");

        chair.start(betMore, p1);
        chair.start(betMore, p2);
        chair.play();
        betMore.pickCard();
        betMore.shufflep1();
        betMore.shufflep2();
        System.out.println("Wanna shuffle again? max 5 times is possible");
        betMore.shufflep2();
        betMore.shufflep2();
        betMore.shufflep2();
        betMore.shufflep2();
        betMore.shufflep2();
        if(Game.count>5){
            System.out.println("You can't bet more than 5 times");
        }

        int p1bet = numbersPlayer1.get(numbersPlayer1.size()-1);
        int p2bet = numbersPlayer2.get(numbersPlayer2.size()-1);
        System.out.println("Computer's final bet is: " + p1bet);
        System.out.println("Michelle's final bet is: " + p2bet);
        if (p1bet < p2bet){
            System.out.println("Congratulations Michelle, you won the game betMore!");
        }
        else if(p1bet == p2bet){
            System.out.println("The game ended in a tie. You are both winners!");
        }
        else{
            System.out.println("Congratulations Computer, you won the game betMore!");
        }
    }

}
