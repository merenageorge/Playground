#include<iostream>
int main()
{
  int e,r;
  std::cin>>e>>r;
  if(r<e)
  {
    std::cout<<"Yes, you can enter.";
  }
  else if(r==e)
  {
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  }
  else
    {
    std::cout<<"Sorry, you can't enter";
  	}
}