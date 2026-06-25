package Q2;

class Solution {
    public boolean isPalindrome(int x) {
//check if negative int
        if (x < 0) {
            return false;
        }
//Convert to string 
        String s = Integer.toString(x);
//Reverse string 
        String reverseX = new StringBuilder(s).reverse().toString();

//check is reverse = original 
        if (s.equals(reverseX)) {
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

//Convert x to string 

//Reverse the string 

//If original =reversed 

//print true

//Else return false