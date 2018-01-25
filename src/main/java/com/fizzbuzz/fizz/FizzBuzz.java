package com.fizzbuzz.fizz;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Scanner;

@RestController
public class FizzBuzz
{
    @RequestMapping ("/")
    public String checkMultiple()
    {
        String fizzBuzzResult="";
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number range");
        int numberRange = keyboard.nextInt();
        for (int i = 1; i <= numberRange; i++)
        {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzzResult += "fizzbuzz";
                System.out.println(fizzBuzzResult);
            }
            else if (i % 3 == 0) {
                fizzBuzzResult += "fizz";
            }
            else if (i % 5 == 0)
            {
                fizzBuzzResult += "buzz";
            }
            else
            {
                fizzBuzzResult +=i;
            }


        }
        return fizzBuzzResult;

    }


}