public class Solution {
    public bool IsPalindrome(int x) {
        
 // int to string
        string s = x.ToString();
        
        // check is x is negative, return false
        if (x < 0) {
            return false;
       } 

        // reverse string 
        
        string reverseX = "";
        for (int i = s.Length - 1; i >= 0; i--) {
            reverseX = reverseX + s[i];
        }


        //compare if string =reverse
        if (s == reverseX) {
            return true;
        } else {
            return false;
        }
    }
}

//Start 

//Input int x

//If int x <0-negative int

//print false 

//Convert x to string to read

//Reverse the string 

//If original =reversed 

//print true

//Else print false