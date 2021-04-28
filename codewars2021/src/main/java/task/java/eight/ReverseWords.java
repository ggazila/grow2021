package task.java.eight;

public class ReverseWords{

 public static String reverseWords(String str){
     String[] words = str.split(" ");

     for (int i = 0; i < words.length / 2; i++) {
       String temp = words[i];
       words[i] = words[words.length - 1 - i];
       words[words.length - 1 - i] = temp;
     }

     return String.join(" ", words);
 }
}

/*
Complete the solution so that it reverses all of the words within the string passed in.

Example:

ReverseWords.reverseWords("The greatest victory is that which requires no battle");
// should return "battle no requires which that is victory greatest The"
 */
