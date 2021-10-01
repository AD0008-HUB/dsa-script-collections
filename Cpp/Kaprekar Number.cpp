#include<iostream>
#include<math.h>
using namespace std;

int main() {
	
	int k, sq, n = 0, sum = 0;
	cin>>k;
	sq = k*k;
	int temp = k;
	while( temp != 0) {
		
		n ++;
		temp = temp/10;
	}
	
	
	sum = sq / pow(10, n) + sq %(int)pow(10, n) ;
	if(k == sum )
	{
		cout<<"Kapreka Number";
	}
	else {
		
		cout<<"Not a Kapreka Number";
	}
}
