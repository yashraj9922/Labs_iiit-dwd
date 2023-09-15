/*2. Create a class complex with two integer data members as real and imaginary. Design a
method to input the complex number, design a function to perform addition operation
between the two complex numbers by overloading the + operator. Finally display the result.*/

#include <iostream>
using namespace std;

class Complex{
    int real, imaginary;
    public:
        void input(){
            cout << "Enter real part: ";
            cin >> real;
            cout << "Enter imaginary part: ";
            cin >> imaginary;
        }
        void display(){
            cout << real << " + " << imaginary << "i" << endl;
        }

        Complex operator+(Complex c){
            Complex temp;
            temp.real = real + c.real;
            temp.imaginary = imaginary + c.imaginary;
            return temp;
        }
};

int main(){
    Complex c1, c2, c3;
    c1.input();
    c2.input();
    c3 = c1 + c2;
    c3.display();
    return 0;
}