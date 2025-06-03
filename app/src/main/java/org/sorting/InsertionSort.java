package org.sorting;

import java.time.LocalDate;
import java.util.Arrays;

// Inserta cada elemento en la posición correcta dentro de una sublista ordenada.
// Complejidad: O(n²), pero rápido en listas pequeñas o casi ordenadas.

public class InsertionSort 
{
    public static void sort(Integer []arr)
    {
        for (int i = 1; i < arr.length; i++) 
        {
            Integer key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) 
            {
                arr[j + 1] = arr[j];
                j--;
                System.out.println("Ordenando ....... : " + Arrays.toString(arr));
            }
            arr[j + 1] = key;
        }
    }

    public static void sort(Character []arr)
    {
        for (int i = 1; i < arr.length; i++) 
        {
            Character key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) 
            {
                arr[j + 1] = arr[j];
                j--;
                System.out.println("Ordenando ....... : " + Arrays.toString(arr));
            }
            arr[j + 1] = key;
        }
    }

    public static void sort(String []arr)
    {
        for (int i = 1; i < arr.length; i++) 
        {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key)  > 1) 
            {
                arr[j + 1] = arr[j];
                j--;
                System.out.println("Ordenando ....... : " + Arrays.toString(arr));
            }
            arr[j + 1] = key;
        }
    }

    public static void sort(LocalDate []arr)
    {
        for (int i = 1; i < arr.length; i++) 
        {
            LocalDate key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].isAfter(key)) 
            {
                arr[j + 1] = arr[j];
                j--;
                System.out.println("Ordenando ....... : " + Arrays.toString(arr));
            }
            arr[j + 1] = key;
        }
    }
}
