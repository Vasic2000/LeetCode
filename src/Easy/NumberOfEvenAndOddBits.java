package Easy;

public class NumberOfEvenAndOddBits {
    public static void main(String[] args) {
        printArr(evenOddBit(1));
        printArr(evenOddBit(2));
        printArr(evenOddBit(3));
        printArr(evenOddBit(4));
        printArr(evenOddBit(5));
    }

    private static void printArr(int[] array) {
        System.out.print("[" + array[0]);
        for(int i = 1; i < array.length; i++) {
            System.out.print("," + array[i]);
        }
        System.out.println("]");
    }
    public static int[] evenOddBit(int n) {
        int[] answer = new int[2];
        int remainder;
        int odd = 0;
        int even = 0;

        StringBuilder binaryArray = new StringBuilder();

        while(n >= 1) {
            remainder = n % 2;
            if(remainder == 0) {
                binaryArray.insert(0, '0');
            } else {
                binaryArray.insert(0, '1');
            }
            n = n/2;
        }
        System.out.println(binaryArray);

        char[] bA = binaryArray.toString().toCharArray();
        char temp;

        for(int i = 0; i < binaryArray.length() / 2; i++) {
            temp = bA[i];
            bA[i] = bA[bA.length - 1 - i];
            bA[bA.length - 1 - i] = temp;
        }

        for(int i = 0; i < binaryArray.length(); i++) {
            System.out.print(bA[i]);
            if ((i % 2 == 0) && (bA[i] == '1')) {
                even++;
            }
            if ((i % 2 == 1) && (bA[i] == '1')) {
                odd++;
            }
        }

        System.out.println();

        answer[0] = even;
        answer[1] = odd;

        return answer;
    }
}
