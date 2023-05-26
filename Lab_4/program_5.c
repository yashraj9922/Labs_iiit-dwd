#include<stdio.h>
void main(){
    int r_age,r_class,r_mathsmarks,r_sciencemarks;
    int s_age,s_class,s_mathsmarks,s_sciencemarks;
    printf("Enter Ram's details:\n");
    printf("Enter age:");
    scanf("%i",&r_age);
    printf("Enter class:");
    scanf("%i",&r_class);
    printf("Enter Marks in Mathematics:");
    scanf("%i",&r_mathsmarks);
    printf("Enter Marks in Science:");
    scanf("%i",&r_sciencemarks);
    printf("Enter Sam's details:\n");
    printf("Enter age:");
    scanf("%i",&s_age);
    printf("Enter class:");
    scanf("%i",&s_class);
    printf("Enter Marks in Mathematics:");
    scanf("%i",&s_mathsmarks);
    printf("Enter Marks in Science:");
    scanf("%i",&s_sciencemarks);
    printf("Ram and Sam are of same age?\n");
    if(r_age==s_age){
        printf("True\n");

    }
    else{
        printf("False\n");
    }
    printf("Ram and Sam are in same class ?\n ");
    if(r_class==s_class){
        printf("True\n");

    }
    else{
        printf("False\n");
    }
    printf("Ram and Sam scored same marks in Math's?\n");
    if(r_mathsmarks==s_mathsmarks){
        printf("True\n");

    }
    else{
        printf("False\n");
    }
    printf("Ram and Sam scored same marks in Science?\n");
    if(s_sciencemarks==r_sciencemarks){
        printf("True\n");

    }
    else{
        printf("False\n");
    }



}