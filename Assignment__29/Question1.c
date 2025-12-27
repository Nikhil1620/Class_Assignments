/*Accept number of rows and number of columns from user and display below pattern.
Input : iRow = 4 iCol = 4
Output : 1 2 3 4
         5 6 7 8
         9 1 2 3 
*/

#include<stdio.h>

void Display(int iRow, int iCol)
{
    int i = 0;
    int j = 0;
    int iNo1 = 1;
    int iNo2 = 1;

    for(i = 1; i <= iRow; i++)
    {
        for(j = 1; j <= iCol; j++)
        {
            if(iNo1 >= 1 && iNo1 <= 9)
            {
                printf("%d\t",iNo1);
                iNo1++;
            }
            else
            {
                printf("%d\t",iNo2);
                iNo2++;
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
