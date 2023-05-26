#include <stdio.h>

void main(){
    int a,b;
    printf("enter the first number:");
    scanf("%i",&a);
    printf("enter the second number:");
    scanf("%i",&b);
    (a>b)?printf("%i is greater then %i",a,b):printf("%i is greater then %i",b,a);
}