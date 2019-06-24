
import static java.lang.System.console;
import java.util.ArrayList;

//Given a string s, find the longest palindromic substring in s. You may assume that 
//the maximum length of s is 1000.
//
//Example 1:
//
//Input: "babad"
//Output: "bab"
//Note: "aba" is also a valid answer.
//Example 2:
//
//Input: "cbbd"
//Output: "bb"
public class LongestPalindrome {

    public String longestPalindrome(String s) {

        int length = s.length();
        if (length == 1) {
            return s;
        }
        for (int i = 0; i < length / 2; i++) {
            if (!s.substring(i, i + 1).equals(s.substring(length - i - 1, length - i))) {
                String s1 = longestPalindrome(s.substring(1, length));
                String s2 = longestPalindrome(s.substring(0, length - 1));
                return "";
//                return s1.length()>s2.length()?s1:s2;
            }
        }
        return s;
    }

    public String longestPalindrome2(String s) {

        int length = s.length();
        for (int i = length; i >= 1; i--) {
            String result = "";
            for (int k = 0; k <= length - i; k++) {
                String subString = s.substring(k, k + i);
                boolean isPalindrome = true;
                for (int j = 0; j < i / 2; j++) {
                    if (!subString.substring(j, j + 1).equals(subString.substring(i - j - 1, i - j))) {
                        isPalindrome = false;
                        break;
                    }
                }
                if (isPalindrome) {
                    result = subString;
                    break;
                }
            }

            if (!result.equals("")) {
                return result;
            }
        }

        return "";
    }

    public String longestPalindrome3(String s) {
        int maxLength = 0;
        int length = s.length();
        String maxSubString = "";
        for (int i = 0; i < length; i++) {
            char charsAtPosition = s.charAt(i);
            int lengthOfSameChars = 1;
            char charAtPos = '#';
            if (i + lengthOfSameChars < length) {
                charAtPos = s.charAt(i + lengthOfSameChars);
            }
            while (charsAtPosition == charAtPos) {
                lengthOfSameChars++;
                if (i + lengthOfSameChars < length) {
                    charAtPos = s.charAt(i + lengthOfSameChars);
                }else{
                    charAtPos = '#';
                }
            }

            char charPr = '#', charAf = '#';
            int step = 1;
            if (i - step >= 0) {
                charPr = s.charAt(i - step);
            } 
            if (i + lengthOfSameChars - 1 + step < length) {
                charAf = s.charAt(i + lengthOfSameChars + step - 1);
            } 

            while (charPr == charAf && charPr != '#' && charAf != '#') {
                step++;
                if (i - step >= 0) {
                    charPr = s.charAt(i - step);
                } else {
                    charPr = '#';
                }
                if (i + lengthOfSameChars + step - 1 < length) {
                    charAf = s.charAt(i + lengthOfSameChars + step - 1);
                } else {
                    charAf = '#';
                }
            }
            int lengthOfSubString = 2 * (step - 1) + lengthOfSameChars;
            if (lengthOfSubString >= maxLength) {
                maxLength = 2 * (step - 1) + lengthOfSameChars;
                maxSubString = s.substring(i - (step - 1), i + lengthOfSameChars + step - 1);

            }
            i += (lengthOfSameChars - 1);
        }
        return maxSubString;
    }

    public static void main(String[] args) {
        LongestPalindrome test = new LongestPalindrome();
        String original = "mwwfjysbkebpdjyabcfkgprtxpwvhglddhmvaprcvrnuxifcrjpdgnktvmggmguiiquibmtviwjsqwtchkqgxqwljouunurcdtoeygdqmijdympcamawnlzsxucbpqtuwkjfqnzvvvigifyvymfhtppqamlgjozvebygkxawcbwtouaankxsjrteeijpuzbsfsjwxejtfrancoekxgfyangvzjkdskhssdjvkvdskjtiybqgsmpxmghvvicmjxqtxdowkjhmlnfcpbtwvtmjhnzntxyfxyinmqzivxkwigkondghzmbioelmepgfttczskvqfejfiibxjcuyevvpawybcvvxtxycrfbcnpvkzryrqujqaqhoagdmofgdcbhvlwgwmsmhomknbanvntspvvhvccedzzngdywuccxrnzbtchisdwsrfdqpcwknwqvalczznilujdrlevncdsyuhnpmheukottewtkuzhookcsvctsqwwdvfjxifpfsqxpmpwospndozcdbfhselfdltmpujlnhfzjcgnbgprvopxklmlgrlbldzpnkhvhkybpgtzipzotrgzkdrqntnuaqyaplcybqyvidwcfcuxinchretgvfaepmgilbrtxgqoddzyjmmupkjqcypdpfhpkhitfegickfszermqhkwmffdizeoprmnlzbjcwfnqyvmhtdekmfhqwaftlyydirjnojbrieutjhymfpflsfemkqsoewbojwluqdckmzixwxufrdpqnwvwpbavosnvjqxqbosctttxvsbmqpnolfmapywtpfaotzmyjwnd";
        String original2 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String original3 = "abadab";
        String s = test.longestPalindrome3(original2);
        System.out.println(s);
    }
}
