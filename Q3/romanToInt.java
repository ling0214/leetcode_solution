package Q3;

public class romanToInt {
    
}
class Solution {

    public int romanToInt(String s) {

    // input int result
    int result = 0;
// declare each character value
//III = 1+1+1 , output =3

for (int i = 0; i < s.length(); i++) {
if (s.charAt(i) == 'I') result += 1;
if (s.charAt(i) == 'V') result += 5;
if (s.charAt(i) == 'X') result += 10;
if (s.charAt(i) == 'L') result += 50;
if (s.charAt(i) == 'C') result += 100;
if (s.charAt(i) == 'D') result += 500;
if (s.charAt(i) =='M') result += 1000;

}
        
    //case3: "MCMXCIV"
// Input: s = "MCMXCIV"
// Output: 1994
// Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
//special case : CM=200  , XC = , IV=-2 
//  error +1000 +100 +1000 +10 +100 +1 +5 ==2216
          // M     C   M     X    C   I  V
//M CM XC IV
// 1000 900 10


//IV , IX 
if (s.contains("IV")) result -= 2;
if(s.contains("IX")) result -= 2;

//CD , CM
if (s.contains("CD")) result -= 200; 
if (s.contains("CM")) result -= 200; 

//XL, XC
if (s.contains("XL")) result -= 20;
if (s.contains("XC")) result -= 20;

    
return result; 

}
}

//result have to roman value +
//III = 1+1+1 , output =3

//start
//input int result
//result=0
//declare each character value 
// I  =  1
//V  =  5
//X  =  10
//L  =  50
//C  =  100
//D  =  500
//M  =  1000
//if character at(syntax) i= I, result +1
//return result

