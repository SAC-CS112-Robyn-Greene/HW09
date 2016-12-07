/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw09;

/**
 *
 * @author Robyn
 */
import hw09.Dice;
import java.util.*;
import java.util.Random;

public class HW09 {

    /**
     * @param args the command line arguments Implement an Dice game using
     * objects Make sure to include constructor
     *
     */
    public static void main(String[] args) {
        //create scanner,random and object
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        Dice Dice = null;
        int rollOut = 0;
        Dice diceObject = new Dice();
        Dice myDice = new Dice();
        do {

            myDice.displayMessage();
            int call = scan.nextInt();
            diceObject.roll();
            System.out.println("Dice1 comes up " + diceObject.getDie1());
            System.out.println("Dice2 comes up " + diceObject.getDie2());
            System.out.println("Dice3 comes up " + diceObject.getDie3());
            rollOut++;
            int sum=diceObject.getDie1()+diceObject.getDie2()+diceObject.getDie3();
            System.out.println("Total of dice is: "+sum);
        } while (diceObject.getTotal() != 0);
        System.out.println("\nIt took " + rollOut + " rolls to get 2");

    }//main 

}//class
