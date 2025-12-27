/*Accept number of rows and number of columns from user and display below pattern.
Input : iRow = 4 iCol = 4
Output : 2 4 6 8 10
         1 3 5 7 9
         2 4 6 8 10 
*/

#include<stdio.h>

void Display(int iRow, int iCol)
{
    int i = 0;
    int j = 0;

    for(i = 1; i <= iRow; i++)
    {
        int iNo1 = 2;
        int iNo2 = 1;

        for(j = 1; j <= iCol; j++)
        {
            if(i % 2 != 0)
            {
                printf("%d\t",iNo1);
                iNo1 = iNo1 + 2;
            }
            else
            {
                printf("%d\t",iNo2);
                iNo2 = iNo2 + 2;
            }
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
