public class Solution {
    public void ReverseString(char[] s) {

        for (int i = 0; i < s.Length / 2; i++) {

            char temp = s[i];
            s[i] = s[s.Length - 1 - i];
            s[s.Length - 1 - i] = temp;
        }
    }
}

//start
//input s = ['h','e','l','l','o']
//
//for i = 0, i < half of s, i++
//
//  take out s[i], put in temp
//  s[i] = s[last - i]
//  s[last - i] = temp
//
//done, s is reversed


// Example 1:

// Input: s = ["h","e","l","l","o"]
// Output: ["o","l","l","e","h"]
// Example 2:

// Input: s = ["H","a","n","n","a","h"]
// Output: ["h","a","n","n","a","H"]
 