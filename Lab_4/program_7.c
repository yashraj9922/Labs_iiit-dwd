#include <stdio.h>


void main(){
    char type;
    printf("Enter the type of object:");
    scanf("%c",&type);
    if(type=='s'){
        int a;
        printf("Enter the Sides of Square:");
        scanf("%i",&a);
        printf("Area of Square is %i",a*a);


    }
    else if(type=='r'){
        int a,b;
        printf("Enter the Sides of Rectangle:");
        scanf("%i",&a);
        printf("Enter the Breadth of Rectangle:");
        scanf("%i",&b);
        printf("Area of Rectangle is %i",a*b);
        

    }
    else if(type=='t'){
        int a,b;
        printf("Enter the base of Triangle:");
        scanf("%i",&a);
        printf("Enter the height of Triangle:");
        scanf("%i",&b);
        printf("Area of triangle is %f",a*b*0.5);
        

    }
    else if(type=='c'){
        int a;
        printf("Enter the radius of Circle:");
        scanf("%i",&a);
        printf("Area of Circle is %f",3.14*a*a);

        

    }
    
}