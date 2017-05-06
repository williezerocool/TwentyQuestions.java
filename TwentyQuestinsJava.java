/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twentyquestins.java;

import java.util.Scanner;


/**
 *
 * @author kendrabooker
 */
public class TwentyQuestinsJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        String question1, question2,  animal, vegetable, mineral;
        
        
        System.out.print("Question 1. Is it a animal, vegetable, or mineral? ");
        question1 = keyboard.next();
        System.out.print("Question 2. Is it bigger then a breadbox? ");
        question2 = keyboard.next();
       
        if("animal".equals(question1) && "no".equals(question2)) {
            System.out.println("My guess is that you're thinking of a squirrle.");
        } else if ("animal".equals(question1) && "yes".equals(question2)){
            System.out.println("My guess is that you're thinking of a moose.");
        } else if ("vegetable".equals(question1) && "yes".equals(question2)){
            System.out.println("My guess is that you're thinking of a watermelon.");
        }else if ("vegetable".equals(question1) && "no".equals(question2)){
            System.out.println("My guess is that you're thinking of a carrot.");
        }else if("mineral".equals(question1) && "yes".equals(question2)){
            System.out.println("My guess is that you're thinking of a paper clip");
        }else if("mineral".equals(question1) && "no".equals(question2)){
             System.out.println("My guess is that you're thinking of a camaro");
        }else{
             System.out.println("I dont think you know how to play!");
        }
           
        
     
        
        
            }
    
}
