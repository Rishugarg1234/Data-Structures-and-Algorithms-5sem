// Prefix Sum

// This program demonstrates the Prefix Sum technique in Java.

// Given an array, a prefix sum array is created where each element stores the sum of all previous elements including the current element.

// Input:
// [2, 4, 1, 7, 3]

// Output:
// [2, 6, 7, 14, 17]

// Approach:
// - Create a new prefix array.
// - Store the first element as it is.
// - For each next index, add the current element to the previous prefix sum.
// - Print the resulting prefix array.

// Time Complexity: O(n)
// Space Complexity: O(n)

// Concepts Used:
// - Arrays
// - Iteration
// - Prefix Sum Technique

package PrefixSum;

public class PrefixSum {
    public static void main(String[] args) {
        int [] arr = {2,4,1,7,3};
        int [] prefix = new int [arr.length];
        prefix[0] = arr[0];
        for(int i=1;i<arr.length;i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(prefix[i]+" ");
        }
    }
}
