#include<iostream> 
using namespace std;
int show(int a[], int n) {
	cout<<"Sorted array is: ";
	for(int i = 0; i < n; i ++){
		cout<<a[i]<<" ";
	}
}
int binary(int a[], int s, int e, int x) {
	int mid = (s + e)/2;
	
	if(x > a[mid]) {
		
		binary(a, mid, e, x);
	}
	else if(x < a[mid]) {
		
		binary(a, s, mid, x);
	}
	else if(x == a[mid]) {

		return mid;		
	}
}
int sort(int arr[], int n) {
	for(int i = 0; i < n; i++) {
		for(int j = i + 1; j < n; j ++) {
			if(arr[i]>= arr[j]) {
				int temp;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}
	show(arr, 6);
}
int main() {
	int x;
	int arr[6] = {12,18,20,42,8,10};
	cout<<"Enter the element to search: ";
	cin>>x;	
	sort(arr, 6);
	int mid = binary(arr,0, 6, x);
	cout<<endl<<"Found it at "<<mid + 1<<" position";
}
