#include <iostream>
using namespace std;
int main()
{
int n,num;
  cin>>n;
  num=n;
for(int i=1;i<=4;i++)
{
for(int j=1;j<=i;j++)
cout<<num;
num++;
cout<<endl;
}
num--;
for(int i=4;i>=1;i--)
{
for(int j=1;j<=i;j++)
cout<<num;
num--;
cout<<endl;
}
return 0;
}