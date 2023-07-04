package com.greatLearning.DenominationsQ2;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        IntegerSorting sorting = new MergeSort();
        NotesCount counting = new NotesCount();

        System.out.println("Enter The size of Currency Denominations :");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] denominations = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Entering the Denominations " + (i + 1) + " Currency");
            denominations[i] = sc.nextInt();
        }
        System.out.println("Enter the Total Currency you want to pay");
        int amount = sc.nextInt();

        sorting.sort(denominations);
        counting.calculateNotesCount(denominations, amount);



    }
}
