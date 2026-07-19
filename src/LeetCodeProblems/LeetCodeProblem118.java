/*
Algorithm:
1. Create an empty list 'ans' to store all rows of Pascal's Triangle.
2. Traverse from row 0 to numRows-1.
3. For each row:
   a) Create a new list 'row'.
   b) Traverse each column from 0 to i.
   c) If it is the first or last element of the row,
      add 1.
   d) Otherwise, calculate the current value as:
         previousRow[j-1] + previousRow[j]
      and add it to the current row.
4. Add the completed row to the answer.
5. Return the final triangle.


Approach:
- Pascal's Triangle follows the rule that every element
  (except the first and last) is the sum of the two
  elements directly above it.

- The first and last element of every row are always 1.

- While constructing the current row, use the previously
  generated row to calculate the middle elements.

- Store each completed row so it can be used to build
  the next row.

  Time Complexity = O(numRows²)
*/
package LeetCodeProblems;
import java.util.*;
public class LeetCodeProblem118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer>row= new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    row.add(1);
                }
                else{
                    List<Integer> prev = ans.get(i-1);
                    row.add(prev.get(j-1)+prev.get(j));
                }
            }
            ans.add(row);
        }
        return ans;
    }
}
