package com.greatLearning.DenominationsQ2;

public class MergeSort implements IntegerSorting{

    private void sort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            // recursively calling sort until completely broken down
            sort(arr, left, mid);
            sort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private void merge(int[] arr, int left, int mid, int right) {
        // Calculate the size of left and right sub array

        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Create left and right temp array
        int[] leftarr = new int[n1];
        int[] rightarr = new int[n2];

        // Copy the actual array elements into left and right arr

        for (int i = 0; i < n1; i++) {
            leftarr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightarr[j] = arr[mid + j + 1];
        }

        int i = 0, j = 0, k = left;
        // Sorting left and right arr and store in actual arry
        while (i < n1 && j < n2) {
            if (leftarr[i] >= rightarr[j]) {
                arr[k] = leftarr[i];
                i++;
            } else {
                arr[k] = rightarr[j];
                j++;
            }
            k++;
        }
        // add left out left array
        while (i < n1) {
            arr[k] = leftarr[i];
            i++;
            k++;
        }
        // Add left out right array
        while (j < n2) {
            arr[k] = rightarr[j];
            j++;
            k++;
        }
    }


    @Override
    public void sort(int[] arr) {
        sort( arr,0,arr.length-1);
    }
}
