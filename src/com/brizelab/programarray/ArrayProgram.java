package com.brizelab.programarray;
import java.util.Scanner;
public class ArrayProgram {
    public static void printArray(int arr[]) {
        System.out.println("output array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }}
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
    }
}
