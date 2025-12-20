//Accept N numbers from user and accept one another number as NO , return index of first occurrence of that NO. 

#include<stdio.h>
#include<stdlib.h>

int FirstOcc(int Arr[], int iSize, int iNo)
{
    int iCnt = 0;

    for(iCnt = 0; iCnt < iSize; iCnt++)    
    {
        if(Arr[iCnt] == iNo)
        {
           return iCnt;
           break;
        }
    }
    return -1;
    
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

    printf("Enter the number that should be search : \n");
    scanf("%d", &iValue);

    iResult = FirstOcc(ptr,iLength,iValue);

    if(iResult == -1)
    {
        printf("%d", iResult);
    }
    else
    {
        printf("%d", iResult);
    }
    
    free(ptr);

    return 0;

}
