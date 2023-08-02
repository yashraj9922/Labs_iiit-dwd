#include <stdio.h>

void main()
{
    long i;
    printf("Enter the number:");
    scanf("%d", &i);
    int sum = 0;

    while (i != 0)
    {
        sum += i % 10;
        i = i / 10;
    }
    printf("Sum is %i", sum);
}