package dev.sukhorukov.collections;

import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

public class IteratorExampleTest {

    @Test
    void testIterator() {
        // We can use Iterator when we need remove some elements of collection while iterating through
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1, 8, 9));

        Iterator<Integer> integerIterator = integerList.iterator();

        while (integerIterator.hasNext()) {
            integerIterator.next();
            integerIterator.remove();
        }

        assert integerList.isEmpty();
    }

    @Test
    void testListIterator() {
        String palindrome = "madam";

        List<Character> characterList = palindrome.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

        //The main difference between Iterator and ListIterator in Java is that ListIterator is a bidirectional iterator,
        // which means it can traverse the list in both forward and backward directions, while Iterator can only traverse
        // the list in a forward direction. Additionally, ListIterator provides additional methods like add(), set(),
        // and previous() that are not available in Iterator. ListIterator is only available for List implementations,
        // while Iterator can be used with any collection type.
        ListIterator<Character> listIterator = characterList.listIterator();
        ListIterator<Character> reverseListIterator = characterList.listIterator(characterList.size());
        boolean isPalindrome = true;

        while (listIterator.hasNext() && reverseListIterator.hasPrevious()) {
            if (!Objects.equals(listIterator.next(), reverseListIterator.previous())) {
                isPalindrome = false;
                break;
            }
        }

        assert isPalindrome;
    }
}
