#include <stdio.h>
void main()
{
    int a;
    float sum = 0;
    printf("enter the value :");
    scanf("%i", &a);
    for (int g = 1; g < a + 1; g++)
    {
        sum += 1 / (float)g;
    }
    printf("the sum of harmonic progression to %i is %f", a, sum);
}