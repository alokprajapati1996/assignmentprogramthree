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
    public static void largestElement(int arr[]){

        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("maximum value in element:"+max);
    }
    public static void smallestElement(int arr[]) {
        int small = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        System.out.println("maximum value in element:" + small);
    }
    public static void evenPosition(int arr[]){
        System.out.println("output array");
        for (int i = 1; i < arr.length; i=i+2) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void oddPosition(int arr[]){
        System.out.println("output array");
        for (int i = 0; i < arr.length; i=i+2) {
            System.out.print(arr[i]+" ");
        }
    }public static void reverseOrder(int arr[]) {
        System.out.println("print element of array in reverse order");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void printDublicate(int arr[]){
        System.out.println("dublicte element of array");
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }

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
            largestElement(arr);
            smallestElement(arr);
            evenPosition(arr);
            oddPosition(arr);
            reverseOrder(arr);
            printDublicate(arr);
    }
}