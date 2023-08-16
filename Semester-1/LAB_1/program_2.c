#include <stdio.h>

void main()
{
    float salary;
    float da, hra, m1, m2, m3;
    float gross_salary;

    printf("enter the basic salary  ");
    scanf("%f", &salary);
    printf("enter the  daily allowence in percentage ");
    scanf("%f", &da);
    printf("enter the  house rent  allowence in percentage  ");
    scanf("%f", &hra);

    m3 = (da / 100.0);
    m1 = m3 * salary;

    m2 = (float)(hra / 100) * salary;
    gross_salary = (float)salary + m1 + m2;
    printf("total salary is %f", gross_salary);
}