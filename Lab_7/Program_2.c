#include <stdio.h>
#include<string.h>
void main(){
    char *s;
    gets(s);
    char z[100];
    

    int transfer=0;
    int len=strlen(s);
    for(int q=0;q<len;q++){
        z[q]=s[q];
        if(s[q]!=' '&& s[q]!='\0'){
            transfer++;

        }
    }
    printf("%s\n",z);
    printf("%d",transfer);
    
    



}