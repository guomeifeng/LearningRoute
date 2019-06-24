
import java.util.ArrayList;
import java.util.List;

//The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
//
//P   A   H   N
//A P L S I I G
//Y   I   R
//And then read line by line: "PAHNAPLSIIGYIR"
//
//Write the code that will take a string and make this conversion given a number of rows:
//
//string convert(string s, int numRows);
//Example 1:
//
//Input: s = "PAYPALISHIRING", numRows = 3
//Output: "PAHNAPLSIIGYIR"
//Example 2:
//PAHNAPLSIIGYIR
//Input: s = "PAYPALISHIRING", numRows = 4 
//Output: "PINALSIGYAHRPI"
//Explanation:PINALSIGYAHRPI
//
//P     I    N
//A   L S  I G
//Y A   H R
//P     I
public class ZigZagConversion {

    public String convert(String s, int numRows) {
        if (numRows==1) return s;
        List<StringBuilder> strs = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            strs.add(new StringBuilder());
        }
        String charAtPos = "";
        
        for (int j = 0; j < s.length(); j++) {
            charAtPos = s.substring(j,j+1);
            int loopNum = 2 * numRows - 2;
            int orderInLoop = j % loopNum;
            int rowNum = orderInLoop < numRows? orderInLoop : 2 * (numRows - 1) - orderInLoop   ;
            strs.get(rowNum).append(charAtPos);
        }
        String result = "";
        for (StringBuilder str:strs){
            result += str.toString();
        }
        return result;
    }

    public static void main(String[] args) {
        ZigZagConversion test = new ZigZagConversion();
        String result = test.convert("A", 1);
        System.out.println(result);
    }

}
