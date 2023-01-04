package Medium;

public class PermutationInString {
    public static void main(String[] args) {
        String s1 = "ab", s2 = "eidbaooo";                  //true
        String s3 = "", s4 = "abrwal";                      //false
        String s5 = "abcde", s6 = "eidedcbaaabralbaooo";    //true
        String s7 = "toob", s8 = "bamboothree";             //true
        String s9 = "toubleronner", s10 = "rumba";          //false
        String s11 = "tur", s12 = "bramgetur";              //false
        String s13 = "rut", s14 = "bramgetur";              //true
        String s15 = "ab", s16 = "eidboaoo";                //false
        String s17 = "ba", s18 = "ab";                      //true
        String s19 = "abc", s20 = "bbcba";                  //false


//        System.out.println(checkInclusion(s1, s2));
//        System.out.println(checkInclusion(s3, s4));
//        System.out.println(checkInclusion(s5, s6));
//        System.out.println(checkInclusion(s7, s8));
//        System.out.println(checkInclusion(s9, s10));
//        System.out.println(checkInclusion(s11, s12));
//        System.out.println(checkInclusion(s13, s14));
//        System.out.println(checkInclusion(s15, s16));
//        System.out.println(checkInclusion(s17, s18));
//        System.out.println(checkInclusion(s19, s20));
    }

    public static boolean checkInclusion(String s1, String s2) {

        if((s1 == "") || (s2 == "") || (s1 == null) || (s2 == null)) return false;
        if(s1.length() > s2.length()) return false;

        char [] str1 = s1.toCharArray();
        char [] str2 = s2.toCharArray();

        boolean find = false;

        for(int i = 0; i < str2.length - str1.length + 1; i++) {
            if(str2[i] == str1[str1.length - 1]) {
                find = true;
                for(int j = str1.length - 1; j >= 0; j--) {
                    if(str2[i + j] != str1[str1.length - 1 - j]) {
                        find = false;
                    }
                }
                if(find) return find;
            }
        }
        return false;
    }


}
