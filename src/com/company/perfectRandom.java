package com.company;

/**
 * Created by ts159 on 10/10/16.
 */
public class perfectRandom
{
    public String name;
    public int luckyNumber;

    public perfectRandom(String n)
    {
        name = n;
        luckyNumber = (int) Math.pow((int) (Math.random() * 46340), 2); //46340 = Floor of square root of 2^31 - 1
    }
}
