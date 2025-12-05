#include<stdio.h>
#include<stdbool.h>

bool Check(char *str)
{
    
    if((*str >= 'A' && *str <= 'Z'))
    {
        return false;
    }
    else if((*str >= 'a' && *str <= 'z'))
    {
        return false;
    }
    else if((*str >= 0 && *str <= 9))
    {
        return false;
    }
    else
    {
        return true;
    }

}

int main()
{
    char Arr[50] = "\0";
    bool bRet = false;

    printf("Enter the String : \n");
    scanf("%[^\n]s",Arr);

    bRet = Check(Arr);
    
    if(bRet == true)
    {
        printf("It is a special character");
    }
    else
    {
        printf("It is not a special character");
    }

    return 0;
}