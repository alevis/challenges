//pete smokes
#include <iostream>
int foo(int n,int k){
    if(n==0||n==1) return n;
    return n+foo(n/k,k);
}
int main()
{
    std::cout <<foo(4,3)<<"\n";
    std::cout <<foo(10,3)<<"\n";
    std::cout <<foo(100,5)<<"\n";
}