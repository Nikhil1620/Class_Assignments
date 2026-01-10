#include <iostream>
using namespace std;

template <class T>
T Max(T a, T b, T c, T d)
{
    T max = a;

    if(b > max) max = b;
    if(c > max) max = c;
    if(d > max) max = d;

    return max;
}

int main()
{
    int iMax = Max(10, 25, 15, 20);
    cout << "Maximum integer: " << iMax << endl; 

    float fMax = Max(10.5f, 25.3f, 15.7f, 20.1f);
    cout << "Maximum float: " << fMax << endl;   

    double dMax = Max(100.5, 200.75, 150.25, 175.0);
    cout << "Maximum double: " << dMax << endl;  

    char cMax = Max('A', 'Z', 'M', 'K');
    cout << "Maximum char: " << cMax << endl;  

    return 0;
}
