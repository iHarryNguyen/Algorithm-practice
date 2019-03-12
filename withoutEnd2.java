/**
March 12, 2019

Given a string, return a version without both the first and last char of the string. The string may be any length, including 0.

withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → ""

**/

public String withouEnd2(String str) {
  if(str.length() <= 2){
    str = "";
    return str;
  }
  else{
    str = str.substring(1,str.length()-1);
  }
  return str;
}

/**
Correct answer: Yes
**/
