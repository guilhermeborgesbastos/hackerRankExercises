/*
 *
 * Hacker Rank Execise
 * @version    0.1.0
 * @author     Guilherme Borges Bastos
 * @copyright  Copyright 2017 Guilherme Borges Bastos
 * @LinkedIn   https://www.linkedin.com/in/guilhermeborgesbastos/
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
        int input = in.nextInt();
        for(int i=input; i!=0; i--) { 
            int spacesNum = i - 1;
            int hashNum = input - spacesNum;
            // loop spaces
            for(int y=spacesNum; y>0; y--){
              System.out.print(" ");
            }
            // loop hash
            for(int z=hashNum; z>0; z--){
              System.out.print("#");
            }
            //break line
            System.out.println("");
        }
    }
}
