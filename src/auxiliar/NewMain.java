/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package auxiliar;

import java.util.ArrayList;
import java.util.Random;

public class NewMain
{
   

    public static void main(String[] args)
    {  
     int longitud = 64;
     int[] numbers = new int[longitud];
        int count = 0;
        
        while(count < longitud)
        {
            Random r = new Random();
            int na = r.nextInt(longitud/2) + 1;
            int nvr = 0;
            
            for (int i = 0; i < longitud; i++) 
            {
                if(numbers[i] == na)
                {
                    nvr++;
                }
            }
            if(nvr < 2)
            {
                numbers[count] = na;
                count++;
            }
        }
        for(int i=0; i<64; i++)
        {
            System.out.println("numbers ["+i+"] = "+numbers[i]);
        }
     
    }
}
