import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PracticeListsTest {
    PracticeLists practiceLists = new PracticeLists();

    @Test
    public void array2List() {
        String failureMessage = compareArrayLists(new ArrayList<String>(Arrays.asList("Apple", "Orange", "Banana")),
                practiceLists.array2List(new String[] {"Apple", "Orange", "Banana"}));
        if (failureMessage != null) fail("Input: array2List(new String[] {\"Apple\", \"Orange\", \"Banana\"})" + failureMessage);

        failureMessage = compareArrayLists(new ArrayList<String>(Arrays.asList("Red", "Orange", "Yellow")),
                practiceLists.array2List(new String[] {"Red", "Orange", "Yellow"}));
        if (failureMessage != null) fail("Input: array2List(new String[] {\"Red\", \"Orange\", \"Yellow\"})" + failureMessage);

        failureMessage = compareArrayLists(new ArrayList<String>(Arrays.asList("Left", "Right", "Forward", "Back")),
                practiceLists.array2List(new String[] {"Left", "Right", "Forward", "Back"}));
        if (failureMessage != null) fail("Input: array2List(new String[] {\"Left\", \"Right\", \"Forward\", \"Back\"})" + failureMessage);
    }

    @Test
    public void list2Array() {
        assertArrayEquals("Input: list2Array(new ArrayList<String>(Arrays.asList(\"Apple\", \"Orange\", \"Banana\")))",
                new String[] {"Apple", "Orange", "Banana"}, practiceLists.list2Array(new ArrayList<String>(Arrays.asList("Apple", "Orange", "Banana"))));

        assertArrayEquals("Input: list2Array(new ArrayList<String>(Arrays.asList(\"Red\", \"Orange\", \"Yellow\")))",
                new String[] {"Red", "Orange", "Yellow"}, practiceLists.list2Array(new ArrayList<String>(Arrays.asList("Red", "Orange", "Yellow"))));

        assertArrayEquals("Input: list2Array(new ArrayList<String>(Arrays.asList(\"Left\", \"Right\", \"Forward\", \"Back\")))",
                new String[] {"Left", "Right", "Forward", "Back"}, practiceLists.list2Array(new ArrayList<String>(Arrays.asList("Left", "Right", "Forward", "Back"))));
    }

    @Test
    public void no4LetterWords() {
        String failureMessage = compareArrayLists(new ArrayList<String>(Arrays.asList("Train", "Car")),
                practiceLists.no4LetterWords(new String[] {"Train", "Boat", "Car"}));
        if (failureMessage != null) fail("Input: no4LetterWords(new String[] {\"Train\", \"Boat\", \"Car\"})" + failureMessage);

        failureMessage = compareArrayLists(new ArrayList<String>(Arrays.asList("Red", "White")),
                practiceLists.no4LetterWords(new String[] {"Red", "White", "Blue"}));
        if (failureMessage != null) fail("Input: no4LetterWords(new String[] {\"Red\", \"White\", \"Blue\"})" + failureMessage);

        failureMessage = compareArrayLists(new ArrayList<String>(Arrays.asList("Jim")),
                practiceLists.no4LetterWords(new String[] {"Jack", "Jill", "Jane", "John", "Jim"}));
        if (failureMessage != null) fail("Input: no4LetterWords(new String[] {\"Jack\", \"Jill\", \"Jane\", \"John\", \"Jim\"})" + failureMessage);
    }

    @Test
    public void reverseList() {
        String failureMessage = compareArrayLists(new ArrayList<String>(Arrays.asList("green", "yellow", "blue", "green", "purple")),
                practiceLists.reverseList(new ArrayList<String>(Arrays.asList("purple", "green", "blue", "yellow", "green" ))));
        if (failureMessage != null) fail("Input: reverseList(new ArrayList<Object>(Arrays.asList(\"purple\", \"green\", \"blue\", \"yellow\", \"green\" )))" + failureMessage);

        failureMessage = compareArrayLists(new ArrayList<String>(Arrays.asList("way", "the", "all", "jingle", "bells", "jingle", "bells", "jingle")),
                practiceLists.reverseList(new ArrayList<String>(Arrays.asList("jingle", "bells", "jingle", "bells", "jingle", "all", "the", "way"))));
        if (failureMessage != null) fail("Input: reverseList(new ArrayList<Object>(Arrays.asList(\"jingle\", \"bells\", \"jingle\", \"bells\", \"jingle\", \"all\", \"the\", \"way\")))" + failureMessage);
    }

    @Test
    public void arrayInt2ListDouble() {
        String failureMessage = compareArrayLists(new ArrayList<Double>(Arrays.asList(2.5d, 4.0d, 5.5d, 100.0d, 48.5d)),
                practiceLists.arrayInt2ListDouble(new int[] {5, 8, 11, 200, 97}));
        if (failureMessage != null) fail("Input: arrayInt2ListDouble(new int[] {5, 8, 11, 200, 97})" + failureMessage);

        failureMessage = compareArrayLists(new ArrayList<Double>(Arrays.asList(372.5d, 11.5d, 22.0d, 4508.5d, 3.0d)),
                practiceLists.arrayInt2ListDouble(new int[] {745, 23, 44, 9017, 6}));
        if (failureMessage != null) fail("Input: arrayInt2ListDouble(new int[] {745, 23, 44, 9017, 6})" + failureMessage);

        failureMessage = compareArrayLists(new ArrayList<Double>(Arrays.asList(42.0d, 49.5d, 1642.5d, 6.5d, 438.5d)),
                practiceLists.arrayInt2ListDouble(new int[] {84, 99, 3285, 13, 877}));
        if (failureMessage != null) fail("Input: arrayInt2ListDouble(new int[] {84, 99, 3285, 13, 877})" + failureMessage);
    }

    @Test
    public void findLargest() {
        assertEquals("Input: findLargest(new ArrayList<Integer>(Arrays.asList(11, 200, 43, 84, 9917, 4321, 1, 33333, 8997)))",
                new Integer(33333), practiceLists.findLargest(new ArrayList<Integer>(Arrays.asList(11, 200, 43, 84, 9917, 4321, 1, 33333, 8997))));

        assertEquals("Input: findLargest(new ArrayList<Integer>(Arrays.asList(987, 1234, 9381, 731, 43718, 8932)))",
                new Integer(43718), practiceLists.findLargest(new ArrayList<Integer>(Arrays.asList(987, 1234, 9381, 731, 43718, 8932))));

        assertEquals("Input: findLargest(new ArrayList<Integer>(Arrays.asList(34070, 1380, 81238, 7782, 234, 64362, 627)))",
                new Integer(81238), practiceLists.findLargest(new ArrayList<Integer>(Arrays.asList(34070, 1380, 81238, 7782, 234, 64362, 627))));
    }

    @Test
    public void oddOnly() {
        String failureMessage = compareArrayLists(new ArrayList<Integer>(Arrays.asList(201, 9, 83)),
                practiceLists.oddOnly(new Integer[] {112, 201, 774, 92, 9, 83, 41872}));
        if (failureMessage != null) fail("Input: oddOnly(new Integer[] {112, 201, 774, 92, 9, 83, 41872})" + failureMessage);

        failureMessage = compareArrayLists(new ArrayList<Integer>(Arrays.asList(1143, 555, 7, 9953, 643)),
                practiceLists.oddOnly(new Integer[] {1143, 555, 7, 1772, 9953, 643}));
        if (failureMessage != null) fail("Input: oddOnly(new Integer[] {1143, 555, 7, 1772, 9953, 643})" + failureMessage);

        failureMessage = compareArrayLists(new ArrayList<Integer>(Arrays.asList(233, 811, 3, 9999)),
                practiceLists.oddOnly(new Integer[] {734, 233, 782, 811, 3, 9999}));
        if (failureMessage != null) fail("Input: oddOnly(new Integer[] {734, 233, 782, 811, 3, 9999})" + failureMessage);
    }

    @Test
    public void foundIntTwice() {
        assertEquals("Input: foundIntTwice(new ArrayList<Integer>(Arrays.asList(5, 7, 9, 5, 11)), 5)",
                true, practiceLists.foundIntTwice(new ArrayList<Integer>(Arrays.asList(5, 7, 9, 5, 11)), 5));

        assertEquals("Input: foundIntTwice(new ArrayList<Integer>(Arrays.asList(6, 8, 10, 11, 13)), 8)",
                false, practiceLists.foundIntTwice(new ArrayList<Integer>(Arrays.asList(6, 8, 10, 11, 13)), 8));

        assertEquals("Input: foundIntTwice(new ArrayList<Integer>(Arrays.asList(9, 23, 44, 2, 88, 44)), 44)",
                true, practiceLists.foundIntTwice(new ArrayList<Integer>(Arrays.asList(9, 23, 44, 2, 88, 44)), 44));
    }

    @Test
    public void fizzBuzzList() {
        String failureMessage = compareArrayLists(new ArrayList<String>(Arrays.asList("1", "2", "Fizz")),
                practiceLists.fizzBuzzList(new Integer[] {1, 2, 3}));
        if (failureMessage != null) fail("Input: fizzBuzzList(new Integer[] {1, 2, 3})" + failureMessage);

        failureMessage = compareArrayLists(new ArrayList<Object>(Arrays.asList("4", "Buzz", "Fizz")),
                practiceLists.fizzBuzzList(new Integer[] {4, 5, 6}));
        if (failureMessage != null) fail("Input: fizzBuzzList(new Integer[] {4, 5, 6})" + failureMessage);

        failureMessage = compareArrayLists(new ArrayList<Object>(Arrays.asList("7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz")),
                practiceLists.fizzBuzzList(new Integer[] {7, 8, 9, 10, 11, 12, 13, 14, 15}));
        if (failureMessage != null) fail("Input: fizzBuzzList(new Integer[] {7, 8, 9, 10, 11, 12, 13, 14, 15})" + failureMessage);
    }

    @Test
    public void interleaveLists() {
        List<Integer> trialList = practiceLists.interleaveLists(new ArrayList<Integer>(Arrays.asList(1, 2, 3)), new ArrayList<Integer>(Arrays.asList(4, 5, 6)));
        String failureMessage = compareArrayLists(new ArrayList<Integer>(Arrays.asList(1, 4, 2, 5, 3, 6)),	trialList);
        if (failureMessage != null) fail("Input: interleaveLists([1, 2, 3], [4, 5, 6])" + failureMessage);

        trialList = practiceLists.interleaveLists(new ArrayList<Integer>(Arrays.asList(7, 1, 3)), new ArrayList<Integer>(Arrays.asList(2, 5, 7, 9)));
        failureMessage = compareArrayLists(new ArrayList<Integer>(Arrays.asList(7, 2, 1, 5, 3, 7, 9)),	trialList);
        if (failureMessage != null) fail("Input: interleaveLists([7, 1, 3], [2, 5, 7, 9])" + failureMessage);

        trialList = practiceLists.interleaveLists(new ArrayList<Integer>(Arrays.asList(1,2,5,8)), new ArrayList<Integer>(Arrays.asList(4,5,6)));
        failureMessage = compareArrayLists(new ArrayList<Integer>(Arrays.asList(1,4,2,5,5,6,8)),	trialList);
        if (failureMessage != null) fail("Input: interleaveLists([1, 2, 5, 8], [4, 5, 6])" + failureMessage);

    }

    @Test
    public void boardingGate() {
        List<Integer> trialList = practiceLists.boardingGate(new ArrayList<Integer>(Arrays.asList(1, 13, 43, 22, 8, 11, 30, 2, 4, 14, 21)));
        String failureMessage = compareArrayLists(new ArrayList<Integer>(Arrays.asList(1, 8, 2, 4, 13, 11, 14, 22, 30, 21)),	trialList);
        if (failureMessage != null) fail("Input: boardingGate([1, 13, 43, 22, 8, 11, 30, 2, 4, 14, 21])" + failureMessage);

        trialList = practiceLists.boardingGate(new ArrayList<Integer>(Arrays.asList(29, 19, 9, 21, 11, 1, 0, 25, 15, 5, 31)));
        failureMessage = compareArrayLists(new ArrayList<Integer>(Arrays.asList(9, 1, 5, 19, 11, 15, 29, 21, 25)),	trialList);
        if (failureMessage != null) fail("Input: boardingGate([29, 19, 9, 21, 11, 1, 0, 25, 15, 5, 31])" + failureMessage);

        trialList = practiceLists.boardingGate(new ArrayList<Integer>(Arrays.asList(0, -1, 44, 31, 17, 7, 27, 16, 26, 6)));
        failureMessage = compareArrayLists(new ArrayList<Integer>(Arrays.asList(7, 6, 17, 16, 27, 26)),	trialList);
        if (failureMessage != null) fail("Input: boardingGate([0, -1, 44, 31, 17, 7, 27, 16, 26, 6])" + failureMessage);
    }

    /*
     * Compares two ArrayLists, and returns a null failure message if the lists are equal.
     * Otherwise, if the lists are not equal, returns a failure message explaining why.
     * Note, method returns with failure message on the first problem.
     *
     * Comparisons:
     * 		Neither String ArrayList may be null.
     * 		Both String ArrayLists must be the same length,
     * 			and the strings must be in the same order.
     */
    private String compareArrayLists(List<?> expectedList, List<?> actualList) {
        String failureMessage = null;
        if ((expectedList == null) || (actualList == null)) {
            failureMessage = expectedList == null? "expectedList is null " : "";
            failureMessage = actualList == null? "actualList is null" : "";
            return failureMessage.trim();
        }
        if (expectedList.size() != actualList.size()) {
            failureMessage = "array lengths differed, expected.length=" + expectedList.size() + " actual.length=" + actualList.size();
            return failureMessage;
        }
        int i = 0;
        for (Object expectedString : expectedList) {
            if ( ! expectedString.equals(actualList.get(i))) {
                failureMessage = "array elements at index " + i + " differ, expected:<" + expectedString + "> but was:<" + actualList.get(i) + ">";
                return failureMessage;
            }
            i++;
        }
        return failureMessage;
    }
}