package org.example.datastructures;


import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

class UsingMapTest {

    @Test
    void bookslistAuthors() {
        List<UsingMap> books = List.of(new UsingMap(new String[] {"Dylan", "Weijgertze", "Jesajah", "Noah", "Jason"}, 12),new UsingMap(new String[] {"Dennis", "Cornelis", "Moes"}, 12),new UsingMap(new String[] {"Maajid", "Maarten-Jan", "Saidy"}, 12),new UsingMap(new String[] {"Sallah"}, 12));

        UsingMap.bookslistAuthors(books);

        System.out.println(books);

        List<String> expected = List.of("Dylan", "Weijgertze", "Jesajah", "Noah", "Jason","Dennis", "Cornelis", "Moes","Maajid", "Maarten-Jan", "Saidy","Sallah");

        assertEquals(expected, UsingMap.bookslistAuthors(books));
    }
}