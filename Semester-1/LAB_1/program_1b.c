#include <stdio.h>

void main()
{
    float a, b;

    float c;

    printf("enter first number :");
    scanf("%f", &a);
    printf("enter second number :");
    scanf("%f", &b);
    printf("sum is %f \n", a + b);
    printf("subtract is  %f \n", a - b);
    printf("multiplication  %f \n", a * b);
    c = (float)a / b;

    printf("divide is %f", c);
}