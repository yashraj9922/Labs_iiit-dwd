#include <iostream>
#include<string.h>
using namespace std;

class Date
{
public:
    int date, year, month;
    Date()
    {
        date = 01;
        year = 23;
        month = 01;
    }
    void display()
    {
        cout << date << "/" << month << "/" << year << endl;
    }
};

class patient_records
{
public:
    string name;
    Date DOA;
    string disease;
    Date DOD;

    patient_records()
    {
        name = "unrecorded";
        disease = "unrecorded";
    }

    void input(int d1, int y1, int m1, string s, string d, int d2, int y2, int m2)
    {
        DOA.date = d1;
        DOA.month = m1;
        DOA.year = y1;
        DOD.date = d2;
        DOD.month = m2;
        DOD.year = y2;
        disease = d;
        name = s;
    }

    void display()
    {
        cout << "Patient Name: " << name << endl;
        cout << "Disease: " << disease << endl;
        cout << "Date of admission: ";
        DOA.display();
        cout << "Date of discharge: ";
        DOD.display();
    }
};

class Age : public patient_records
{
public:
    int age;
    Age(int d1, int y1, int m1, string s, string d, int d2, int y2, int m2, int a) : patient_records()
    {
        patient_records::input(d1, y1, m1, s, d, d2, y2, m2);
        age = a;
    }
};

int main()
{
    Age patient1(12, 3, 23, "Neil", "Throat infection", 15, 3, 23, 20);
    Age patient2(13, 3, 23, "Nitin", "Paediatric", 20, 3, 23, 10);
    Age patient3(14, 3, 23, "Mukesh", "Paediatric", 15, 3, 23, 9);

    if ((patient1.disease.compare("Paediatric")) && (patient1.age < 12))
        patient1.display();
    if ((patient2.disease.compare("Paediatric")) && (patient2.age < 12))
        patient2.display();
    if ((patient3.disease.compare("Paediatric")) && (patient3.age < 12))
        patient3.display();

    return 0;
}