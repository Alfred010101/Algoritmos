package org.sorting;

import java.time.LocalDate;
import java.util.Arrays;

// Busca el mínimo y lo coloca al principio
// Complejidad: O(n²)

public class SelectionSort 
{
    public static void sort(Integer[] arr) 
    {
        for (int i = 0; i < arr.length - 1; i++) 
        {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[j] < arr[minIndex]) 
                {
                    minIndex = j;
                }
            }

            if (minIndex != i) 
            {
                Integer temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
            System.out.println("Ordenando ....... : " + Arrays.toString(arr));
        }
    }

    public static void sort(Character[] arr) 
    {
        for (int i = 0; i < arr.length - 1; i++) 
        {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[j] < arr[minIndex]) 
                {
                    minIndex = j;
                }
            }

            if (minIndex != i) 
            {
                Character temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
            System.out.println("Ordenando ....... : " + Arrays.toString(arr));
        }
    }

    public static void sort(String[] arr) 
    {
        for (int i = 0; i < arr.length - 1; i++) 
        {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[j].compareTo(arr[minIndex]) < 1) 
                {
                    minIndex = j;
                }
            }

            if (minIndex != i) 
            {
                String temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
            System.out.println("Ordenando ....... : " + Arrays.toString(arr));
        }
    }

    public static void sort(LocalDate[] arr) 
    {
        for (int i = 0; i < arr.length - 1; i++) 
        {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[j].isBefore(arr[minIndex])) 
                {
                    minIndex = j;
                }
            }

            if (minIndex != i) 
            {
                LocalDate temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
            System.out.println("Ordenando ....... : " + Arrays.toString(arr));
        }
    }

    public static <T extends Comparable<T>> void sort(T[] arr) 
    {
        for (int i = 0; i < arr.length - 1; i++) 
        {
            int minIndex = i;

            for (int j = i + 1; j < arr.length; j++) 
            {
                if (arr[j].compareTo(arr[minIndex]) < 0) 
                {
                    minIndex = j;
                }
            }

            if (minIndex != i) 
            {
                T temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }

            System.out.println("Ordenando ....... : " + Arrays.toString(arr));
        }
    }
}
