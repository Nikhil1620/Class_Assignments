//Accept N numbers from user and display all such elements which are divisible by 3 and 5.

#include<stdio.h>
#include<stdlib.h>

void DivisiblebyThreeFive(int Arr[], int iSize)
{
    int iCnt = 0;

    for(iCnt = 0; iCnt < iSize; iCnt++)    
    {
        if(Arr[iCnt] % 5 == 0 && Arr[iCnt] % 3 ==0)
        { 
           printf("%d\n", Arr[iCnt]);
        }
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

    DivisiblebyThreeFive(ptr,iLength);
    
    free(ptr);

    return 0;

}
