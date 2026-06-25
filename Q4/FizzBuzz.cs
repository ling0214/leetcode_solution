class Solution {
    public IList<string> FizzBuzz(int n) {
IList<string> result = new List<string>();

    for(int i=1;i<=n; i++){
if (i % 15 ==0){
result.Add("FizzBuzz");

}

else if(i %3 ==0) {
result.Add("Fizz");

} else if (i %5 ==0) {
 
result.Add("Buzz");

}else {
result.Add(i.ToString());  
    }

    
    }return result;

    }
}


//start 
//input n
//if [i] devide by 15
//if [i] devide by 3 , print Fizz
//if [i]devide by 5,print Buzz
//if [i] not equal 3 and 5 , print [i]


