#include <iostream>
using namespace std;

class tollbooth
{
public:
    unsigned int totalCars;
    double totalMoney;
    tollbooth()
    {
        totalCars = 0;
        totalMoney = 0;
    }
    int PayingVehicles()
    {
        totalCars++;
        totalMoney += 50.00;
    }
    int NonPayingVehicles()
    {
        totalCars++;
    }
    int DisplayCashCollected()
    {
        cout << "Total vehicles passed through toll: " << totalCars << endl;
        cout << "Total collection: " << totalMoney;
    }
};

int main()
{
    tollbooth tb;
    int ctr = -1;
    cout << "0 to count for paying four wheeler, 1 for non paying vehicle and 2 to exit" << endl;

    while (ctr != 2)
    {
        cout << "Enter: ";
        cin >> ctr;

        switch (ctr)
        {
        case 0:
            tb.PayingVehicles();
            break;
        case 1:
            tb.NonPayingVehicles();
            break;
        default:
            cout << "No car passed"<<endl;
        }
    }

    tb.DisplayCashCollected();
    return 0;
}