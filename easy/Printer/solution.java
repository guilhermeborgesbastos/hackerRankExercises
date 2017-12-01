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

class Printer {
   public static void printArray(Object[] list) {
       for(Object val:list)
           System.out.println(val);
   }
}

public class Solution
{
    

    public static void main( String args[] )
    {
        Printer myPrinter=new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello","World"};
        myPrinter.printArray( intArray  );
        myPrinter.printArray( stringArray );
        int count=0;
        
  		  for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();
            if(name.equals("printArray"))
              count++;
        }
        
        if(count>1)System.out.println("Method overloading is not allowed!");
        assert count==1;

    } 
}