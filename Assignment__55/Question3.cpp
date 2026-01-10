#include <iostream>
using namespace std;

template <class T>
T Div(T no1, T no2)
{
    if(no2 == 0)
    {
        cout << "Error: Division by zero!" << endl;
        return 0; 
    }

    T result = no1 / no2;
    return result;
}

int main()
{
    int iRet = Div(20, 10);
    cout << "Integer division: " << iRet << endl; 

    float fRet = Div(20.5f, 10.25f);
    cout << "Float division: " << fRet << endl;     

    return 0;
}
