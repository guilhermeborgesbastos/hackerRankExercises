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
        Scanner sc = new Scanner(System.in);
        int numCases = Integer.parseInt(sc.nextLine());
        double negativeCount=0.0,positiveCount=0.0,zeroCount=0.0;
        for(int i=0;i<numCases;i++){
            int num = sc.nextInt();
            if(num<0){
                negativeCount++;
            }else if(num>0){
                positiveCount++;
            }else{
                zeroCount++;
            }
        }
        System.out.printf("%.6f\n%.6f\n%.6f",positiveCount/numCases,negativeCount/numCases,zeroCount/numCases);
    }
}
