public class Solution {
    public string LongestCommonPrefix(string[] strs) {
//first word as reference answer 
        string result = strs[0];

        // compare by word 
        for (int i = 1; i < strs.Length; i++) {

            
            while (!strs[i].StartsWith(result)) {
                result = result.Substring(0, result.Length - 1);

                
                if (result.Length == 0) {
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