package Medium;
//Task.6

public class ZigZagConversion {
    public static void main(String[] args) {
        String test0 = "PLAYGPF1";
        System.out.println(converter(test0, 3));

        String test1 = "PAYPALISHIRING";
        System.out.println(converter(test1, 3));
        System.out.println(converter(test1, 4));

        String test2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(converter(test2, 1));
        System.out.println(converter(test2, 5));

        String test3 = "A";
        System.out.println(converter(test3, 2));

        String test4 = "ABC";
        System.out.println(converter(test4, 2));

        String test5 = "ABCD";
        System.out.println(converter(test5, 2));

    }

    private static String converter(String test, int rows) {
        //      Крайние случаи
        if(rows == 1) return test;
        if(rows == 0) return test;

        char[] text = test.toCharArray();

        int length = calculateLength(test, rows);
        int textLength = test.length();

        int x = 0;
        int y = 0;
        boolean descend = true;
        char[][] field = new char[rows][length];

        for(int i = 0; i < textLength; i++) {
            if(descend) {
                field[y][x] = text[i];
                y++;
            }
            else {
                field[y][x] = text[i];
                y--;
                x++;
            }

            if((!descend)&&(y<1)) {
                descend = true;
                y = 0;
            }

            if(y==rows) {
                descend = false;
                y = y - 2;
                if(y<1) {
                    descend = true;
                    y = 0;
                }
                x++;
            }
        }
        return makeString(field);
    }

    private static String makeString(char[][] field) {
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < field.length; i++)
            for(int j = 0; j < field[0].length; j++) {
                if(field[i][j]!='\0')
                    result.append(field[i][j]);
            }
        return result.toString();
    }

    private static int calculateLength(String test, int rows) {
        int length = 0;
        int index = 0;
        int textLength = test.length();
        boolean descend = true;

//        Крайние случаи
        if((rows == 2) && (textLength >= rows))
            return textLength;


        while(index < textLength) {
            if(descend) {
                index = index + rows;
                length++;
                descend = false;
            }
            else {
                if((index + rows - 2) < textLength) {
                    length = length + rows - 2;
                    index = index + rows - 2;
                } else {
                    length = length + textLength - index;
                    index = textLength;
                }
                descend = true;
            }
        }
        return length;
    }
}
