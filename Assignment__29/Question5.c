/*
Accept number of rows and number of columns from user and display below pattern.
Input : iRow = 4 iCol = 4
Output : 1 2 3 4
         2 3 4 5
         3 4 5 6
         4 5 6 7
*/

#include<stdio.h>

void Display(int iRow, int iCol)
{
    int i = 0;
    int j = 0;

    for(i = 1; i <= iRow; i++)
    {
        int iNo = i;

        for(j = 1; j <= iCol; j++)
        {
            printf("%d\t", iNo);
            iNo++ ;
        }
        printf("\n");
    }
}


int main()
{
    int iValue1 = 0;
    int iValue2 = 0;

    printf("Enter the number of rows : \n");
    scanf("%d",&iValue1);

    printf("Enter the number of coloumns : \n");
    scanf("%d",&iValue2);

    Display(iValue1, iValue2);

    return 0;

}
