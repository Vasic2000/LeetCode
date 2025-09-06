package Easy;
//TASK.1108

public class DefangingAnIPAdress {
    public static void main(String[] args) {
        String adress1 = "1.1.1.1";
        String adress2 = "255.100.50.0";

        System.out.println(defangIPaddr(adress1));
        System.out.println(defangIPaddr(adress2));
    }
    public static String defangIPaddr(String address) {
        StringBuilder result = new StringBuilder();
        char [] input = address.toCharArray();
        for (int i = 0; i < input.length; i++) {
            if(input[i] != '.') {
                result.append(input[i]);
            } else {
//                result.append("[" + input[i] + "]");
                result.append("[.]");
            }
        }
        return result.toString();
    }
}
