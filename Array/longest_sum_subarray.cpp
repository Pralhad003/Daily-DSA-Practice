// C++ implementation to find the length
// of longest subarray having sum k
#include <bits/stdc++.h>
using namespace std;

// function to find the length of longest
// subarray having sum k
int lenOfLongSubarr(int A[], int n, int K)
{

	int i = 0, j = 0, sum = 0;
	int maxLen = INT_MIN;

	while (j < n) {
		sum += A[j]; //calculation
		if (sum == K) { 
		maxLen = max(maxLen, j-i+1);	 //taking results
			j++;
		}
		else if (sum < K) { //adjusting window
			j++;
		}
		else if (sum > K) {	 //adjusting window
			while (sum > K) {
				sum -= A[i];
				i++;
			}
			if(sum == K){
			maxLen = max(maxLen, j-i+1);
			}
			j++;
		}
	}
	return maxLen;
}

// Driver Code
int main()
{
	int arr[] = { 1 ,2, 3, 1, 1, 1, 1 };
	int n = sizeof(arr) / sizeof(arr[0]);
	int k = 3;
	cout << "Length = " << lenOfLongSubarr(arr, n, k);
	return 0;
}
