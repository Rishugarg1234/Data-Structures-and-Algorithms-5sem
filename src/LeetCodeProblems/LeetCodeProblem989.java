//LeetCode 989 - Add to Array-Form of Integer
//---> Approach
//   Instead of converting the entire array into a number, we add the digits one by one from the end, just like we do in normal addition.
//
//   Start from the last digit of the array.
//   Take one digit from num and one digit from k.
//   Add both digits along with the carry.
//   Store the last digit of the sum in the answer.
//   Update the carry.
//   Repeat until all digits are processed.
//   If a carry is left, add it to the answer.
//   Finally, reverse the answer because the digits were added from right to left.
//
//  This approach is efficient and works even when the number is too large to fit in an int or long.

// Algorithm
// 1. Create an empty list ans.
// 2. Initialize:
//    - p = last index of num
//    - carry = 0
// 3. While there are digits left in num or k:
//    - Take the current digit from num (if available).
//    - Take the last digit of k.
//    - Calculate the sum.
//    - Store sum % 10 in the answer.
//    - Update carry = sum / 10.
//    - Move to the previous digit of num.
//    - Remove the last digit of k.
// 4. If a carry remains, add it to the answer.
// 5. Reverse the answer.
// 6. Return the final answer.

// Time Complexity: O(max(n, m))
// Space Complexity: O(max(n, m))

package LeetCodeProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeetCodeProblem989 {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        int p = num.length-1;
        int carry = 0;
        while(p>=0 || k>0){
            int numval = 0;
            if(p>=0){
                numval = num[p];
            }
            int d = k%10;
            int sum = numval+d+carry;
            int digit = sum%10;
            carry = sum/10;
            ans.add(digit);
            p--;
            k=k/10;
        }
        if(carry>0){
            ans.add(carry);
        }
        Collections.reverse(ans);
        return ans;
    }

}
