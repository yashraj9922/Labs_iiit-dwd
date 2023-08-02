#include <stdio.h>
void main()
{
    int array[3][2]={{1,5,},{1,9},{5,2}};

    int even=0,odd=0;
    for(int g=0;g<3;g++){
        for(int k=0;k<2;k++){
            if(array[g][k]%2==0){
                even++;

            }
            else{
                odd++;

            }
        }
    }
    printf("Frequency of even is %i and of odd is %i",even,odd);
    
}