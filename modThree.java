/**
March 7, 2019

Given a non-negative int n, return the count of the occurrences of 7 as a digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).


count7(717) → 2
count7(7) → 1
count7(123) → 0

**/

public boolean modThree(int[] nums)
{
	  for(int i = 0; i < nums.length - 2; i++)
	  {
	  	if(nums[i] % 2 == nums[i+1] % 2 && nums[i] % 2 == nums[i+2] % 2)
	  		return true;
	  }
	  return false;
}

/**
Correct answer: Yes
**/
