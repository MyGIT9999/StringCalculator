package com.calculator;

import java.io.IOException;
import java.util.ArrayList;

public class Calculate {

   private ArrayList<Long> convertToNumeric (String values) throws IOException {
        String[] data;
        data = values.split(",");

        ArrayList<Long> numericValues = new ArrayList<Long>();


        for (int i=0; i<data.length; i++) {

            if (data[i].charAt(0) >= '0' && data[i].charAt(0) <= '9') {
                if (Long.parseLong(data[i]) < 0){
                    throw new IOException("Negative values are not allowd");
                }
                numericValues.add(Long.parseLong(data[i]));
            } else {
                throw new IOException("Please enter numeric numbers with Delimiter");
            }

        }
        return numericValues;
   }

   public long add (String values) throws IOException {
       ArrayList<Long> numericValues = convertToNumeric(values);
       long calculate = 0;
       for (int i=0; i<numericValues.size(); i++) {
           calculate+=numericValues.get(i);
       }

       return calculate;
   }
    public long multiplication(String values) throws IOException {
        ArrayList<Long> numericValues = convertToNumeric(values);
        long calculate = numericValues.get(0);
        for (int i=1; i<numericValues.size(); i++) {
            calculate*=numericValues.get(i);
        }

        return calculate;
    }
    public long division(String values) throws IOException {
        ArrayList<Long> numericValues = convertToNumeric(values);
        long calculate = numericValues.get(0)/numericValues.get(1);


        return calculate;
    }
    public long subtraction(String values) throws IOException {
        ArrayList<Long> numericValues = convertToNumeric(values);
        long calculate = numericValues.get(0)-numericValues.get(1);


        return calculate;
    }
}
