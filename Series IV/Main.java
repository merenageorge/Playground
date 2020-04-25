#include<iostream>
using namespace std;
int main()
{
int b=1,c=1, n, i=1;
cin>>n;
 while (i<=n)
{
   b=c;
  if(c%2!=0)
  {
    b=b*b-1;
  }
   else
     {
    b=b*b-2;
  }
cout<<b<<" ";
i = i + 1;
   c=c+1;
}
return 0;
}