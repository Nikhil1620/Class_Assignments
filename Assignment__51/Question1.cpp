#include <iostream>
using namespace std;

template <class T>
void Display(T Ch, int No)
{
    for(int i = 1; i <= No; i++)
    {
        cout << Ch << "\t";
    }
}

int main()
{
    char cValue;
    int iValue;

    cout << "Enter the character:\n";
    cin >> cValue;

    cout << "Enter the number:\n";
    cin >> iValue;

    Display(cValue, iValue);

    return 0;
}
