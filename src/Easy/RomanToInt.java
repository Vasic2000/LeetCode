package Easy;

import static java.lang.System.exit;

public class RomanToInt {
    public static void main(String[] args) {
        System.out.println(romanToInt("XXI"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
        System.out.println(romanToInt("III"));
    }

    public static int romanToInt(String s) {
        char[] num = s.toCharArray();
        int number = 0, length = num.length - 1;
        for(int i = length; i >=0; i--) {
            switch(num[i]) {
                case 'M' :
                    number = number + 1000;
                    break;

                case 'D' :
                    number = number + 500;
                    break;

                case 'C' :
                    if(((i + 1) <= length) && num[i+1]=='D') {
                        number = number - 100;
                    } else if(((i + 1) <= length) && num[i+1]=='M') {
                        number = number - 100;
                    } else
                        number = number + 100;
                    break;

                case 'L' :
                    number = number + 50;
                    break;

                case 'X' :
                    if(((i + 1) <= length) && num[i+1]=='L') {
                        number = number - 10;
                    } else if (((i + 1) <= length) && num[i+1]=='C') {
                        number = number - 10;
                    } else
                        number = number + 10;
                    break;

                case 'V' :
                        number = number + 5;
                        break;

                case 'I' :
                    if(((i + 1) <= length) && num[i+1]=='V') {
                        number = number - 1;
                        } else if (((i + 1) <= length) && num[i+1]=='X') {
                        number = number - 1;
                    } else
                        number = number + 1;
                    break;

            }
        }
        return number;
    }
}
