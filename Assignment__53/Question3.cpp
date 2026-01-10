#include <iostream>
using namespace std;

template <class T>
T SecondMax(T *arr, int iSize)
{
    if(iSize < 2)
    {
        cout << "Array must have at least 2 elements!" << endl;
        return arr[0];  
    }

    T max, second;

    if(arr[0] > arr[1])
    {
        max = arr[0];
        second = arr[1];
    }
    else
    {
        max = arr[1];
        second = arr[0];
    }

    for(int i = 2; i < iSize; i++)
    {
        if(arr[i] > max)
        {
            second = max;
            max = arr[i];
        }
        else if(arr[i] > second && arr[i] != max)
        {
            second = arr[i];
        }
    }

    return second;
}

int main()
{
    int arr[] = {10, 20, 30, 40, 50};
    float brr[] = {1.1f, 3.3f, 2.2f, 4.4f};

    int iRet = SecondMax(arr, 5);
    cout << iRet << endl;    

    float fRet = SecondMax(brr, 4);
    cout << fRet << endl;   

    return 0;
}
