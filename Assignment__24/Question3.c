//Accept N numbers from user and return the difference between largest and smallest number. 


#include<stdio.h>
#include<stdlib.h>

int Difference(int Arr[], int iSize)
{
    int iCnt = 0;
    int iMax = Arr[0];
    int iMin = Arr[0];
    int iDfference = 0;

    for(iCnt = 0; iCnt < iSize; iCnt++)    
    {
        if(Arr[iCnt] > Arr[0])
        {
           iMax = Arr[iCnt];
        }
    }

    for(iCnt = 0; iCnt < iSize; iCnt++)    
    {
        if(Arr[iCnt] < Arr[0])
        {
           iMin = Arr[iCnt];
        }
    }

    iDfference = iMax - iMin;

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

    iResult = Difference(ptr,iLength);

    printf("%d is the difference between the maximum and minimum number in the given array", iResult);
    
    free(ptr);

    return 0;

}

