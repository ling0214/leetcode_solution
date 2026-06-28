package Q7;
class Solution {
    public String longestCommonPrefix(String[] strs) {

    String result = strs[0];

    for (int i = 1; i < strs.length; i++) {

            while (!strs[i].startsWith(result)) {
                result = result.substring(0, result.length() - 1);

        if (result.isEmpty()) {
                    return "";
                }
            }
        }

        return result;
    }
}


//start
//take first word as answer
//
//check each word one by one
//  does this word start with answer?
//  no → cut last letter
//  still no → cut again
//  keep cutting until match
//  if nothing left → return "" empty 
//
//all words checked → return answer

// Example 1:

// Input: strs = ["flower","flow","flight"]
// Output: "fl"
// Example 2:

// Input: strs = ["dog","racecar","car"]
// Output: ""
// Explanation: There is no common prefix among the input strings.