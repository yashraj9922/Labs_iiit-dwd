#include <stdio.h>
void main(){
    int arr[3][3];
    for(int v=0;v<3;v++){
        for(int a=0;a<3;a++){
            printf("Enter the elemnt in %i row and %i coloumn",v+1,a+1);

            scanf("%i",&arr[v][a]);

        }
    }
    int s=arr[0][0]*((arr[1][1]*arr[2][2])-(arr[2][1]*arr[1][2]))-arr[0][1]*((arr[1][0]*arr[2][2])-(arr[2][0]*arr[1][2]))+arr[0][2]*((arr[1][0]*arr[2][1])-(arr[1][1]*arr[2][0]));
    printf("%i",s);
    
}