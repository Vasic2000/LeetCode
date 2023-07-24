import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class A_plus_B {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int a = readInt(reader);
            int b = readInt(reader);
            System.out.println(a+b);
        }
    }

    private static int readInt(BufferedReader reader) throws NumberFormatException, IOException {
        return Integer.parseInt(reader.readLine());
    }
}
