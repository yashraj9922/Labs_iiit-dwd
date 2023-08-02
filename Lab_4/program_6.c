#include <stdio.h>
void main()
{
    int a, b;
    printf("enter first number;");
    scanf("%i", &a);
    printf("enter the second number:");
    scanf("%i\n", &b);
    printf("Enter the Operator +,-,*,/,\n");
    char c;

    scanf("%c", &c);
    switch (c)
    {
    case '+':
        printf("sum is %i", a + b);
        break;
    case '-':
        printf("subtraction is %i", a - b);
        break;
    case '*':
        printf("Multiplication is %i", a * b);
        break;
    case '/':
        printf("Divide is %f", (float)a / b);
        break;
    case '%':
        printf("Modolous is %i", a % b);
        break;
    default:
        printf("enter a valid operator");
        break;
    }
}