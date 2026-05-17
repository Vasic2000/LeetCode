package Easy;
//TASK.709

public class ToLowerCase {
    public static void main(String[] args) {
        System.out.println(toLowerCase("Hellow"));
        System.out.println(toLowerCase("here"));
        System.out.println(toLowerCase("LOVELY"));
    }

    private static String toLowerCase(String s) {
        return s.toLowerCase();
//        return s.toUpperCase();

//        char ch = 'a';
//        char ch1 = 'A';
//
//        int d = +ch;
//        int e = +ch1;
//        int diff = d-e;
//        StringBuilder ans = new StringBuilder();
//        for(int i=0;i<s.length();i++){
//            char cha = s.charAt(i);
//            if(cha >= 'A' && cha <= 'Z'){
//                char updatedChar = (char)(+cha+diff);
//                ans.append(updatedChar);
//
//            }else{
//                ans.append(cha);
//            }
//        }
//        return ans.toString();
    }
}
