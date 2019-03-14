/*
@author: Sotheanith Sok
@description: Lab 10 for CECS 524
*/

#include <iostream>
using namespace std;

void calcAddress(int base, int rowlb, int collb, int rowub, int colub, int elementsize);

int main()
{
    cout << "calcAddress(1200, 0, 0, 2, 2, 1);" << endl;
    calcAddress(1200, 0, 0, 2, 2, 1);
    cout << "----------------------------------" << endl;
    cout << "calcAddress(100, 1, 1, 2, 2, 2);" << endl;
    calcAddress(100, 1, 1, 2, 2, 2);
    cout << "----------------------------------" << endl;
    cout << "calcAddress(100, 2, 3, 4, 5, 4);" << endl;
    calcAddress(100, 2, 3, 4, 5, 4);
    cout << "----------------------------------" << endl;
    cout << "calcAddress(100, -1, -1, 1, 2, 8);" << endl;
    calcAddress(100, -1, -1, 1, 2, 8);
    return 0;
}

/*
Function uses to calculate the address
*/
void calcAddress(int base, int rowlb, int collb, int rowub, int colub, int elementsize)
{
    int n = colub - collb + 1;
    for (int i = rowlb; i <= rowub; i++)
    {
        for (int j = collb; j <= colub; j++)
        {
            int result = base - (((rowlb * n) + collb) * elementsize) + (((i * n) + j) * elementsize);
            cout << "a[" << i << "," << j << "] address = " << result << endl;
        }
    }
}