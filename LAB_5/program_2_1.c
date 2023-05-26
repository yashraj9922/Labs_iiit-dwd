#include<stdio.h>
void main(){
    int a=65;
    
    for(int i=0;i<6;i++){
        for(int n=0;n<i;n++){
            printf(" ");
        }
        for(int f=0;f<6-i;f++){
            printf("%c",65+f);
            printf(" ");

        }
        for(int v=0;v<i;v++){
            printf(" ");

        }
        printf("\n");

        
    }
}