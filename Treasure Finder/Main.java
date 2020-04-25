#include<iostream>
using namespace std;
int main()
{
  int o,p,q,hcf,r;
  cin>>o>>p>>q;
  if(o<p)
  {
    if(o>q)
    {
     cout<<"The treasure is in box which has number "<<o<<"\n";
    }
    else if(p<q)
    {
      cout<<"The treasure is in box which has number "<<p<<"\n";
    }
    else 
    {
      cout<<"The treasure is in box which has number "<<q<<"\n";
    }
}
  else
  {
    if(q>o)
    {
      cout<<"The treasure is in box which has number "<<o<<"\n";
    }
    else if(q<p)
  	{
      cout<<"The treasure is in box which has number "<<p<<"\n";
    }
    else
    {
      cout<<"The treasure is in box which has number "<<q<<"\n";
    }
  }  
  r=o<p?(o<q?o:q):(p<q?p:q);
 for (hcf=r;hcf>=1;hcf--)
 	{
  	  if (o%hcf==0 && p%hcf==0 && q%hcf==0)
  		 break;
 	} 
	cout<<"The code to open the box is "<<hcf;
    return 0;
}