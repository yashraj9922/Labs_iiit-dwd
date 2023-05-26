#include<stdio.h>
#include<string.h>
void main(){
    char s[100];
    gets(s);
    char z[100];
    gets(z);
    int a=strlen(s);
    int d=strlen(z);
    char g[100];
    for(int q=0;q<a;q++){
        g[q]=s[q];

    }
    for(int q=0;q<d;q++){
        g[a+q]=z[q];

    }
    g[a+d]='\0';

    printf("%s",g);
    


    

}