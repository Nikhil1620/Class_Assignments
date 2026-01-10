#include <iostream>
using namespace std;

template <class T>
void Swap(T &no1, T &no2)
{
    T temp = no1;
    no1 = no2;
    no2 = temp;
}

int main()
{
    int a = 10, b = 20;
    cout << "Before swap: a = " << a << ", b = " << b << endl;
    Swap(a, b);
    cout << "After swap: a = " << a << ", b = " << b << endl;

    float x = 3.5f, y = 7.8f;
    cout << "Before swap: x = " << x << ", y = " << y << endl;
    Swap(x, y);
    cout << "After swap: x = " << x << ", y = " << y << endl;

    char c1 = 'A', c2 = 'Z';
    cout << "Before swap: c1 = " << c1 << ", c2 = " << c2 << endl;
    Swap(c1, c2);
    cout << "After swap: c1 = " << c1 << ", c2 = " << c2 << endl;

    return 0;
}
