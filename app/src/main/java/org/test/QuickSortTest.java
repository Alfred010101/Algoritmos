package org.test;

import java.util.Arrays;

import org.sorting.QuickSort;

public class QuickSortTest 
{
    public static void exec()
    {
        Integer[] data = org.run.Arrays.arrNums4;

        System.out.println("Arreglo de entrada: " + Arrays.toString(data));

        QuickSort.sort(data, 0, data.length - 1);
        
        System.out.println("Arreglo de salida:  " + Arrays.toString(data));
    }
}
