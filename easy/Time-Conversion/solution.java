/*
 *
 * Hacker Rank Execise
 * @version    0.1.0
 * @author     Guilherme Borges Bastos
 * @copyright  Copyright 2017 Guilherme Borges Bastos
 * @LinkedIn   https://www.linkedin.com/in/guilhermeborgesbastos/
 * @Facebook   https://www.facebook.com/guilherme.borgesbastos/
 * @E-mail     guilhermeborgesbastos@gmail.com
 * 
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Solution {
    
    static String cleanStr(String s) {
       String finalStr = s.replace("PM", " PM");
       return finalStr.replace("AM", " AM");       
    }
    
    static String timeConversion(String s) throws Exception {
       SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
       SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ss a");
       Date date = parseFormat.parse(cleanStr(s));
       return displayFormat.format(date);       
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result;
        try {
            result = timeConversion(s);
        } catch(Exception e){
            result = e.toString();
        }
        
        System.out.println(result);
        
    }
}
