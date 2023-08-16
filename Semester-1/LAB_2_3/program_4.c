#include <stdio.h>
void main()
{
    int a, b;
    printf("Enter the first number:");
    scanf("%i", &a);
    printf("Enter the second number:");
    scanf("%i", &b);
    a = a + b;
    b = a - b;
    a = a - b;

    printf("Before swap numbers are first= %i and second =%i\n", b, a);
    printf("after swap first=%i and second=%i", a, b);
}