package com.calculator;

import java.io.IOException;
import java.util.ArrayList;

public class Calculate {


   public static final int add (final String values)  {

       String[] numbersArray = values.split(",");
       if (numbersArray.length > 2) {
           throw new RuntimeException("Up to 2 numbers separated by comma are allowed");
       } else {
           for (String number : numbersArray) {
               if (!number.isEmpty()) {
                   Integer.parseInt(number);
               }
           }
       }
       return 0;
   }

}
