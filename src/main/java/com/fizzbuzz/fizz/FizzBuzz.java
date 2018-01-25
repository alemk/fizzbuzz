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
        return "Displaying multiple of 3 as fizz, 5 as buzz, 3&5 as fizzbuzz and if not display as it is "
                + "<br/>" +fizzBuzzResult + "Displaying only multiples of 7,17,23 " + "<br/>"+ catcher;
    }
    private String chechothermultiple(int number)
    {
        String result = "";
        for (int y = 1; y <= number; y++)
        {
            if (y % 7 == 0) {
                result += y + "<br/>";
            } else if (y % 17 == 0) {
                result += y + "<br/>";
            } else if (y % 23 == 0) {
                result += y + "<br/>";
            } else {
                result += "";
            }
        }
        return result;
    }
}