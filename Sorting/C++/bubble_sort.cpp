#include <bits/stdc++.h>

using namespace std;

#define MAX_N 10000

void bubble_sort(int arr[], int n) {
	for (int i = 0; i < n - 1; ++i) {
		for (int j = i; j < n - 1; ++j) {
			if (arr[j] > arr[j + 1]) {
				swap(arr[j], arr[j + 1]);
			}
		}
	}
}

int main() {
   	int arr[MAX_N];
   	int n; cin >> n;
   	for (int i = 0; i < n; ++i) {
   		cin >> arr[i];
   	}

   	bubble_sort(arr, n);

   	for (int i = 0; i < n; ++i) {
   		cout << arr[i] << " ";
   	}
}
