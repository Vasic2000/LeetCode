package Easy;
//TASK.461
//The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
//Given two integers x and y, return the Hamming distance between them.

public class HammingDistance {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1, 4));
        System.out.println(hammingDistance(3, 1));
        System.out.println(hammingDistance(15, 24));
    }



    private static int hammingDistance(int x, int y) {
        StringBuilder sx = new StringBuilder();
        StringBuilder sy = new StringBuilder();
        int result = 0;

        while ((x > 0) || (y > 0)) {
            sx.insert(0, x % 2); // Добавляем остаток в начало
            x = x / 2;                    // Целочисленное деление

            sy.insert(0, y % 2); // Добавляем остаток в начало
            y = y / 2;                    // Целочисленное деление
        }

        for (int i = 0; i < sx.length(); i++) {
            if(sx.charAt(i) != sy.charAt(i))
                result++;
        }

        return result;
    }
}
