package Sorting;

import java.sql.SQLOutput;

public class BubbleSort {

    public static void main(String[] args) {
     int[] arr = {3,4,4,5,6,5,3,4,6,4,5,4,3,4,5,6,5,5,6,7,6,5,6,7,7,7,6,44,55,44,33,44};

        printArray(arr, "Before");
        int endpoint = arr.length - 1;
        int startpoint;

        while (endpoint > 0){
            startpoint = 0;

            for(int i = 0; i < endpoint;i++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
                //Loops through and makes set startpoint to last iteration of i
                //System.out.println("i: " + i);

                startpoint = i;
            }


        endpoint = startpoint;
        }
        printArray(arr,"After");

    }

    public static void printArray(int[] arr, String name) {
        System.out.println(name);
        for (int i : arr) {
            System.out.printf("%d, ",i);
        }

    }
}
