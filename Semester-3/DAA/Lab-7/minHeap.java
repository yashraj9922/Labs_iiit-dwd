// implementing MIN-HEAP data structure using Binary Tree

import java.util.Scanner;

public class minHeap{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Given array is ");
        printArray(arr, n);
        buildHeap(arr, n);
        System.out.println("\nMin Heap array is ");
        printArray(arr, n);
    }

    public static void buildHeap(int[] arr, int n) {
        int startIdx = (n / 2) - 1;
        for (int i = startIdx; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int smallest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
  
        if (l < n && arr[l] < arr[smallest])
            smallest = l;
  
        if (r < n && arr[r] < arr[smallest])
            smallest = r;
  
        if (smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
  
            heapify(arr, n, smallest);
        }
    }

    public static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
  
        System.out.println();
    }
}