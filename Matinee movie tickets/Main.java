#include<iostream>
using namespace std;
int main()
{
  int a;
  float c,r=13.30;
  cin>>a>>c;
  if(a<=13)
  {
    if(c!=r)
    {
      cout<<"$4.00";
    }
  	else
  	{  
    	cout<<"$2.00";
    }
  }
  else
  {
    if(c==r)
    {
      cout<<"$5.00";
    }
  	else
  	{  
    	cout<<"$8.00";
    }
  }
}