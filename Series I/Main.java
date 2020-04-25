#include<iostream>

int main()

{

int b=1, ans=0, n, i=1;
  float s=0.5;

std::cin>>n;
 while(b<=n)
  {

do

{

std::cout<<s<<" ";

ans = ans+s;

s = s+b;

b = b*3;

i = i + 1;

} while (i<=n);
  }

return 0;

}

//Read more on Brainly.in - https://brainly.in/question/16711846#readmore