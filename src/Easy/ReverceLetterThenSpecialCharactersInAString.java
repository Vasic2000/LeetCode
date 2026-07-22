package Easy;
//s consists only of lowercase English letters and the special characters in "!@#$%^&*()".
//TASK.3823

import static java.lang.Character.isLetter;

public class ReverceLetterThenSpecialCharactersInAString {
    public static void main(String[] args) {
        String s1 = ")ebc#da@f(";
        String s2 = "z";
        String s3 = "!@#$%^&*()";
        System.out.println(s1);
        System.out.println(reverseByType(s1));
        System.out.println();
        System.out.println(s2);
        System.out.println(reverseByType(s2));
        System.out.println();
        System.out.println(s3);
        System.out.println(reverseByType(s3));
    }

    private static String reverseByType(String s) {
        char[] temp = s.toCharArray();            //Основной и он же результат
        char[] preproto = new char[temp.length];  //L и S индексы
        char[] proto = new char[temp.length];     //Временное хранилище

        int letter = 0;
        int special = 1;

        for (int i = 0; i < temp.length; i++) {
            if(isLetter(temp[i])) {
                proto[letter] = temp[i];
                letter++;
                preproto[i] = 'l';
            } else {
                proto[temp.length - special] = temp[i];
                special++;
                preproto[i] = 's';
            }
        }

        letter--;
        special--;

        for (int i = 0; i < temp.length; i++) {
            if(preproto[i] == 'l') {
                temp[i] = proto[letter];
                letter--;
            } else {
                temp[i] = proto[temp.length - special];
                special--;
            }
        }

        return new String(temp);
    }

    private static boolean isLettter(char c) {
        if((c>96)&&(c<123))
            return true;
        else
            return false;
    }
}
