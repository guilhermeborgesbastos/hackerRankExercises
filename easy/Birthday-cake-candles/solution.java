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

import org.apache.commons.lang3.ArrayUtils;


public class Solution {
        
    static int occurrenceOfEachItem(int item, int[] array) {
        int count = 0;
        for(int x:array){
            if(x == item){
                count++;
            }
        }
        return count;
    }

    static int birthdayCakeCandles(int n, int[] ar) {
        int max = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max) {
              max = ar[i];
            }
        }
        return occurrenceOfEachItem(max, ar);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
