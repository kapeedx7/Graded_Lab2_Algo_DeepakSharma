package com.greatLearning.TransactionsQ1;

import java.util.Arrays;
import java.util.Scanner;

public class Transactions {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Transaction Array :");
        int size = sc.nextInt();
        int sumArray = 0;
        int transactions[] = new int[size];
        for (int i = 0; i < size; i++) {

            System.out.println("Enter the values of the Array at " + (i + 1) + " position:");
            transactions[i] = sc.nextInt();


        }
        System.out.println(Arrays.toString(transactions));

        System.out.println("Enter the total number of targets needs to be achieved :");
        int targetNo = sc.nextInt();

        for(int i=0;i<targetNo;i++){
            System.out.println("Enter the target value :");
            int targetValue = sc.nextInt();

           int result =  getNoOfTransactionsValue(transactions,targetValue);
            if(result >0){
                System.out.println("Target achieved after "+ result+" transactions");
            }else {
                System.out.println("Given target is not achieved ");
            }

        }

    }

    public static int getNoOfTransactionsValue(int[] transactions,int targetValue){
        int sumTransactions = 0;
        for(int i=0;i<transactions.length;i++){
            sumTransactions += transactions[i];
            if(sumTransactions>=targetValue){
                return i+1;
            }
        }

         return -1;

    }






}

