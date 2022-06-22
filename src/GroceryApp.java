import util.COLORS;
import util.Input;

import java.util.ArrayList;
import java.util.Comparator;

public class GroceryApp {
    private static ArrayList<Grocery> groceries = new ArrayList<>();

    public static void main(String[] args) {
        Input in = new Input();

        while (true) {
            System.out.println("Would you like to: ");
            System.out.println("0. Show Grocery List");
            System.out.println("1. Add to grocery list");
            int userIn = in.getInt(0, 1);
            if (userIn == 0) {
                if (groceries.isEmpty()) {
                    System.err.println("Sorry, there arent any groceries in your list");
                    continue;
                }

                groceries.sort(Comparator.comparing(Grocery::getCategory));
                for (Grocery grocery : groceries) {
                    System.out.printf("%s - %s - %d\n", grocery.getCategory(), grocery.getName(), grocery.getQuantity());
                }
            }

            in.clearCache();
            do {
                System.out.println(COLORS.ANSI_CYAN + "What is the item?");
                String newGroceryName = in.getString();
                System.out.println(COLORS.ANSI_GREEN + "What type of food is it?");
                String newGroceryCategory = in.getString();
                System.out.println(COLORS.ANSI_RED + "How many of these do you need?" + COLORS.ANSI_RESET);
                int newGroceryQuantity = in.getInt(0);

                Grocery newGrocery = new Grocery(newGroceryName, newGroceryCategory, newGroceryQuantity);
                groceries.add(newGrocery);

                System.out.println("Would you like to enter another grocery?");
                in.clearCache();
            } while (in.yesNo());

        }


    }
}
