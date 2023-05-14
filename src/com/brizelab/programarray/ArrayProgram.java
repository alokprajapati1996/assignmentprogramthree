package com.brizelab.programarray;
import java.util.Scanner;
public class ArrayProgram {
    public static void printArray(int arr[]) {
        System.out.println("output array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }}
    public static void printFrequency( int arr[]){
        int frequency[]=new int[arr.length];
        for (int i = 0; i <arr.length ; i++) {
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    frequency[j] = -1;
                }
            }
            if (frequency[i] != -1) {
                frequency[i] = count;
            }
        }
        System.out.println("Elements of arrayf ----> frequency");
        for (int i = 0; i < frequency.length ; i++) {
            if (frequency[i] != -1) {
                System.out.println("     " + arr[i] + "        " + frequency[i]);

            }
        }
    }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size of Array");
            int size = sc.nextInt();
            int arr[] = new int[size];
            System.out.println("Enter element of array");
            for (int i = 0; i < size; i++) {
                arr[i] = sc.nextInt();
            }
            printArray(arr);
            printFrequency(arr);
    }
}
