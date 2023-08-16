#include <stdio.h>
#include <string.h>

void main()
{
    char *s;
    s = gets(s);
    printf("%c", *(s + 3));
}