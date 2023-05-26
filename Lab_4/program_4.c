#include<stdio.h>
void main(){
    int rmarks,smarks;
    printf("Enter Ram marks:");
    scanf("%i",&rmarks);
    printf("Enter Sam marks:");
    scanf("%i",&smarks);
    int dalaal;
    dalaal=rmarks;
    rmarks=smarks;
    smarks=dalaal;
    printf("Marks of Ram is %i and that of Sam is %i",rmarks,smarks);


}