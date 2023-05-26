#include<stdio.h>
void main(){
    for(int y=1;y<7;y++){
        for(int f=0;f<6-y;f++){
            printf(" ");

        }
        for(int b=1;b<y+1;b++){
            printf("%i",b);
        }
        for(int h=y-1;h>0;h--){

            printf("%i",h);

        }
        printf("\n");

    
    }
}