package org.test;

import java.util.Arrays;

import org.sorting.MergeSort;

public class MergeSortTest 
{
    public static void exec()
    {
        Integer[] data = org.run.Arrays.arrNums4;

        System.out.println("Arreglo de entrada: " + Arrays.toString(data));

        MergeSort.sort(data);
        
        System.out.println("Arreglo de salida:  " + Arrays.toString(data));
    }
}
