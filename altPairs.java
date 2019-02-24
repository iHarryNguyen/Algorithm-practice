/**
February 24, 2019

Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".


altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"

**/

public String altPairs(String str) {
  String string = "";
  int end = 0;

  for(int i=0; i<str.length(); i+=3){
    string = string + str.charAt(i);
    i++;
    string = string + str.charAt(i);
  }
  return string;
}

/**
Correct answer: Partially correct. There are a few cases that are missed.
**/
