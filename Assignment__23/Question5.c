#include<stdio.h>
#include<stdlib.h>

int OddMultiplication(int Arr[], int iSize)
{
    int iCnt = 0;
    int iMulti = 1;

    for(iCnt = 0; iCnt < iSize; iCnt++)    
    {
        if(Arr[iCnt] % 2 != 0)
        {
           iMulti = iMulti * Arr[iCnt];
        }
    }
    return iMulti;
    
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

    iResult = OddMultiplication(ptr,iLength);

    printf("%d is the product of all the odd elements in the given array.",iResult);
    
    free(ptr);

    return 0;
}