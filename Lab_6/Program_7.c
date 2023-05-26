#include <stdio.h>
void main(){
    int year;
    printf("Enter the year :");
    scanf("%i",&year);
    if((year%4==0 && year%100!=0)||(year%400==0)){
        printf("Leap Year");

    } 
    else{
        printf("Not a leap year");
        
    }
}
