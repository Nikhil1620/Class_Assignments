//Accept N numbers from user and return difference between frequency of even number and odd numbers.

#include<stdio.h>
#include<stdbool.h>
#include<stdlib.h>


bool CheckEleven(int Arr[], int iSize)
{
    int iCnt = 0;

    

    for(iCnt = 0; iCnt < iSize; iCnt++)    
    {
        if(Arr[iCnt] == 11)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

}

int main()
{
    int iLength = 0;
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

    bResult = CheckEleven(ptr,iLength);

    if(bResult == true)
    {
        printf("The given array contains number 11.");
    }
    else
    {
        printf("The given array does not contain number 11.");
    }

    free(ptr);

    return 0;

}
