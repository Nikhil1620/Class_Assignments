#include <iostream>
using namespace std;

template <class T>
void Replace(T *arr, int iSize, T oldVal, T newVal)
{
    for(int i = 0; i < iSize; i++)
    {
        if(arr[i] == oldVal)
        {
            arr[i] = newVal;
        }
    }
}

int main()
{
    int arr[] = {10, 20, 10, 30, 10, 40};
    int size = 6;

    cout << "Original array: ";
    for(int i = 0; i < size; i++)
        cout << arr[i] << " ";
    cout << endl;

    Replace(arr, size, 10, 99); 

    cout << "Modified array: ";
    for(int i = 0; i < size; i++)
        cout << arr[i] << " ";
    cout << endl;

    float brr[] = {1.1f, 2.2f, 1.1f, 3.3f};
    int fsize = 4;

    cout << "Original float array: ";
    for(int i = 0; i < fsize; i++)
        cout << brr[i] << " ";
    cout << endl;

    Replace(brr, fsize, 1.1f, 9.9f);

    cout << "Modified float array: ";
    for(int i = 0; i < fsize; i++)
        cout << brr[i] << " ";
    cout << endl;

    return 0;
}
