package org.sorting;

import java.time.LocalDate;
import java.util.Arrays;

//Compara pares adyacentes
//Complejidad: O(n²)

public class BubbleSort 
{
    public static void sort(Integer []arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = 0; j < arr.length - i - 1; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    Integer aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                    System.out.println("Ordenando ....... : " + Arrays.toString(arr));
                }            
            }
            System.out.println("Termino un ciclo");
        }
    }

    public static void sort(Character []arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = 0; j < arr.length - i - 1; j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    Character aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                    System.out.println("Ordenando ....... : " + Arrays.toString(arr));
                }            
            }
            // System.out.println("Termino un ciclo");
        }
    }

    public static void sort(String []arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = 0; j < arr.length - i - 1; j++)
            {
                if(arr[j].compareTo(arr[j + 1]) > 1)
                {
                    String aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                    System.out.println("Ordenando ....... : " + Arrays.toString(arr));
                }            
            }
            // System.out.println("Termino un ciclo");
        }
    }

    public static void sort(LocalDate []arr)
    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            for(int j = 0; j < arr.length - i - 1; j++)
            {
                if(arr[j].isAfter(arr[j + 1]))
                {
                    LocalDate aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                    System.out.println("Ordenando ....... : " + Arrays.toString(arr));
                }            
            }
            // System.out.println("Termino un ciclo");
        }
    }

}
