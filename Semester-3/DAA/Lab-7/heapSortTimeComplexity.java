public class heapSortTimeComplexity {

    public static void main(String[] args) {
        int[] inputSizes = { 100, 1000, 10000, 100000, 1000000 };

        for (int size : inputSizes) {
            int[] arr = generateRandomArray(size);
            long startTime = System.nanoTime();
            heapSort(arr);
            long endTime = System.nanoTime();
            long duration = endTime - startTime;
            System.out.println("Input Size: " + size + ", Time (ns): " + duration);
        }
    }

    public static void heapSort(int arr[]) {
        int n = arr.length;

        // Build max heap
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);

        // One by one extract an element from the heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int arr[], int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }

    public static int[] generateRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        return arr;
    }
}
