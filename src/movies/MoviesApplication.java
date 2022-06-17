package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        Input in = new Input();
        Movie[] movies = MoviesArray.findAll();
        String[] uniqueCats = Arrays.stream(movies).map(Movie::getCategory).distinct().toArray(String[]::new);


        while (true) {
            System.out.println("What would you like to do?");
            System.out.println("0. exit");
            System.out.println("1. view movies in all categories");
            for (int i = 0; i < uniqueCats.length; i++) {
                System.out.format("%d. View movies in the %s category\n", i + 2, uniqueCats[i]);
            }
            int userIn = in.getInt(0, uniqueCats.length + 1);
            if (userIn == 0) return;

            for (Movie movie : movies) {
                String formatPrint = String.format("%s - %s", movie.getName(), movie.getCategory());
                if (userIn == 1) {
                    System.out.println(formatPrint);
                } else {
                    if (movie.getCategory().equals(uniqueCats[userIn - 2])) System.out.println(formatPrint);
                }
            }
            System.out.println("Would you like to continue? [y/N]");
            in.clearCache();
            if (!in.yesNo()) break;
        }

    }
}
