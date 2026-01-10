#include <iostream>
using namespace std;

template <class T>
T Add(T no1, T no2)
{
    T sum = no1 + no2;
    return sum;
}

int main()
{
    int iRet = Add(10, 20);
    cout << iRet << endl;   

    float fRet = Add(10.5f, 20.3f);
    cout << fRet << endl;   

    double dRet = Add(10.25, 20.75);
    cout << dRet << endl; 

    return 0;
}
