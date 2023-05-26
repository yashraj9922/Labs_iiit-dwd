#include<stdio.h>
#include <math.h>


void main(){

	float p, t, r, si,ci;
	float mid;

	 
	printf("Enter principal amount (p): ");
	scanf("%f", &p);
	printf("Enter time in year (t): ");
	scanf("%f", &t);
	printf("Enter rate in percent (r): ");
	scanf("%f", &r);
	
	 
	si = (p * t * r)/100.0;

	mid=pow(1+r/100,t);
	ci=p*(mid-1);



	



	

	 
	
	
	 printf("Simple Interest = %f \n", si);
	 printf("compound interest = %f \n", ci);
	 


	 

}