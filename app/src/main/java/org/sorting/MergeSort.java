package org.sorting;

//Divide y conquista: divide la lista en mitades, ordena cada mitad y las fusiona.
//Complejidad: O(n log n)

public class MergeSort 
{
    public static void sort(Integer[] arr) 
    {
        if (arr.length > 1) 
        {
            int mid = arr.length / 2;

            Integer[] left = new Integer[mid];
            Integer[] right = new Integer[arr.length - mid];

            System.arraycopy(arr, 0, left, 0, mid);
            System.arraycopy(arr, mid, right, 0, arr.length - mid);

            sort(left);
            sort(right);

            merge(arr, left, right);
        }
    }

    private static void merge(Integer[] result, Integer[] left, Integer[] right) 
    {
        int i = 0, j = 0, k = 0;

        // Comparar y mezclar elementos en orden
        while (i < left.length && j < right.length) 
        {
            if (left[i] <= right[j]) 
            {
                result[k++] = left[i++];
            } else 
            {
                result[k++] = right[j++];
            }
        }

        // Copiar los elementos restantes (si hay)
        while (i < left.length) 
        {
            result[k++] = left[i++];
        }
        while (j < right.length) 
        {
            result[k++] = right[j++];
        }
    }
}
