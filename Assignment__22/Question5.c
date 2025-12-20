//Accept N numbers from user and accept one another number as NO return frequency of NO form it.
    
#include<stdio.h>
#include<stdlib.h>

int Count(int Arr[], int iSize, int iNo)
{
    int iCnt = 0;c

    int iCount = 0;

    for(iCnt = 0; iCnt < iSize; iCnt++)    
    {
        if(Arr[iCnt] == iNo)
        {
            iCount = iCount + 1;
        }
    }

    return iCount;
}

int main()
{
    int iLength = 0;
    int iValue = 0;
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

    printf("Enter the number that should be count : \n");
    scanf("%d", &iValue);

    iResult = Count(ptr,iLength,iValue);
    printf("The frequency of given number in the given array is : %d", iResult);

    free(ptr);

    return 0;

}
