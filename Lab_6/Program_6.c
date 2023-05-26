#include <stdio.h>
void main(){
    int a,b;
    printf("enter two numbers");
    scanf("%i %i",&a,&b);
    int temp;
    int A=a*b;
    while (b != 0) {
        temp = b;
        b = a % b;
        a = temp;
    }
    printf("Hcf is %i\n",a);
    printf("LCm is %i",(A/a));

}