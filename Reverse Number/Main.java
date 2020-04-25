#include <iostream>
int main() 
{
  int y,a,b=0;
  std::cin>>y;
  while(y>0)
  {
    a=y%10;
    b=b*10+a;
    y=y/10;
    std::cout<<a;
  }
	return 0;
}