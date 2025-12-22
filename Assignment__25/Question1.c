//Accept N numbers from user and return difference between summation of even elements and summation of odd elements.

#include<stdio.h>
#include<stdlib.h>

int EvenOddDifference(int Arr[], int iSize)
{
    int iCnt = 0;
    int iEvenSum = 0;
    int iOddSum = 0;
    int iDfference = 0;

    for(iCnt = 0; iCnt < iSize; iCnt++)    
    {
        if(Arr[iCnt] % 2 == 0)
        {
           iEvenSum = iEvenSum + Arr[iCnt];
        }
    }

    for(iCnt = 0; iCnt < iSize; iCnt++)    
    {
        if(Arr[iCnt] % 2 != 0)
        {
           iOddSum = iOddSum + Arr[iCnt];
        }
    }

    iDfference = iEvenSum - iOddSum;

    if(iDfference < 0)
    {
        iDfference = -iDfference;
    }
    
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

    iResult = EvenOddDifference(ptr,iLength);

    printf("%d is the difference between the summation of even and odd numbers in the given array", iResult);
    
    free(ptr);

    return 0;

}
