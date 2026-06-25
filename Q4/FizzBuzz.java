package Q4;

class Solution {
    public List<String> fizzBuzz(int n) {
 List<String> result = new ArrayList<>();

    for(int i=1;i<=n; i++){
if (i % 15 ==0){
result.add("FizzBuzz");

}

else if(i %3 ==0) {
result.add("Fizz");

} else if (i %5 ==0) {
 
result.add("Buzz");

}else {
result.add(String.valueOf(i));  
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

