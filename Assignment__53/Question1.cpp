#include <iostream>
using namespace std;

template <class T>
void CopyArray(T *src, T *dest, int iSize)
{
    for(int i = 0; i < iSize; i++)
    {
        dest[i] = src[i];
    }
}

int main()
{
    int arr[] = {10, 20, 30, 40, 50};
    int brr[5];

    CopyArray(arr, brr, 5);

    for(int i = 0; i < 5; i++)
    {
        cout << brr[i] << " ";
    }

    cout << endl;

    float x[] = {1.1f, 2.2f, 3.3f};
    float y[3];

    CopyArray(x, y, 3);

    for(int i = 0; i < 3; i++)
    {
        cout << y[i] << " ";
    }

    return 0;
}
