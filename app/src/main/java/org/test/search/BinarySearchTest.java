package org.test.search;

import java.time.LocalDate;
import java.util.Arrays;

import org.search.BinarySearch;
import org.sorting.SelectionSort;

public class BinarySearchTest 
{
    public static void exec() 
    {
        Character[] data = org.run.Arrays.arrChar2;

        SelectionSort.sort(data);
        
        System.out.println("Arreglo de entrada: " + Arrays.toString(data));   

        int index = BinarySearch.search(data, 'x');
        // int index = BinarySearch.search(data, LocalDate.of(2018, 8, 20));

        System.out.println(
            index > -1 ? 
                "El dato buscado se encuentra en el indice " + index : 
                "El dato buscado no se encuentra en el arreglo"
        );
    }
}
