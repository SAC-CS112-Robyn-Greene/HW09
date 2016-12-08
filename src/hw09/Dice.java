/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw09;

/**
 *Implement an Dice game using objects
 * Make sure to include constructor
 * @author Robyn
 */
import java.util.*;
import java.util.Random;

public class Dice {  
    private static int lastRoll = 0;
    static Random random = new Random();
    private int die1;//show number of first dice
    private int die2;//show number of 2nd dice
     private int die3;//show number of 3rd dice
    // dice class used to roll a random number.
       public void roll()
       {
       die1=(int)(Math.random ()*6)+1; 
       die2=(int)(Math.random ()*6)+1; 
        die3=(int)(Math.random ()*6)+1;
       }
	public int getDie1()
        {
            return die1;
         }
        
        public int getDie2()
        {
            return die2;
         }
         public int getDie3()
        {
            return die3;
         }
        public int getThrow()
        {
        
        return die1+die2+die3;
        }
         public void displayMessage() {
        System.out.println("Guess a number ");

    }//void  
}//class

// getTotal() is your Throw(), Robyn
