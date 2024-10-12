import java.util.HashMap;
import java.util.Map;

/**
 * packageName    : PACKAGE_NAME
 * fileName       : IntegerToRoman1
 * author         : AngryPig123
 * date           : 24. 10. 12.
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 24. 10. 12.        AngryPig123       최초 생성
 */
public class IntegerToRoman1 {

    public static void main(String[] args) {
        System.out.println(intToRoman(3214));
    }

    public static String intToRoman(int num) {
        Map<Integer, Character> map = new HashMap<Integer, Character>();
        map.put(1, 'I');
        map.put(5, 'V');
        map.put(10, 'X');
        map.put(50, 'L');
        map.put(100, 'C');
        map.put(500, 'D');
        map.put(1000, 'M');
        StringBuilder result = new StringBuilder();
        int origin = num;
        int pow = 1;
        while (origin > 0) {
            int temp = origin % 10;
            if (temp != 0) {
                if (temp == 9) {
                    result.append(map.get(pow * 10));
                    result.append(map.get(pow));
                } else if (temp == 4) {
                    result.append(map.get(pow * 5));
                    result.append(map.get(pow));
                } else {
                    boolean wait = false;
                    if (temp >= 5) {
                        temp -= 5;
                        wait = true;
                    }
                    for (int i = 0; i < temp; i++) {
                        result.append(map.get(pow));
                    }
                    if (wait) result.append(map.get(pow * 5));
                }
            }
            pow *= 10;
            origin /= 10;
        }
        return result.reverse().toString();
    }

    public static String bestIntToRoman1(int num) {
        int[] storeInt = {1000, 9000, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] storeRoman = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder romanNumeral = new StringBuilder();
        for (int i = 0; i < storeInt.length; i++) {
            while (num >= storeInt[i]) {
                String symnbol = storeRoman[i];
                romanNumeral.append(symnbol);
                num -= storeInt[i];
            }
        }
        return romanNumeral.toString();
    }

    public static String bestIntToRoman2(int num) {
        StringBuilder roman = new StringBuilder();
        while (num >= 1000) {
            roman.append('M');
            num -= 1000;
        }
        if(num >= 900) {
            roman.append("CM");
            num -= 900;
        }
        if(num >= 500) {
            roman.append("D");
            num -= 500;
        }
        if(num >= 400) {
            roman.append("CD");
            num -= 400;
        }
        while (num >= 100) {
            roman.append('C');
            num -= 100;
        }
        if(num >= 90) {
            roman.append("XC");
            num -= 90;
        }
        if(num >= 50) {
            roman.append("L");
            num -= 50;
        }
        if(num >= 40) {
            roman.append("XL");
            num -= 40;
        }
        while (num >= 10) {
            roman.append('X');
            num -= 10;
        }
        if(num == 9) {
            roman.append("IX");
            num -= 9;
        }
        if(num >= 5) {
            roman.append("V");
            num -= 5;
        }
        if(num == 4) {
            roman.append("IV");
            num -= 4;
        }
        while (num >= 1) {
            roman.append('I');
            num -= 1;
        }
        return roman.toString();
    }

}
