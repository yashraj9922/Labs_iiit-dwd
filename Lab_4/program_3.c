#include<stdio.h>

void main(){
    float ctemp,ftemp;
    printf("Enter the temp in celsius:");
    scanf("%f",&ctemp);
    ftemp=(ctemp* 9/5) +32;
    printf("Temp in Fahrenheit is %f",ftemp);


}