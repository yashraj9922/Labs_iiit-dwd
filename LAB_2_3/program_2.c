#include <stdio.h>

void main()
{
    int a, b, c, d, e, f;
    float p;
    char y;
    long r;
    double h;

    b = sizeof(a);
    c = sizeof(p);
    d = sizeof(y);
    e = sizeof(r);
    f = sizeof(h);

    printf(" size of Int data type %i \n", b);
    printf(" size of Double data type %i \n ", f);
    printf(" size of Long data type %i \n", e);
    printf(" size of Char data type %i \n", d);
    printf(" size of Float data type %i ", c);
}