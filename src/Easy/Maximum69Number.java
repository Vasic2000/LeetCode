package Easy;
//TASK.1323

public class Maximum69Number {
    public static void main(String[] args) {
        System.out.println("9669 -> " + maximum69Number(9669));
        System.out.println("6669 -> " + maximum69Number(6669));
        System.out.println("9996 -> " + maximum69Number(9996));
        System.out.println("9999 -> " + maximum69Number(9999));
    }

    private static int maximum69Number(int num) {
        char[] n = String.valueOf(num).toCharArray();

        for (int i = 0; i < n.length; i++) {
            if(n[i]=='6'){
                n[i] = '9';
                return resultOf(n);
            }
        }
        return resultOf(n);
    }

    private static int resultOf(char[] n) {
//        StringBuilder number = new StringBuilder();
//        for (int i = 0; i < n.length; i++) {
//            number.append(n[i]);
//        }
//        return Integer.parseInt(number.toString());

        int result = 0;
        int exp = 1;

        for (int i = 0; i < n.length; i++) {
            result += Integer.parseInt(String.valueOf(n[n.length - 1 - i])) * exp;
            exp *= 10;
        }

        return result;
    }
}
