package Q5;
class Solution {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i] = digits[i] + 1;
                return digits;
            }

            digits[i] = 0;           
        }

        // 全部是 9 的情况        
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}

//start
//for i = digits.length - 1, i >= 0, i--
//check digits[i] ， is what num
//if digits[i] < 9
//digits[i] plus 1
//return digits
//else
//digits[i] = 0
//continue
//--
//if all is 9
//create new array, length + 1
//first one = 1
//return new array


// Example 1:
// Input: digits = [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
// Incrementing by one gives 123 + 1 = 124.
// Thus, the result should be [1,2,4].
// Example 2:

// Input: digits = [4,3,2,1]
// Output: [4,3,2,2]
// Explanation: The array represents the integer 4321.
// Incrementing by one gives 4321 + 1 = 4322.
// Thus, the result should be [4,3,2,2].
// Example 3:

// Input: digits = [9]
// Output: [1,0]
// Explanation: The array represents the integer 9.
// Incrementing by one gives 9 + 1 = 10.
// Thus, the result should be [1,0].