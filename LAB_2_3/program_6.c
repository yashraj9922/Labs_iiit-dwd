#include <stdio.h>
void main(){
    printf("Even numbers from 1 to 100 are:\n");
    for(int y=1;y<101;y++){
        if(y%2==0){
            printf("%i\n",y);

        }
    }
}