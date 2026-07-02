public class Solution {
    public int NumberOfSteps(int num) {
        
        //declare step =0 
     int steps =0; 
//check if num is 0 else proceed
        while (num!=0){

//if num devide 2 is 0 =even num
if (num % 2 == 0) {
 num = num / 2;
        }

//else substract 1
else{
    num= num-1;
}
//while condition ++ at the back 
steps++;
        }
return steps;
    }
}



