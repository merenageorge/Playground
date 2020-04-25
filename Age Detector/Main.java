#include<iostream>
using namespace std;
int main()
{
  int b,c,a;
  cin>>b>>c;
  if(c>b)
  {
    a=c-b;
      cout<<a;
  }
  else
  {
    a=(100-b)+c;
    cout<<a;
  }
}