import java.util.Scanner;

public class maxHeap {
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
        System.out.println("\nMax Heap array is ");
        printArray(arr, n);
    }

    public static void buildHeap(int[] arr, int n) {
        int startIdx = (n / 2) - 1;
        for (int i = startIdx; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;
  
        if (l < n && arr[l] > arr[largest])
            largest = l;
  
        if (r < n && arr[r] > arr[largest])
            largest = r;
  
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
  
            heapify(arr, n, largest);
        }
    }

    public static void printArray(int[] arr, int n) {
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
  
        System.out.println();
    }   
}
