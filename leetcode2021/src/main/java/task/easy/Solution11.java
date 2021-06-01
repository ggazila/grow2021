package task.easy;

public class Solution11 {
	public String replaceDigits(String s) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				builder.append(s.charAt(i));
			} else {
				int temp = Integer.parseInt(String.valueOf(s.charAt(i)));
				char c = (char) (s.charAt(i - 1) + temp);
				builder.append(c);
			}
		}
		
		return builder.toString();
	}
	
	public String fasterSolution(String s) {
		char[] charArray = s.toCharArray();
		for(int i = 1; i < charArray.length; i += 2) {
			charArray[i] = (char) (charArray[i - 1] + charArray[i] - '0');
		}
		
		return String.valueOf(charArray);
	}
	
	public static void main(String[] args) {
		System.out.println(new Solution11().replaceDigits("a1c1e1"));
		System.out.println(new Solution11().fasterSolution("a1c1e1"));
	}

}

/*
 * 1844. Replace All Digits with Characters Easy
 * 
 * 111
 * 
 * 19
 * 
 * Add to List
 * 
 * Share You are given a 0-indexed string s that has lowercase English letters
 * in its even indices and digits in its odd indices.
 * 
 * There is a function shift(c, x), where c is a character and x is a digit,
 * that returns the xth character after c.
 * 
 * For example, shift('a', 5) = 'f' and shift('x', 0) = 'x'. For every odd index
 * i, you want to replace the digit s[i] with shift(s[i-1], s[i]).
 * 
 * Return s after replacing all digits. It is guaranteed that shift(s[i-1],
 * s[i]) will never exceed 'z'.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: s = "a1c1e1" Output: "abcdef" Explanation: The digits are replaced as
 * follows: - s[1] -> shift('a',1) = 'b' - s[3] -> shift('c',1) = 'd' - s[5] ->
 * shift('e',1) = 'f' Example 2:
 * 
 * Input: s = "a1b2c3d4e" Output: "abbdcfdhe" Explanation: The digits are
 * replaced as follows: - s[1] -> shift('a',1) = 'b' - s[3] -> shift('b',2) =
 * 'd' - s[5] -> shift('c',3) = 'f' - s[7] -> shift('d',4) = 'h'
 * 
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 100 s consists only of lowercase English letters and digits.
 * shift(s[i-1], s[i]) <= 'z' for all odd indices i.
 * 
 */
