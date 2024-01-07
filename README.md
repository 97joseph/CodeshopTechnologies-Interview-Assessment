# CodeshopTechnologies
 Interview Assignment

 
QUESTION 1.Given an input string, reverse the string word by word.

A word is defined as a sequence of non-space characters.

Notice that the input string may contain leading or trailing spaces. However, your reversed string should not contain leading or trailing spaces.

Also, notice that you need to reduce multiple spaces between two words to a single space in the reversed string.
Your function should have input of the string to be reversed and it should return the reversed string.

Example 1:

Input: s = "the sky is blue"
Output: "blue is sky the"
Example 2:

Input: s = "  hello world  "
Output: "world hello"
Explanation: Your reversed string should not contain leading or trailing spaces.
Example 3:

Input: s = "a good   example"
Output: "example good a"
Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
Example 4:

Input: s = "  Bob    Loves  Alice   "
Output: "Alice Loves Bob"
Example 5:

Input: s = "Alice does not even like bob"
Output: "bob like even not does Alice"

Constraintsfor input s:

1 <= s.length <= 104
s contains English letters (upper-case and lower-case), digits, and spaces ' '.
There is at least one word in s.
code template

function reverseString($s)
{
$new_str="";
------
YOUR CODE HERE
-------
return $new_str;
}

QUESTION 2.Given a square matrix,
find
1.the sum of the values on the main diagonal (which runs from the upper left to the lower right).
2.the number of rows of the matrix that contain repeated elements
3.the number of columns of the matrix that contain repeated elements.
The input of this function will be the matrix/2d array of integers and the output will
be the three computations put in an array and returned in json format
Example 1

Input
1 2 3 4
2 1 4 3
3 4 1 2
4 3 2 1
in php arrays would be
$arr = array(
0 => array(1, 2, 3, 4),
1 => array(2, 1, 4, 3),
2 => array(3, 4, 1, 2),
3 => array(4, 3, 2, 1)
);
Output(in json format)
[4, 0, 0]
where 4 at position 0 is diagonal sum as explained (1+1+1+1)=4
0 at position 1 is rows with repeats which is 0 since each row does not have repeating values
0 at position 2 is columns with repeats which is 0 since all columns do not have repeating values
Example 2
input
2 2 2 2
2 3 2 3
2 2 2 3
2 2 2 2
output
diagonal sum 2+3+2+2=9
rows with repeat 4  -2 is appearing more than once in each row
columns with repeat 4 2 is repeated in each of the first three rows,3 is repeated in the last column making it a total of 4 columns with repeats
so output will be :[9,4,4] for this case
CODE TEMPLATE

function processMatrix($arr)
{
--------------
YOUR CODE HERE
--------------
}
QUESTION 3 - COMBINATION SUM

Given an array of distinct integer candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.

It is guaranteed that the number of unique combinations that sum up to target is less than 150 combinations for the given input.

 

Example 1:

Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.
Example 2:

Input: candidates = [2,3,5], target = 8
Output: [[2,2,2,2],[2,3,3],[3,5]]
Example 3:

Input: candidates = [2], target = 1
Output: []
 

Constraints:

1 <= candidates.length <= 30
1 <= candidates[i] <= 200
All elements of candidates are distinct.
1 <= target <= 500


class Solution {

    /**
     * @param Integer[] $candidates
     * @param Integer $target
     * @return Integer[][]
     */
    function combinationSum($candidates, $target) {
        //YOUR CODE HERE
    }
}

QUESTION 4: Non-overlapping Intervals
Given an array of intervals intervals where intervals[i] = [starti, endi], return the minimum number of intervals you need to remove to make the rest of the intervals non-overlapping.

 

Example 1:

Input: intervals = [[1,2],[2,3],[3,4],[1,3]]
Output: 1
Explanation: [1,3] can be removed and the rest of the intervals are non-overlapping.
Example 2:

Input: intervals = [[1,2],[1,2],[1,2]]
Output: 2
Explanation: You need to remove two [1,2] to make the rest of the intervals non-overlapping.
Example 3:

Input: intervals = [[1,2],[2,3]]
Output: 0
Explanation: You don't need to remove any of the intervals since they're already non-overlapping.

Constraints:

1 <= intervals.length <= 105
intervals[i].length == 2
-5 * 104 <= starti < endi <= 5 * 104

class Solution {

    /**
     * @param Integer[][] $intervals
     * @return Integer
     */
    function eraseOverlapIntervals($intervals) {
        
    }
}
