package movies;

import util.Input;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class MoviesApplication {
    public static void main(String[] args) {
        Input in = new Input();

        while (true) {
            // Get all movies
            ArrayList<Movie> movies = MoviesArray.findAll();
            // Getting all unique categories
            String[] uniqueCats = movies.stream().map(Movie::getCategory).distinct().toArray(String[]::new);

            System.out.println("What would you like to do?");
            System.out.println("0. exit");
            System.out.println("1. view movies in all categories");
            for (int i = 0; i < uniqueCats.length; i++) {
                System.out.format("%d. View movies in the %s category\n", i + 2, uniqueCats[i]);
            }
            System.out.printf("%d. add a custom movie\n", uniqueCats.length + 3);
            int userIn = in.getInt(0, uniqueCats.length + 3);
            if (userIn == 0) return;
            if (userIn == uniqueCats.length + 3) {
                System.out.println("What's the name of the movie?");
                in.clearCache();
                String movieName = in.getString();
                System.out.println("What's the genre?");
                String movieCategory = in.getString().toLowerCase(Locale.ROOT);
                MoviesArray.addMovie(new Movie(movieName, movieCategory));
                continue;
            }

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
