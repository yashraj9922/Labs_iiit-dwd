#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <math.h>

void insertionSort(int arr[], int n)
{
    int i, j, key;
    for (i = 1; i < n; i++)
    {
        key = arr[i];
        j = i - 1;
        while (j >= 0 && arr[j] > key)
        {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }
}

int main()
{
    int n, i;
    struct timespec start, end;
    double total;

    printf("Enter the size of array: ");
    scanf("%d", &n);
    int arr[n];

    printf("Enter the elements of array: ");
    for (i = 0; i < n; i++)
    {
        // arr[i] = rand() % 10;
        arr[i] = rand() % 1000;
    }

    printf("Array before sorting: ");
    for (i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }

    clock_gettime(CLOCK_MONOTONIC, &start);
    insertionSort(arr, n);
    clock_gettime(CLOCK_MONOTONIC, &end);

    printf("\nArray after sorting: ");
    for (i = 0; i < n; i++)
    {
        printf("%d ", arr[i]);
    }

    total = (end.tv_sec - start.tv_sec) + (double)(end.tv_nsec - start.tv_nsec) / 1e9;
    printf("\nTime taken is: %f seconds\n", total);

    return 0;
}
//Time Taken
// array size 50: 0.000005
//array size 100: 0.0000014
//array size 200: 0.0000029