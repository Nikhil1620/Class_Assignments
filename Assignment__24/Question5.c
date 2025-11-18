#include<stdio.h>
#include<stdlib.h>

void DigitSum(int Arr[], int iSize)
{
    int iCnt = 0;
    int iDigit = 0;

    for(iCnt = 0; iCnt < iSize; iCnt++)    
    {
        int iSum = 0;     //Need to rembember

        while(Arr[iCnt] != 0)
        {
            iDigit = Arr[iCnt] % 10;
            iSum = iSum + iDigit;
            Arr[iCnt] = Arr[iCnt] /10;
        }

        printf("%d\n", iSum);
    }
}

int main()
{
    int iLength = 0;
    int iCnt = 0;
    int *ptr = NULL;

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

    DigitSum(ptr,iLength);
    
    free(ptr);

    return 0;
}