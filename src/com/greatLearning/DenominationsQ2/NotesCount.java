package com.greatLearning.DenominationsQ2;

public class NotesCount {

    public void calculateNotesCount(int[] sortedDenominations,int amount){

        int[] notesCount  = new int[sortedDenominations.length];

        for(int i=0;i<sortedDenominations.length;i++){
            if (sortedDenominations[i] <= amount) {
                notesCount[i] = amount / sortedDenominations[i];
                amount = amount - (sortedDenominations[i] * notesCount[i]);
                // amount = amount % sortedDenominations[i];
                if (amount == 0) {
                    break;
                }

            }

        }
        if (amount == 0) {
            System.out.println("Possible currency highest Denominations achieved with ");
            for (int i = 0; i < sortedDenominations.length; i++) {
                if (notesCount[i] > 0) {
                    System.out.println(sortedDenominations[i] + ":" + notesCount[i]);
                }

            }
        } else {
            System.out.println("The given amount cannot be achieved using highest denominations");
        }





    }




}
