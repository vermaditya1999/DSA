#include <bits/stdc++.h>

using namespace std;

#define FAST_IO ios_base::sync_with_stdio(0); cin.tie(NULL); cout.tie(NULL)
#define IN_PATH "/home/himself/Desktop/C++/input.txt"
#define OUT_PATH "/home/himself/Desktop/C++/output.txt"

#define MAX_N 10000

// Merge the sorted subarrays arr[l..mid] and arr[mid + 1...r]
void merge(int arr[], int l, int mid, int r) {
	int merged[r - l + 1];
	int i = l;
	int j = mid + 1;
	int ptr = 0;

	while (i <= mid && j <= r) {
		if (arr[i] < arr[j]) {
			merged[ptr++] = arr[i++];
		} else {
			merged[ptr++] = arr[j++];
		}
	}

	while (i <= mid) {
		merged[ptr++] = arr[i++];
	}

	while (j <= r) {
		merged[ptr++] = arr[j++];
	}

	for (int k = l; k <= r; ++k) {
		arr[k] = merged[k - l];
	}
}

// Merge the subarray arr[l..r]
void merge_sort_bounds(int arr[], int l, int r) {
	if (l < r) {
		int mid = (l + r) / 2;
		merge_sort_bounds(arr, l, mid);
		merge_sort_bounds(arr, mid + 1, r);
		merge(arr, l, mid, r);
	}
}

void merge_sort(int arr[], int n) {
	merge_sort_bounds(arr, 0, n - 1);
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

   	merge_sort(arr, n);

   	for (int i = 0; i < n; ++i) {
   		cout << arr[i] << " ";
   	}
}