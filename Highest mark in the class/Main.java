#include<iostream>
int main()
{
  int n,i,m;
  std::cin>>n;
  int a[n];
  for(i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  m=a[0];
   for(i=0;i<n;i++)
  {
  if(m<a[i])
    m=a[i];
   }
  std::cout<<m<<" ";
}