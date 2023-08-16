#include <stdio.h>
#include <string.h>

void main()
{

    char s[100];
    gets(s);

    int vowel = 0, consonants = 0, t = 0;
    while (s[t] != '\0')
    {
        if (s[t] == 'a' || s[t] == 'e' || s[t] == 'i' || s[t] == 'o' || s[t] == 'u')
        {
            vowel++;
        }
        else if (s[t] == ' ' || s[t] == '\0')
        {
        }
        else
        {
            consonants++;
        }
        t++;
    }
    printf("%d %i", vowel, consonants);
}