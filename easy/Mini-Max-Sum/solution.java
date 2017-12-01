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

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] a = new long[5];
        long sum = 0;
        
        for (int i = 0 ; i < a.length ; i++){
            long temp = in.nextLong();
            System.out.println(temp);
            a[i] = temp;
            sum += temp;
        }
    
        Arrays.sort(a);
        System.out.println((sum - a[a.length-1]) + " " + (sum - a[0]));
    }
}
