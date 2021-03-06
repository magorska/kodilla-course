package com.kodilla.good.patterns.challenges;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MovieStoreApplication {
    public static void main(String[] args) {

        MovieStore movieStore = new MovieStore();
        Map<String, List<String>> movieMap = movieStore.getMovies();

        String moviesTranslationsList = movieMap.entrySet().stream()
                .flatMap(list -> list.getValue().stream())
                .collect(Collectors.joining("!"));

        System.out.println(moviesTranslationsList);
    }
}
