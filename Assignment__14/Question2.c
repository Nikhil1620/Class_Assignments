#include<stdio.h>
#include<stdbool.h>

bool Display(int iNo)
{
    int iDigit = 0;

    if(iNo < 0)
    {
        iNo = -iNo;
    }

    while(iNo !=0)
    {
        iDigit = iNo % 10;
        if(iDigit == 0)   //////
        {                     //                      
            return true;      //Need to remember
        }                     //  
        iNo = iNo / 10;   //////
    }
    
    return false;

}

int main()
{
    int iValue = 0;
    bool iResult = false;

    printf("Enter the number : \n");
    scanf("%d", &iValue);

    iResult = Display(iValue);

    if(iResult == true)
    {
        printf("It does contain Zero");
    }
    else
    {
        printf("It does not contain Zero.");
    }
    
    return 0;
}
