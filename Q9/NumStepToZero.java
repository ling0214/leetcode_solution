package Q9;

class Solution {
    public int numberOfSteps(int num) {
        
//declare step start with 0 
     int steps =0; 

//check if num is 0 stop , else start  the while loop  
    while (num!=0){

//if num devide 2 is 0 = even num
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


//question : is even num have to devide 2 , else -1 -- with the input number example : 14 
//use while loop cause cannot determine how many times have to loop 
//keep loop until num became 0



//start 
//input int num , declare step start with 0
//--while loop --
// while num not = 0 ,then check 
//   if num is even = num / 2 
//   else → num - 1
//   steps + 1
// print steps


//time: 45 minutes

