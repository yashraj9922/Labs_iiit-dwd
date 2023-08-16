#include <stdio.h>

void main()
{
    int n;
    printf("Enter the Number of Elements:");
    scanf("%d", &n);
    int array[n];
    printf("Enter the elements in Array\n");
    for (int y = 0; y < n; y++)
    {
        scanf("%d", &array[y]);
    }
    for (int f = 0; f < n - 1; f++)
    {
        for (int v = f + 1; v < n; v++)
        {
            if (array[f] > array[v])
            {
                int p = array[f];
                array[f] = array[v];
                array[v] = p;
            }
        }
    }
    printf("After Sorting Array is");
    for (int y = 0; y < n; y++)
    {
        printf("%i\n", array[y]);
    }
}
