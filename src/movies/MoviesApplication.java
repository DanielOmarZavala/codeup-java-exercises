package movies;

public class MoviesApplication {

    public static void main(String[] args) {

        int choice = Input.getInt(0, 5);

    }

    public static void printMenu() {

        System.out.println("What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n" +
                "\n" +
                "Enter your choice: 1\n" +
                "\n" +
                "Frankenstein -- horror\n" +
                "Goodfellas -- drama\n" +
                "Pulp Fiction -- drama");
    }

    public static void printMoviesByCategory(Movie[] movies, String category) {
        for (Movie movie : movies) {

        }
    }
}
