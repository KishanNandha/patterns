package twoPointers.easy;

/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

Given a string s, return true if it is a palindrome, or false otherwise.



Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
Example 3:

Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.


Constraints:

1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
 */
public class Q127_validPalindromeIgnoreCaseAndNonAlphanumaric {

    public boolean isPalindrome_BruteForce(String s) {
        if (s.isEmpty()) {
            return true;
        }
        s = s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left <= right) {
            if (!(s.charAt(left) >= 'A' && s.charAt(left) <= 'Z') &&
                    !(s.charAt(left) >= 'a' && s.charAt(left) <= 'z') &&
                    !(s.charAt(left) >= '0' && s.charAt(left) <= '9')) {
                left++;
                continue;
            }
            if (!(s.charAt(right) >= 'A' && s.charAt(right) <= 'Z') &&
                    !(s.charAt(right) >= 'a' && s.charAt(right) <= 'z') &&
                    !(s.charAt(right) >= '0' && s.charAt(right) <= '9')) {
                right--;
                continue;
            }
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
