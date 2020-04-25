#include<iostream>
int main()
{
    int o,num1, num2;
    std::cout << "Enter first number : ";
    std::cin >> num1;
    std::cout << "Enter second number : Menu \n";
    std::cin >> num2;    
    std::cout << "1.Addition \n2.Subtraction\n3.Multiplication\n4.Division\n5.Remainder\n";
    std::cin >> o;
  	switch(o)
    {
        case 1:
            std::cout<<(num1+num2);
            break;
        case 2:
            std::cout<<num1-num2;
            break;
        case 3:
            std::cout<<num1*num2;
            break;
        case 4:
            std::cout<<num1/num2;
            break;
		case 5:
            std::cout<<num1%num2;
            break;
        default:
        	 std::cout<<"Invalid operation";
            break;
    }
    return 0;
}