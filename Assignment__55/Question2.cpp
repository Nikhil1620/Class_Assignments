#include <iostream>
using namespace std;

template <class T>
T Sub(T no1, T no2)
{
    T result = no1 - no2;
    return result;
}

int main()
{
    int iRet = Sub(20, 10);
    cout << "Integer subtraction: " << iRet << endl;   

    float fRet = Sub(20.5f, 10.3f);
    cout << "Float subtraction: " << fRet << endl;     

    double dRet = Sub(50.75, 20.25);
    cout << "Double subtraction: " << dRet << endl;   

    return 0;
}
