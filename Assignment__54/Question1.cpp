#include <iostream>
using namespace std;

template <class T>
bool Search(T *arr, int iSize, T value)
{
    for(int i = 0; i < iSize; i++)
    {
        if(arr[i] == value)
        {
            return true;  
        }
    }
    return false; 
}

int main()
{
    int arr[] = {10, 20, 30, 40, 50};
    int size = 5;

    if(Search(arr, size, 30))
        cout << "30 found in integer array" << endl;
    else
        cout << "30 not found in integer array" << endl;

    float brr[] = {1.1f, 2.2f, 3.3f, 4.4f};
    int fsize = 4;

    if(Search(brr, fsize, 5.5f))
        cout << "5.5 found in float array" << endl;
    else
        cout << "5.5 not found in float array" << endl;

    char carr[] = {'A', 'B', 'C'};
    int csize = 3;

    if(Search(carr, csize, 'B'))
        cout << "B found in char array" << endl;
    else
        cout << "B not found in char array" << endl;

    return 0;
}
