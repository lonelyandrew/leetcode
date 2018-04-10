import java.util.Map;
import java.util.HashMap;

class Solution {

    private static final Map<Character, Integer> charMap = new HashMap<Character, Integer>();
    static {
        charMap.put('I', 1);
        charMap.put('V', 5);
        charMap.put('X', 10);
        charMap.put('L', 50);
        charMap.put('C', 100);
        charMap.put('D', 500);
        charMap.put('M', 1000);
    }

    public int romanToInt(String s) {

        int result = 0;
        int preNum = 0;
        int num  = 0;

        for (int i = s.length()-1; i >= 0; i--) {
            num = charMap.get(s.charAt(i));
            if (num < preNum) {
                result -= num;
            }
            else {
                result += num;
            }
            preNum = num;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution sln = new Solution();
        int result = sln.romanToInt(args[0]);
        System.out.println(result);
    }
}

// Test Cases:
// IV - 4
// IX - 9
// XL - 40
// XC - 90
// CD - 400
// CM - 900