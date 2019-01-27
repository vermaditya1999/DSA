#include <bits/stdc++.h>

using namespace std;

void hanoi(int[], int, int, int, int);

int main() {
   	int n; cin >> n;
   	int arr[n];

   	// The array is filled like: n, n-1, n-2, ... , 2, 1
   	// 1 is the largest disk at the bottom
   	for (int i = n; i >= 1; --i) {
   		arr[n - i] = i;
   	}

   	// hanoi(arr, n - 1, 0, 1, 2);
   	// hanoi_be(arr, n - 1, 0 , 1, 2);
   	// hanoi_ae(arr, n - 1, 0 , 1, 2);
}

// Normal tower of hanoi
void hanoi(int arr[], int n, int beg, int aux, int end) {
	if (n >= 0) {
		hanoi(arr, n - 1, beg, end, aux);
		cout << "Move disk " << arr[n] << " from " << beg << " to " << end << endl;
		hanoi(arr, n - 1, aux, beg, end);
	}
}