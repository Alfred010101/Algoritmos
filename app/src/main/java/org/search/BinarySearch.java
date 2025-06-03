package org.search;

import java.time.LocalDate;

public class BinarySearch 
{
    // public static int search(Integer[] arr, Integer target) 
    // {
    //     int low = 0, high = arr.length - 1;
    //     while (low <= high) 
    //     {
    //         int mid = (low + high) / 2;
    //         if (arr[mid] == target) return mid;
    //         if (arr[mid] < target) low = mid + 1;
    //         else high = mid - 1;
    //     }
    //     return -1;
    // }

    // public static int search(Integer[] arr, Integer target) 
    // {
    //     int low = 0, high = arr.length - 1;
    //     while (low <= high) 
    //     {
    //         int mid = (low + high) / 2;
    //         int cmp = arr[mid].compareTo(target);
    //         if (cmp == 0) return mid;
    //         if (cmp < 0) low = mid + 1;
    //         else high = mid - 1;
    //     }
    //     return -1;
    // }

    // public static int search(String[] arr, String target) 
    // {
    //     int low = 0, high = arr.length - 1;
    //     while (low <= high) 
    //     {
    //         int mid = (low + high) / 2;
    //         int cmp = arr[mid].compareTo(target);
    //         if (cmp == 0) return mid;
    //         if (cmp < 0) low = mid + 1;
    //         else high = mid - 1;
    //     }
    //     return -1;
    // }

    // public static int search(Character[] arr, Character target) 
    // {
    //     int low = 0, high = arr.length - 1;
    //     while (low <= high) 
    //     {
    //         int mid = (low + high) / 2;
    //         int cmp = arr[mid].compareTo(target);
    //         if (cmp == 0) return mid;
    //         if (cmp < 0) low = mid + 1;
    //         else high = mid - 1;
    //     }
    //     return -1;
    // }

    // public static int search(LocalDate[] arr, LocalDate target) 
    // {
    //     int low = 0, high = arr.length - 1;
    //     while (low <= high) 
    //     {
    //         int mid = (low + high) / 2;
    //         int cmp = arr[mid].compareTo(target);
    //         if (cmp == 0) return mid;
    //         if (cmp < 0) low = mid + 1;
    //         else high = mid - 1;
    //     }
    //     return -1;
    // }

    public static <T extends Comparable<T>> int search(T[] arr, T target) 
    {
        int low = 0, high = arr.length - 1;
        while (low <= high) 
        {
            int mid = (low + high) / 2;
            int cmp = arr[mid].compareTo(target);
            if (cmp == 0) return mid;
            if (cmp < 0) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

}
