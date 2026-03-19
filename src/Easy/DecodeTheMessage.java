package Easy;
//Task.2325 Decode the message

import java.util.HashMap;
import java.util.Map;

public class DecodeTheMessage {
    public static void main(String[] args) {
        System.out.println(decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
        System.out.println(decodeMessage("eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb"));
    }

    private static String decodeMessage(String key, String message) {
        Map<Character, Character> table = new HashMap<>();
        char[] keyCh = key.toCharArray();
        char[] messageCh = message.toCharArray();
        char simbol = 'a';
        StringBuilder result = new StringBuilder();

        for (Character ch : keyCh) {
            if(!table.containsKey(ch)&&ch!=' ') {
                table.put(ch, simbol++);
            }
        }

        for (Character ch : messageCh) {
            if(ch!=' ') {
                result.append(table.get(ch));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }
}
