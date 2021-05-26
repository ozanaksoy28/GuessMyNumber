package com.company;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
	    Random random = new Random();
	    Scanner input = new Scanner(System.in);
	    int myNumber = random.nextInt(101);
	    System.out.println("Guess my number.");
	    int yourNumber = input.nextInt();
        CalculateScore yourscore = new CalculateScore();
        yourscore.score(myNumber,yourNumber);
    }
}
