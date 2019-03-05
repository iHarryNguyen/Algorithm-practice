/**
March 4, 2019


Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ...
1. Compute the result recursively (without loops).


factorial(1) → 1
factorial(2) → 2
factorial(3) → 6

**/
//With a while loop
public int factorial(int n) {
  int sum = 1;
  while(n!=1){
    sum = sum*n;
    n--;
  }
  return sum;
}

//With recursion

public int factorial(int n) {
  if (n == 1) return 1;
  
  return n * factorial(n-1);
}
/**
Correct answer: Yes
**/
