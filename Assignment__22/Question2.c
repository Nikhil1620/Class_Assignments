#include<stdio.h>
#include<stdlib.h>

int DisplayDifference(int Arr[], int iSize)
{
    int iCnt = 0;
    int iEvenCount = 0;
    int iOddCount = 0;
    int iDifference = 0;


    for(iCnt = 0; iCnt < iSize; iCnt++)    
    {
        if((Arr[iCnt] % 2) == 0)
        {
            iEvenCount = iEvenCount + 1;
        }
        else
        {
            iOddCount = iOddCount + 1;
        }
    }

    iDifference = iEvenCount - iOddCount;

    if(iDifference < 0)
    {
        iDifference = -iDifference;
    }

    return iDifference;
}

int main()
{
    int iLength = 0;
    int iCnt = 0;
    int *ptr = NULL;
    int iResult = 0;

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

    iResult = DisplayDifference(ptr,iLength);
    printf("The Difference is : %d", iResult);

    free(ptr);

    return 0;
}