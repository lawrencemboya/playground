import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Apple");
        myList.add("Banana");
        myList.add("Orange");
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

        String secondFruit = myList.get(1);
        System.out.println(secondFruit);
        System.out.println(myList.get(0));
        System.out.println(myList.size());

        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

        for (String fruit: myList
        ) {
            System.out.println(fruit);
        }

        System.out.println("________________________________________");

        ArrayList<String> myTools = new ArrayList<String>();
        myTools.add("hammer");
        myTools.add("shovel");
        myTools.add("wrench");

        System.out.println("in ArrayList");
        if (myTools.contains("hammer")) {
            System.out.println("I have a hammer!");
        }

        System.out.println("XXXXXXXXXXXXXX");
        System.out.println("in Array");

        String[] myTool = { "hammer", "shovel", "wrench" };
        for(String tool: myTool) {
            if(tool.equals("hammer")) {
                System.out.println("I have a hammer!");
            }
        }
    }
}
