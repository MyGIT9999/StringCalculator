package com.calculator;

import java.io.IOException;
import java.util.ArrayList;

public class Calculate {


   public static final int add (final String values)  {

       public static int add(final String numbers) {
           int returnValue = 0;
           String[] numbersArray = numbers.split(",|n");
           for (String number : numbersArray) {
               if (!number.trim().isEmpty()) {
                   returnValue += Integer.parseInt(number.trim());
               }
           }
           return returnValue;
       }
   }

}
