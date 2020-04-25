#include<iostream>
int main()
{
int b=5, ans=0, n, i=1,s=6;
std::cin>>n;
do
{
std::cout<<s<<" ";
s = s+b;
b = b+5;
i = i + 1;
} while (i<=n);
return 0;
}