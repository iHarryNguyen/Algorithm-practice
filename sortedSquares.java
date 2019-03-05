/**
March 4, 2019

Given an array of integers A sorted in non-decreasing order, return an array of
the squares of each number, also in sorted non-decreasing order.

Example:

Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]

**/

class sortedSquares {
    public int[] sortedSquares(int[] A) {
        int N = A.length;
        int[] ans = new int[N];
        for (int i = 0; i < N; ++i)
            ans[i] = A[i] * A[i];

        Arrays.sort(ans);
        return ans;
    }
}

/**
Correct answer: Yes
**/
