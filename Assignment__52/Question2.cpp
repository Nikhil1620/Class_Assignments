#include <iostream>
using namespace std;

template<class T>
T Max(T no1, T no2, T no3)
{
    T max;

    if(no1 >= no2 && no1 >= no3)
    {
        max = no1;
    }
    else if(no2 >= no1 && no2 >= no3)
    {
        max = no2;
    }
    else
    {
        max = no3;
    }

    return max;
}

int main()
{
    cout << Max(10, 20, 30) << endl;      
    cout << Max(10.5, 5.2, 7.8) << endl; 
    return 0;
}
