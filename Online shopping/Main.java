#include<iostream>
using namespace std;
int main()
{
  int q,w,e,r,t,y,u,i,o,a,s,d;
  cin>>q>>w>>e>>r>>t>>y>>u>>i>>o>>a>>s>>d;
  a=q-(q*w/100)+e;
  s=r-(r*t/100)+y;
  d=u-(u*i/100)+o;
  cout<<"In Flipkart Rs."<< a<<"\n";
  cout<<"In Snapdeal Rs."<< s<<"\n";
  cout<<"In Amazon Rs."<< d<<"\n";
  if(s>=a)
  {
    if(a<d)
    {
    cout<<"He will prefer Flipkart\n";
    }
 	else
  	{
    cout<<"He will prefer Amazon\n";
  	}
  }
  else
  {
    if(s<d)
    {
    cout<<"He will prefer Snapdeal\n";
  	}
    else
    {
      cout<<"He will prefer Amazon\n";
    }
}
  }