package org.example.datastructures;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UsingMap {


        String[] authors;
        int pages;
        UsingMap(String[] authors, int pages){
            this.authors = authors;
            this.pages = pages;
        }

//        public static void main(String[] args) {
//            List<String> lijstMetAuteurs = boekenLijstAutheurs();
//
//            lijstMetAuteurs.forEach(System.out::println);
//
//    //        for (String jevader: jevadersAuthors){
//    //            System.out.println(jevader);
//    //        }
//
//    //        for (int i = 0; i < jevader().size(); i++) {
//    //            System.out.println(jevadersAuthors.get(i));
//    //        }
//
//
//        }

        public static List<String> bookslistAuthors(List<UsingMap> books){

            return books.stream()
                    .flatMap(a -> Arrays.stream(a.getAuthors()))
                    .collect(Collectors.toList());

//            boeken.stream().map(Boek::getAuthors).forEach(a -> {
//                System.out.println();
//                for (int i = 0; i < a.length; i++) {
//                    System.out.println(a[i]);
//                }
//            });

//            return "test";
        }

    public String[] getAuthors() {
        return authors;
    }
    }
