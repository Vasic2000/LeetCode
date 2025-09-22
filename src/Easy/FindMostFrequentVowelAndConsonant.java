package Easy;

//TASK.3541
//Return the sum of the two frequencies.
//Note: If multiple vowels or consonants have the same maximum frequency, you may choose any one of them.
// If there are no vowels or no consonants in the string, consider their frequency as 0.
//The frequency of a letter x is the number of times it occurs in the string.

import java.util.HashMap;

public class FindMostFrequentVowelAndConsonant {
    public static void main(String[] args) {
        System.out.print("successes -> = ");
        System.out.println(maxFreqSum("successes"));
        System.out.print("aieaiea -> = ");
        System.out.println(maxFreqSum("aieaiea"));
    }
    public static int maxFreqSum(String s) {
        char [] s_string = s.toCharArray();
        HashMap<Character, Integer> vowels = new HashMap<>();
        HashMap<Character, Integer> consonat = new HashMap<>();

        int vowelMax = 0;
        int consonatMax = 0;

        for (char itVar : s_string) {

            // Check for vowels
            if ((itVar == 'a') || (itVar == 'e') || (itVar == 'i') || (itVar == 'o') || (itVar == 'u')) {
                if (vowels.containsKey(itVar)) {
                    vowels.put(itVar, vowels.get(itVar) + 1);
                    if (vowelMax < vowels.get(itVar)) {
                        vowelMax = vowels.get(itVar);
                    }
                } else {
                    vowels.put(itVar, 1);
                    if (vowelMax < vowels.get(itVar)) {
                        vowelMax = vowels.get(itVar);
                    }
                }
            } else {

                // Check for consonar
                if (consonat.containsKey(itVar)) {
                    consonat.put(itVar, consonat.get(itVar) + 1);
                    if (consonatMax < consonat.get(itVar)) {
                        consonatMax = consonat.get(itVar);
                    }
                } else {
                    consonat.put(itVar, 1);
                    if (consonatMax < consonat.get(itVar)) {
                        consonatMax = consonat.get(itVar);
                    }
                }
            }
        }
        return consonatMax + vowelMax;
    }
}
