#include <stdio.h>

void main(){
    int n1,n2;
    scanf("%d %d",&n1,&n2);
    int matrix[n1][n2];
    for(int g=0;g<n1;g++){
        for(int d=0;d<n2;d++){
            printf("Enter the element ant %i Row and %i Coloumn:",g+1,d+1);
            scanf("%i",&matrix[g][d]);


            
            
        }

    }
    for (int i = 0; i < n1; i++) {
        for (int j = 0; j < n2; j++) {
            for (int k = j + 1; k < n2; k++) {
                if (matrix[i][j] > matrix[i][k]) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[i][k];
                    matrix[i][k] = temp;
                }
            }
        }
    }
    for (int i = 0; i < n2; i++) {
        for (int j = 0; j < n1; j++) {
            for (int k = j + 1; k < n1; k++) {
                if (matrix[j][i] < matrix[k][i]) {
                    int temp = matrix[j][i];
                    matrix[j][i] = matrix[k][i];
                    matrix[k][i] = temp;
                }
            }
        }
    }
  
    for(int g=0;g<n1;g++){
        for(int d=0;d<n2;d++){
            
            printf("%i",matrix[g][d]);
            printf(" ");



            
            
        }
        printf("\n");


    }
    
}
