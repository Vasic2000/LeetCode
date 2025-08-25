package Easy;

//Task.771

public class JewelsAndStones {
    public static void main(String[] args) {
        System.out.println("Jewels = aA " + "stones = aAAbbbb\nYou've got " + numJewelsInStones( "aA", "aAAbbbb") + " jevels.");
        System.out.println("Jewels = z " + "stones = ZZZ\nYou've got " + numJewelsInStones( "z", "ZZZ") + " jevels.");
        System.out.println("Jewels = ABC " + "stones = ERTFABCAABBCFIEEQRDWWR\nYou've got " + numJewelsInStones( "ABC", "ERTFABCAABBCFIEEQRDWWR") + " jevels.");
    }
    public static int numJewelsInStones(String jewels, String stones) {
        int result = 0;
        char [] jev = jewels.toCharArray();
        char [] ston = stones.toCharArray();

        for (int i = 0; i < jev.length; i++) {
            for (int j = 0; j < ston.length; j++) {
                if(jev[i] == ston[j]) result++;
            }
        }
        return result;
    }
}
