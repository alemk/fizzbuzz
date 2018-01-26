package com.fizzbuzz.fizz;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Scanner;

@RestController
public class FizzBuzz
{
    @RequestMapping ("/fizzBuzzResult")
    public String checkMultiple()
    {
        String fizzBuzzResult="";
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number range to play fizz and buzz");
        int numberRange = keyboard.nextInt();
        for (int i = 1; i <= numberRange; i++)
        {
            if (i % 3 == 0 && i % 5 == 0)
            {
                fizzBuzzResult += "fizzbuzz" + "<br/>";
            }
            else if (i % 3 == 0) {
                fizzBuzzResult += "fizz" + "<br/>";
            }
            else if (i % 5 == 0)
            {
                fizzBuzzResult += "buzz" + "<br/>";
            }
            else
            {
                fizzBuzzResult += i + "<br/>";
            }
        }
        String catcher = chechothermultiple(numberRange);
        return "<br/>" +fizzBuzzResult + "<br/>"+ catcher;
    }
    private String chechothermultiple(int number)
    {
        int sevencount= 0;
        int seventencount=0;
        int twentythree = 0;

        for (int y = 1; y <= number; y++)
        {
            if(y % 7 == 0 && y % 17 == 0 && y % 23 == 0)
            {
                sevencount ++;
                seventencount ++;
                twentythree  ++;
            }
            if(y % 7 == 0 && y % 17 == 0)
            {
                sevencount ++;
                seventencount ++;
            }
            if(y % 7 == 0 && y % 23 == 0)
            {
                sevencount ++;
                twentythree  ++;
            }
            if(y % 17 == 0 && y % 23 == 0)
            {
                seventencount ++;
                twentythree  ++;
            }

            else if (y % 7 == 0)
            {
                sevencount ++;
            } else if (y % 17 == 0)
            {
                seventencount ++;
            } else if (y % 23 == 0)
            {
                twentythree  ++;
            }
        }
        return "Multiple number of 7 count: " + sevencount +" Multiple number of 17 Count: "+ seventencount + "Multiple number of 23 Count: " + twentythree ;
    }
}