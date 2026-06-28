package Q6;
class Solution {
    public void reverseString(char[] s) {

        
        for (int i = 0; i < s.length / 2; i++) {

            // strore the num
            char temp = s[i];

            // front num=back num 
            s[i] = s[s.length - 1 - i];

            
            s[s.length - 1 - i] = temp;
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
 