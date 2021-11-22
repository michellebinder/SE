package SoftwareEngineering;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Game {

    static String name;

    public Game(String name) {
        this.name = name;
    }


    // create list with numbers between 1 and 100
    public static int [] numbers = IntStream.range(0, 101).toArray();

    // create list to store the numbers the players chose
    public static ArrayList <Integer> numbersPlayer1 = new ArrayList<Integer>();
    public static ArrayList <Integer> numbersPlayer2 = new ArrayList<Integer>();

    public void pickCard() {
        System.out.println("A random number between 1 and 100 is generated.");
    }

    public void shufflep1() {
        Random rand = new Random();
        int randomNumberComp = rand.nextInt(numbers.length);
        numbersPlayer1.add(randomNumberComp);
        System.out.println("Computer, your number is: " + randomNumberComp);
    }
    public static int count = 0;
    public void shufflep2(){
        Random rando = new Random();
        int randomNumberP2 = rando.nextInt(numbers.length);
        numbersPlayer2.add(randomNumberP2);
        System.out.println("Michelle, your number is: " + randomNumberP2);
        count ++;
    }



    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int[] getNumbers() {
        return numbers;
    }

    public static void setNumbers(int[] numbers) {
        Game.numbers = numbers;
    }

    public ArrayList<Integer> getNumbersPlayer1() {
        return numbersPlayer1;
    }

    public void setNumbersPlayer1(ArrayList<Integer> numbersPlayer1) {
        this.numbersPlayer1 = numbersPlayer1;
    }

    public ArrayList<Integer> getNumbersPlayer2() {
        return numbersPlayer2;
    }

    public void setNumbersPlayer2(ArrayList<Integer> numbersPlayer2) {
        this.numbersPlayer2 = numbersPlayer2;
    }
}
