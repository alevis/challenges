#include <iostream>
using namespace std;

int digitSum(int n){
	if(n==0){return 0;}
	return n-(n/10)*10+digitSum(n/10);
}
int main(void){
	cout<<digitSum(114);
	return 0;
}