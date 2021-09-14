/*
 *  UCF COP3330 Fall 2021 Assignment 23 Solution
 *  Copyright 2021 Reese Stowell
 */
package org.example;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner user_input = new Scanner(System.in);
        String input;

        System.out.print("Is the car silent when you turn the key? ");
        input = user_input.nextLine();

        if(input.equalsIgnoreCase("y"))
        {
            System.out.print("Are the battery terminals corroded? ");
            input = user_input.nextLine();

            if(input.equalsIgnoreCase("y"))
            {
                System.out.println("Clean terminals and try starting again.");
            }
            else
            {
                System.out.println("Replace cables and try again.");
            }
        }
        else
        {
            System.out.print("Does the car make a slicking noise? ");
            input = user_input.nextLine();

            if(input.equalsIgnoreCase("y"))
            {
                System.out.println("Replace the battery.");
            }
            else
            {
                System.out.print("Does the car crank up but fail to start? ");
                input = user_input.nextLine();

                if(input.equalsIgnoreCase("y"))
                {
                    System.out.println("Check spark plug connections.");
                }
                else
                {
                    System.out.print("Does the engine start and then die?) ");
                    input = user_input.nextLine();

                    if(input.equalsIgnoreCase("y"))
                    {
                        System.out.print("Does your car have fuel injection? ");
                        input = user_input.nextLine();

                        if(input.equalsIgnoreCase("y"))
                        {
                            System.out.println("Get the car in for service.");
                        }
                        else
                        {
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                    }
                    else
                    {
                        System.out.println("This should not be possible.");
                    }
                }
            }
        }
    }
}