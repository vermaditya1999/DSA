#include <bits/stdc++.h>

using namespace std;

#define FAST_IO ios_base::sync_with_stdio(0); cin.tie(NULL); cout.tie(NULL)
#define IN_PATH "/home/himself/Desktop/C++/input.txt"
#define OUT_PATH "/home/himself/Desktop/C++/output.txt"

#define MAX_N 10000

void insertion_sort(int arr[], int n) {
	for (int i = 1; i < n; ++i) {
		int key = arr[i];
		int j = i - 1;
		while (j >= 0 && arr[j] > key) {
			arr[j + 1] = arr[j];
			j--;
		}
		arr[j + 1] = key;
	}
}

int main() {
	FAST_IO;

	#ifndef ONLINE_JUDGE
	freopen(IN_PATH, "r", stdin);
    freopen(OUT_PATH, "w", stdout);
	#endif
   	
   	int arr[MAX_N];
   	int n; cin >> n;
   	for (int i = 0; i < n; ++i) {
   		cin >> arr[i];
   	}

   	insertion_sort(arr, n);

   	for (int i = 0; i < n; ++i) {
   		cout << arr[i] << " ";
   	}
}