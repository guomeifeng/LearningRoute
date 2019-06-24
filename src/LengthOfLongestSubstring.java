
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

//Given a string, find the length of the longest substring without repeating characters.
//
//Example 1:
//
//Input: "abcabcbb"
//Output: 3 
//Explanation: The answer is "abc", with the length of 3. 
//Example 2:
//
//Input: "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.
//Example 3:
//
//Input: "pwwkew"
//Output: 3
//Explanation: The answer is "wke", with the length of 3. 
//             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
public class LengthOfLongestSubstring {

    public int lengthOfLongestSubstring(String s) {
        Queue q = new ConcurrentLinkedQueue();
        int length = 0;
        int maxLength = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
   
            boolean isExisting = false;
            if (i>=1){
                isExisting = s.substring(start, i).contains(c.toString());
            }
            Character head = null;
            if (isExisting) {                
                do {
                    head = (char) q.poll();
                } while (!head.equals(c));
                if (length > maxLength) maxLength = length;
                length = q.size();                
                start = i - q.size();
            }
            q.add(c);
            length++;

        }
        return maxLength>length?maxLength:length;
    }
    
    public static void main (String[] args){
        LengthOfLongestSubstring test = new LengthOfLongestSubstring();
        test.lengthOfLongestSubstring("dvdf");
    }
}
