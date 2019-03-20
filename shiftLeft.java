/**
   February 28, 2019

   Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}. You may modify and return the given array, or return a new array.


   shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
   shiftLeft([1, 2]) → [2, 1]
   shiftLeft([1]) → [1]

 **/

public int[] shiftLeft(int[] nums)
{
								if(nums.length >= 2)
								{
																int temp = nums[0];
																for(int i = 0; i < nums.length - 1; i++)
																								nums[i] = nums[i+1];
																nums[nums.length-1] = temp;
								}
								return nums;
}

ANOTHER WAY TO SOLVE:

public int[] shiftLeft(int[] nums) {
								int[] newArr = new int[nums.length];

								if(nums.length ==1) {
																return nums;
								}
								else{
																for(int i = 0; i < nums.length-1; i++) {
																								newArr[newArr.length-1] = nums[0];
																								newArr[i] = nums[i+1];
																}
								}
								return newArr;
}


/**
   Correct answer: Yes
 **/
