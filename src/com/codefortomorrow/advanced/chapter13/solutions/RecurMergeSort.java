package com.codefortomorrow.advanced.chapter13.solutions;

public class RecurMergeSort {

    public static void recurMergeSort(Comparable[] array, int start, int end) {
        if (start >= end) {
            return;
        }
        int middle = (start + end) / 2;
        recurMergeSort(array, start, middle);
        recurMergeSort(array, middle + 1, end);
        int i = start;
        int j = middle + 1;
        Comparable[] sortedArray = new Comparable[end - start + 1];
        int k = 0;
        while (i <= middle && j <= end) {
            if (array[i].compareTo(array[j]) > 0) {
                sortedArray[k] = array[i];
                i++;
            } else {
                sortedArray[k] = array[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            sortedArray[k] = array[i];
            i++;
            k++;
        }
        while (j <= end) {
            sortedArray[k] = array[j];
            j++;
            k++;
        }
        k = 0;
        for (int l = start; l <= end; l++) {
            array[l] = sortedArray[k];
            k++;
        }
    }
}
