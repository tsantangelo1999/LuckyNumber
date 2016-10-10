package com.company;

import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<perfectRandom> people = new ArrayList<>();
        String response = "2";
        while(!response.equals("0"))
        {
            if(response.equals("2"))
            {
                System.out.println("What is your name?");
                perfectRandom p1 = new perfectRandom(input.nextLine());
                people.add(p1);
                System.out.println("Nice to meet you " + p1.name + "! Your lucky number is " + p1.luckyNumber + ".");
            }
            else if(response.equals("1"))
            {
                for(int i = 0; i < people.size(); i++)
                {
                    System.out.println(people.get(i).name + " - Lucky Number: " + people.get(i).luckyNumber);
                }
            }
            response = "3";
            while(!(response.equals("0") || response.equals("1") || response.equals("2")))
            {
                System.out.println("Input 0 to exit, 1 to list all names and lucky numbers, or 2 to add a new name.");
                response = input.nextLine();
            }
        }
    }
}
