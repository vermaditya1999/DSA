#include <bits/stdc++.h>

using namespace std;

#define FAST_IO ios_base::sync_with_stdio(0); cin.tie(NULL); cout.tie(NULL)
#define IN_PATH "/home/himself/Desktop/C++/input.txt"
#define OUT_PATH "/home/himself/Desktop/C++/output.txt"

#define MAX_N 10000

void selection_sort(int arr[], int n) {
	for (int i = 0; i < n; ++i) {
		int min_i = i;
		for (int j = i + 1; j < n; ++j) {
			if (arr[j] < arr[min_i]) {
				min_i = j;
			}
		}
		swap(arr[min_i], arr[i]);
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

   	selection_sort(arr, n);

   	for (int i = 0; i < n; ++i) {
   		cout << arr[i] << " ";
   	}
}
