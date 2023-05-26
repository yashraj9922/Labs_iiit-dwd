#include<stdio.h>
void main(){
    int a,b;
    printf("enter the first number:");
    scanf("%i",&a);
    printf("Enter the second number:");
    scanf("%i",&b);
    int sum=0;

    for(int f=a;f<b+1;f++){
        if(f!=1){
            for(int d=2;d<f;d++){
                if(f%d==0){
                    sum++;
                    



                }
                
            }
            if(sum==0){
                printf("%i is prime number\n",f);
            }
            else{
                printf("%i is a composite number\n",f);

            }
            sum=0;
            

        }
        else{
            printf("1 is a prime number\n");
        }


    }
}    
