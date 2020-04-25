#include<iostream>
int main()
{
int n, i=1,s=11;
std::cin>>n;
do
{
std::cout<<s*s<<" ";
  s=s+4;
i = i + 1;
} while (i<=n);
return 0;
}