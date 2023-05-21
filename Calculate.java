package com.calculator;

import java.io.IOException;
import java.util.ArrayList;

public class Calculate {


   public static final int add (final String values)  {

       int returnValue = 0;
       String[] numbersArray = numbers.split(",");
       if (numbersArray.length > 2) {
           throw new RuntimeException("Up to 2 numbers separated by comma (,) are allowed");
       }
       for (String number : numbersArray) {
           if (!number.trim().isEmpty()) {
               returnValue += Integer.parseInt(number);
           }
       }
       return returnValue;
   }

}
