#include <stdio.h>
void main()
{
    int array[3][3] = {{1, 6, 7}, {6, 8, 3}, {6, 8, 1}};
    int marray[3][3];
    for (int a = 0; a < 3; a++)
    {
        for (int g = 0; g < 3; g++)
        {
            marray[a][g] = array[g][a];
        }
    }
    printf("After transversing the matrices\n");
    for (int a = 0; a < 3; a++)
    {
        for (int g = 0; g < 3; g++)
        {
            printf("%i", marray[a][g]);
            printf(" ");
        }
        printf("\n");
    }
}