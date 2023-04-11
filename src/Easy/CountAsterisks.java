package Easy;

public class CountAsterisks {
    public static void main(String[] args) {
        System.out.println(countAsterisks("l|*e*et|c**o|*de|"));
        System.out.println(countAsterisks("iamprogrammer"));
        System.out.println(countAsterisks("yo|uar|e**|b|e***au|tifu|l"));
    }

    public static int countAsterisks(String s) {
        int asterics = 0;
        boolean isCount = true;
        char [] string = s.toCharArray();
        for(int i = 0; i < string.length; i++) {
            if(string[i] == '|') {
                isCount = ! isCount;
            }
            if((isCount) && (string[i] == '*')) {
                asterics++;
            }
        }
        return asterics;
    }
}
