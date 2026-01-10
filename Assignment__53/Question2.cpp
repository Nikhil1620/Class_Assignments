#include <iostream>
using namespace std;

template <class T>
bool CheckSorted(T *arr, int iSize)
{
    for(int i = 0; i < iSize - 1; i++)
    {
        if(arr[i] > arr[i + 1])
        {
            return false;
        }
    }
    return true;
}

int main()
{
    int arr[] = {10, 20, 30, 40, 50};
    float brr[] = {1.1f, 2.2f, 3.3f};

    cout << CheckSorted(arr, 5) << endl;   
    cout << CheckSorted(brr, 3) << endl;  

    int crr[] = {10, 30, 20};
    cout << CheckSorted(crr, 3) << endl;   

    return 0;
}
