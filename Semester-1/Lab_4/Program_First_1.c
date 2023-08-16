#include <stdio.h>
void main()
{
    long a = 155000;
    long tamount;
    float bamount = (float)(1550000 - 85000) / 60;
    float pmonth = bamount + (bamount * 0.16);
    float total = pmonth;
    printf("total amount he will pay is %f", total);
}