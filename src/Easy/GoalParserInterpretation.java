package Easy;
//TASK.1678

public class GoalParserInterpretation {
    public static void main(String[] args) {
        String command1 = "G()(al)";
        String command2 = "G()()()()(al)";
        String command3 = "(al)G(al)()()G";

        System.out.println(interpret(command1));
        System.out.println(interpret(command2));
        System.out.println(interpret(command3));
    }

    private static String interpret(String command) {
        char[] str = command.toCharArray();
        StringBuilder result = new StringBuilder();
        int i = 0;

        while(i < str.length) {
            switch (str[i]) {
                case 'G':
                    result.append("G");
                    i++;
                    break;
                case '(':
                    if(str[i+1] == ')') {
                        result.append("o");
                        i=i+2;
                        break;
                    }
                    else {
                        result.append("al");
                        i=i+4;
                        break;
                    }
            }
        }
        return result.toString();
    }
}
