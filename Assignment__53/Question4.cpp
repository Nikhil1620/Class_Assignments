#include <iostream>
using namespace std;

template <class T>
T SecondMin(T *arr, int iSize)
{
    if(iSize < 2)
    {
        cout << "Array must have at least 2 elements!" << endl;
        return arr[0]; 
    }

    T min, second;

    if(arr[0] < arr[1])
    {
        min = arr[0];
        second = arr[1];
    }
    else
    {
        min = arr[1];
        second = arr[0];
    }

    for(int i = 2; i < iSize; i++)
    {
        if(arr[i] < min)
        {
            second = min;
            min = arr[i];
        }
        else if(arr[i] < second && arr[i] != min)
        {
            second = arr[i];
        }
    }

    return second;
}

int main()
{
    int arr[] = {10, 20, 5, 30, 40};
    float brr[] = {3.3f, 1.1f, 2.2f, 4.4f};

    int iRet = SecondMin(arr, 5);
    cout << iRet << endl;     

    float fRet = SecondMin(brr, 4);
    cout << fRet << endl;    

    return 0;
}
