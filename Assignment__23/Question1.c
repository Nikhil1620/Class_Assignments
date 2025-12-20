//Accept N numbers from user and accept one another number as NO , check whether NO is present or not.

#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

bool CheckNumber(int Arr[], int iSize, int iNo)
{
    int iCnt = 0;

    for(iCnt = 0; iCnt < iSize; iCnt++)    
    {
        if(Arr[iCnt] == iNo)
        {
           return true; 
        }
    }
    return false;
}

int main()
{
    int iLength = 0;
    int iValue = 0;
    int iCnt = 0;
    int *ptr = NULL;
    bool bResult = false;

    printf("Enter the number of elements : ");
    scanf("%d", &iLength);

    ptr = (int *)malloc(iLength * sizeof(int));
    
    if(ptr == NULL)      
     {
        printf("Unable to allocate the memoey\n");
        return -1;
    }

    printf("Enter the elements : \n");

    for(iCnt = 0; iCnt < iLength; iCnt++)
    {
        scanf("%d",&ptr[iCnt]);
    }

    printf("Enter the number that should be search : \n");
    scanf("%d", &iValue);

    bResult = CheckNumber(ptr,iLength,iValue);
    
    if(bResult == true)
    {
        printf("The given number is present in the array.");
    }
    else
    {
        printf("The given number is not present in the array.");
    }

    free(ptr);

    return 0;

}
