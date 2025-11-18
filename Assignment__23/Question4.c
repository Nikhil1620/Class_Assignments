#include<stdio.h>
#include<stdlib.h>

void DiaplayInRange(int Arr[], int iSize, int iNo1, int iNo2)
{
    int iCnt = 0;

    for(iCnt = 0; iCnt < iSize; iCnt++)    
    {
        if(Arr[iCnt] > iNo1 && Arr[iCnt] < iNo2)
        {
            printf("%d\n",Arr[iCnt]);
        }
    }
}

int main()
{
    int iLength = 0;
    int iValue1 = 0;
    int iValue2 = 0;
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

    printf("Enter the starting range : \n");
    scanf("%d", &iValue1);

    printf("Enter the the finishing end : \n");
    scanf("%d", &iValue2);

    DiaplayInRange(ptr,iLength,iValue1, iValue2);

    
    
    free(ptr);

    return 0;
}