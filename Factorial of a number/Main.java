#include<iostream>
int main(){
  int n=1,i,c;
  std::cin>>c;
  for(i=1;i<=c;i++)
  {
    n=n*i;
  }
  	std::cout<<n;
  return 0;
}