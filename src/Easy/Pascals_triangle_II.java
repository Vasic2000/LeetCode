import java.util.ArrayList;
import java.util.List;

public class Pascals_triangle_II {
    public static void main(String[] args) {
        PrintTriangle(generate(9));
    }

    private static void PrintTriangle(List<Integer> pascalTriangle) {
            System.out.print("[" + pascalTriangle.get(0) + "]");
            for (int j = 1; j < pascalTriangle.size(); j++) {
                System.out.print(", [" + pascalTriangle.get(j) + "]");
            }
        System.out.println();
    }

    private static List<Integer> generate(int rowIndex) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.get(0).add(1);


        for (int i = 1; i < rowIndex + 1; i++) {
            list.add(new ArrayList<>());
            list.get(i).add(1);
            for (int j = 1; j < i; j++) {
                list.get(i).add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
            }
            list.get(i).add(1);
        }
        return list.get(rowIndex);
    }
}
