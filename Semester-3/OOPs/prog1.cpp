/* 1. Create the equivalent four-function calculator. The program should request the user to
enter a number, an operator, and another number. It should then carry out the specified
arithmetical operation: adding, multiplying, or dividing the two numbers. (It should use a
switch statement to select the operation). Finally, it should display the result. When it finishes
the calculation, the program should ask if the user wants to do another calculation. The
response can be ‘Y’ or ‘N’*/

#include <iostream>
using namespace std;

int main()
{
    char ch;
    do
    {
        int a, b;
        char op;
        cout << "Enter two numbers: ";
        cin >> a >> b;
        cout << "Enter the operator: ";
        cin >> op;

        switch (op)
        {
        case '+':
            cout << "Sum: " << a + b << endl;
            break;
        case '-':
            cout << "Difference: " << a - b << endl;
            break;
        case '*':
            cout << "Product: " << a * b << endl;
            break;
        case '/':
            cout << "Quotient: " << a / b << endl;
            break;
        default:
            cout << "Invalid operator" << endl;
        }

        cout << "Do you want to continue? (Y/N): ";
        cin >> ch;
    } while (ch == 'Y' || ch == 'y');
    return 0;
}