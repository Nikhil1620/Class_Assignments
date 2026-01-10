#include <iostream>
using namespace std;

template<class T>
T Max(T *arr, int iSize)
{
    T iMax = arr[0];
    int i = 0;

    for(i = 1; i < iSize; i++)
    {
        if(arr[i] > iMax)
        {
            iMax = arr[i];
        }
    }
    return iMax;
}

int main()
{
    int arr[] = {10, 20, 30, 40, 50};
    float brr[] = {10.0f, 3.7f, 9.8f, 8.7f};

    int iRet = Max(arr, 5);
    cout << iRet << endl;      

    float fRet = Max(brr, 4);
    cout << fRet << endl;     

    return 0;
}
