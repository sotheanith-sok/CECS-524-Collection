//Imports
#include <stdio.h>

//Prototypes
int doOp(int (*OpType)(int, int), int a, int b);
int add(int a, int b);
int sub(int a, int b);
int mul(int a, int b);
int div(int a, int b);

int main()
{
    printf("%d\n", doOp(add, 2, 2));
    printf("%d\n", doOp(sub, 2, 2));
    printf("%d\n", doOp(mul, 2, 2));
    printf("%d\n", doOp(div, 2, 2));

    return 0;
}

int add(int a, int b)
{
    return a + b;
}
int sub(int a, int b)
{
    return a - b;
}
int mul(int a, int b)
{
    return a * b;
}
int div(int a, int b)
{
    return a / b;
}

int doOp(int (OpType)(int, int), int a, int b)
{
    return OpType(a, b);
}
