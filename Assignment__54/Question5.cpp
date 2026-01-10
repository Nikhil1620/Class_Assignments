#include <iostream>
using namespace std;

template <class T>
T Min(T *arr, int iSize)
{
    if(iSize <= 0)
    {
        cout << "Array must have at least one element!" << endl;
        return arr[0]; 
    }

    T min = arr[0];

    for(int i = 1; i < iSize; i++)
    {
        if(arr[i] < min)
        {
            min = arr[i];
        }
    }

    return min;
}

int main()
{
    int arr[] = {10, 20, 5, 30, 40};
    float brr[] = {3.3f, 1.1f, 2.2f, 4.4f};

    int iRet = Min(arr, 5);
    cout << "Smallest integer: " << iRet << endl;   

    float fRet = Min(brr, 4);
    cout << "Smallest float: " << fRet << endl;   

    return 0;
}
