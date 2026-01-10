#include <iostream>
using namespace std;

template <class T>
T SumOdd(T *arr, int iSize)
{
    T sum = 0; 

    for(int i = 0; i < iSize; i++)
    {
        if(arr[i] % 2 != 0)  
        {
            sum += arr[i];
        }
    }

    return sum;
}

int main()
{
    int arr[] = {10, 15, 20, 25, 30};
    int size = 5;

    cout << "Sum of odd integers: " << SumOdd(arr, size) << endl;

    
    long larr[] = {101L, 55L, 200L, 75L};
    cout << "Sum of odd longs: " << SumOdd(larr, 4) << endl;

    return 0;
}
