package Easy;
//TASK.1773

import java.util.ArrayList;

public class CountItemMatchingRule {

        public static void main(String[] args) {
            ArrayList<String> item1 = new ArrayList<>();
            item1.add("phone");
            item1.add("blue");
            item1.add("pixel");

            ArrayList<String> item2 = new ArrayList<>();
            item2.add("computer");
            item2.add("silver");
            item2.add("lenovo");

            ArrayList<String> item3 = new ArrayList<>();
            item3.add("phone");
            item3.add("gold");
            item3.add("iphone");

            ArrayList<ArrayList<String>> items = new ArrayList<>();

            items.add(item1);
            items.add(item2);
            items.add(item3);


            String ruleKey = "type";
            String ruleValue = "phone";

            System.out.println(countMatches(items, ruleKey, ruleValue));


            ruleKey = "color";
            ruleValue = "gold";

            System.out.println(countMatches(items, ruleKey, ruleValue));


            ArrayList<String> item21 = new ArrayList<>();
            item21.add("qqqq");
            item21.add("qqqq");
            item21.add("qqqq");

            ArrayList<String> item22 = new ArrayList<>();
            item22.add("qqqq");
            item22.add("qqqq");
            item22.add("qqqq");

            ArrayList<String> item23 = new ArrayList<>();
            item23.add("qqqq");
            item23.add("qqqq");
            item23.add("qqqq");

            ArrayList<String> item24 = new ArrayList<>();
            item24.add("qqqq");
            item24.add("qqqq");
            item24.add("qqqq");

            ArrayList<String> item25 = new ArrayList<>();
            item25.add("qqqq");
            item25.add("qqqq");
            item25.add("qqqq");

            ArrayList<String> item26 = new ArrayList<>();
            item26.add("qqqq");
            item26.add("qqqq");
            item26.add("qqqq");

            ArrayList<String> item27 = new ArrayList<>();
            item27.add("qqqq");
            item27.add("qqqq");
            item27.add("qqqq");

            ArrayList<ArrayList<String>> items2 = new ArrayList<>();

            items2.add(item21);
            items2.add(item22);
            items2.add(item23);
            items2.add(item24);
            items2.add(item25);
            items2.add(item26);
            items2.add(item27);

            ruleKey = "name";
            ruleValue = "qqqq";

            System.out.println(countMatches(items2, ruleKey, ruleValue));
        }

        private static int countMatches(ArrayList<ArrayList<String>> items, String ruleKey, String ruleValue) {
            int result = 0;
            switch(ruleKey) {
                case "type" :
                    for(int i = 0; i < items.size(); i++) {
                        if (items.get(i).get(0).equals(ruleValue)) result++;
                    }
                    break;
                case "color" :
                    for(int i = 0; i < items.size(); i++) {
                        if (items.get(i).get(1).equals(ruleValue)) result++;
                    }
                    break;
                case "name" :
                    for(int i = 0; i < items.size(); i++) {
                        if (items.get(i).get(2).equals(ruleValue)) result++;
                    }
                    break;
            }
            return result;
        }
}
