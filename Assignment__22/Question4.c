#include<stdio.h>
#include<stdlib.h>

int CountEleven(int Arr[], int iSize)
{
    int iCnt = 0;

    int iElevenCount = 0;

    for(iCnt = 0; iCnt < iSize; iCnt++)    
    {
        if(Arr[iCnt] == 11)
        {
            iElevenCount = iElevenCount + 1;
        }
    }

    return iElevenCount;
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

    iResult = CountEleven(ptr,iLength);
    printf("The frequency of number 11 in the given array is : %d", iResult);

    free(ptr);

    return 0;
}