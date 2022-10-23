/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package auxiliar;

import java.util.Random;

/**
 *
 * @author Dark
 */
public class LogicaJuego
{
    // Generador de cartas aleatorias 4x4
    // es de 8 por que el total de cartas es 16 y la mita de la misma 8
    public int[] getCardNumbers(int longitud)
    {
        
        int[] numbers = new int[longitud];
        int count = 0;
        
        while(count < longitud) {
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
        return numbers;
    }
    public int[] getCardsLong()
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
        /*
        for(int i=0; i<64; i++)
        {
            System.out.println("numbers ["+i+"] = "+numbers[i]);
        }*/ 
        return numbers;
    }
    //Metodo para saber que turno
    public int turnos(int turn)
    {        
        int jugador =0;
       if(turn%2==0)
       {
           jugador = 1;
       }
       else{
           jugador = 2;
       }
        return jugador;
    }
    //Metodo para activar botones de manera aleatoria
    public int alg(int numb)
    {
        numb=numb/2;
        Random r = new Random();
        int n1 = r.nextInt(numb) + 1;
        int n2 = r.nextInt(numb) + 1;        
        return n1+n2;        
    }
    //Buscador de numeros de manera aleatoria
    /*
    public void guess(int numb, int numb3)
    {
        int limit = 0;
        for(int i=0; i<limit; i++)
        {
            if(im1.getDescription().compareTo(im2.getDescription()) != 0)
            {
                limit=i+1; 
            }
            
                  
        }
    }
    
    */
    
    
}
