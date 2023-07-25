import java.util.ArrayList;
import java.util.List;

public class Pascals_triangle {
    public static void main(String[] args) {
        PrintTriangle(generate(8));
    }

    private static void PrintTriangle(List<List<Integer>> pascalTriangle) {
        for (int i = 0; i < pascalTriangle.size(); i++) {
            System.out.print("[[" + pascalTriangle.get(i).get(0) + "]");
            for (int j = 1; j < pascalTriangle.get(i).size(); j++) {
                System.out.print(", [" + pascalTriangle.get(i).get(j) + "]");
            }
            System.out.println("]");
        }
    }

    private static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.get(0).add(1);


        for (int i = 1; i < numRows; i++) {
            list.add(new ArrayList<>());
            list.get(i).add(1);
            for (int j = 1; j < i; j++) {
                list.get(i).add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
            }
            list.get(i).add(1);
        }
        return list;
    }
}
