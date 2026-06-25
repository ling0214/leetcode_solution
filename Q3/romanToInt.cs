class Solution {

    public int RomanToInt(string s) {

    // input int result
    int result = 0;
// declare each character value
//III = 1+1+1 , output =3
//c# no bracket s.length()
for (int i = 0; i < s.Length; i++) { 
if (s[i] == 'I') result += 1;
if (s[i] == 'V') result += 5;
if (s[i] == 'X') result += 10;
if (s[i] == 'L') result += 50;
if (s[i] == 'C') result += 100;
if (s[i] == 'D') result += 500;
if (s[i] =='M') result += 1000;

}

//IV , IX 
if (s.Contains("IV")) result -= 2;
if(s.Contains("IX")) result -= 2;

//CD , CM
if (s.Contains("CD")) result -= 200; 
if (s.Contains("CM")) result -= 200; 

//XL, XC
if (s.Contains("XL")) result -= 20;
if (s.Contains("XC")) result -= 20;

    
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

