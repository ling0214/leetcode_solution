//C#
public class Solution {
    public int[] TwoSum(int[] nums, int target) {

// int i, int j, twoSum = target
int i;
int j;
int twoSum = target;

// 1st for - int i, i < nums.Length, i++
for (i = 0; i < nums.Length; i++) {
for (j = i + 1; j < nums.Length; j++) {

// if nums[i] + nums[j] == twoSum
    if (nums[i] + nums[j] == twoSum) {
    return new int[] { i, j };
                } 
                else {
                    continue;
                }

            }
        }

        return new int[] {};
    }
}


//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

//start 
//define variable int i, int j, twoSum = target
//1st for- int i , i<num.length , i++
//2st for - int j , j<num.length, j++
// if int[i] + int[j] == twoSum
// print int i , int j
// else continue

