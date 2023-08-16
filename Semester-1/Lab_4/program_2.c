#include <stdio.h>

void main()
{
    float tsalary, bsalary;
    printf("Enter the base salary:");
    scanf("%f", &bsalary);
    int hra, da;
    if (bsalary <= 10000)
    {

        tsalary = bsalary + (bsalary * 0.2) + (bsalary * 0.8);
    }
    else if (20000 > bsalary > 10000)
    {
        tsalary = bsalary + (bsalary * 0.25) + (bsalary * 0.9);
    }
    else
    {
        tsalary = bsalary + (bsalary * 0.3) + (bsalary * 0.95);
    }
    printf("Net salary is %f", tsalary);
}