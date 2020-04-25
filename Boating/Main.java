#include<iostream>
using namespace std;
int main()
{
  int a,c,t,r;
  cin>>t;
  cin>>a;
  cin>>c;
  r=a*75+c*30;
  if(r<=t)
  {
    cout<<"Boat is stable";
  }
  else
    cout<<"Boat will drow";
}