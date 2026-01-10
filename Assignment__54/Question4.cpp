#include <iostream>
using namespace std;

template <class T>
void Reverse(T *arr, int iSize)
{
    int start = 0;
    int end = iSize - 1;
    T temp;

    while(start < end)
    {
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        start++;
        end--;
    }
}

int main()
{
    int arr[] = {10, 20, 30, 40, 50};
    int size = 5;

    cout << "Original array: ";
    for(int i = 0; i < size; i++)
        cout << arr[i] << " ";
    cout << endl;

    Reverse(arr, size);

    cout << "Reversed array: ";
    for(int i = 0; i < size; i++)
        cout << arr[i] << " ";
    cout << endl;

    float brr[] = {1.1f, 2.2f, 3.3f};
    int fsize = 3;

    cout << "Original float array: ";
    for(int i = 0; i < fsize; i++)
        cout << brr[i] << " ";
    cout << endl;

    Reverse(brr, fsize);

    cout << "Reversed float array: ";
    for(int i = 0; i < fsize; i++)
        cout << brr[i] << " ";
    cout << endl;

    return 0;
}
