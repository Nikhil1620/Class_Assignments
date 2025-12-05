#include <stdio.h>
#include <ctype.h>

int main() 
{
    int iCnt = 0;

    for (iCnt = 0; iCnt <= 255; iCnt++) 
    {
        printf("  %3d\t\t%03o\t%02X\t", iCnt, iCnt, iCnt);

        if (isprint(iCnt)) 
        {
            printf("%c\n", iCnt);
        } 
        else 
        {
            printf("Non-printable\n");
        }
    }

    return 0;
}
