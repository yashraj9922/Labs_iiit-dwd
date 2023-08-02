#include <stdio.h>
#include <string.h>
void main()
{
    char s[100];

    gets(s);

    int len = 0;
    while (*s != '\0')
    {
        len++;
    }
    printf("%i", len);
}