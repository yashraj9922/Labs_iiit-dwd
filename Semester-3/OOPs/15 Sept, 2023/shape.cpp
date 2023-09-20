#include<iostream>
using namespace std;

class shape{
  public:
  double val1, val2, area;
  void getData(double a, double b){
    val1 = a;
    val2 = b;
  }
};

class triangle: public shape{
    public:
    void display_area(){
        area = 0.5 * val1 * val2;
        cout<<"Area of triangle: "<<area<<endl;
    }
};

class rectangle : public shape{
   public:
    void display_area(){
        area = val1 * val2;
        cout<<"Area of rectangle: "<<area;
    }
};

int main(){
    double x, y;
    cout<<"Enter two sides of the shape: ";
    cin>>x>>y;
    triangle t;
    t.getData(x, y);
    rectangle r;
    r.getData(x, y);
    t.display_area();
    r.display_area();
    return 0;
}