package org.test;

import java.time.LocalDate;
import java.util.Arrays;

import org.sorting.InsertionSort;

public class InsertionSortTest 
{
    public static void exec()
    {
        Integer[] data = org.run.Arrays.arrNums4;
        // String[] data = org.run.Arrays.arrStr4;
        // Character[] data = org.run.Arrays.arrChar3;
        // LocalDate[] data = org.run.Arrays.arrDate4;

        System.out.println("Arreglo de entrada: " + Arrays.toString(data));

        InsertionSort.sort(data);
        
        System.out.println("Arreglo de salida:  " + Arrays.toString(data));
    }
}
