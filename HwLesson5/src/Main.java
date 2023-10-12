import phonebook.TelephoneDirectory;
import phonebook.Record;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static int countOccurrence(List<String> words, String target) {
        int count = 0;
        for (String word : words) {
            if (word.equals(target)) {
                count++;
            }
        }
        return count;
    }

    public static List<Integer> toList(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int item : array) {
            list.add(item);
        }
        return list;
    }

    public static List<Integer> findUnique(List<Integer> numbers) {
        List<Integer> uniqueNumbers = new ArrayList<>();

        for (Integer number : numbers) {
            if (!uniqueNumbers.contains(number)) {
                uniqueNumbers.add(number);
            }
        }

        return uniqueNumbers;
    }

    public static void calcOccurrence(List<String> words) {
        List<String> uniqueWords = new ArrayList<>();
        List<Integer> counts = new ArrayList<>();

        for (String word : words) {
            if (uniqueWords.contains(word)) {
                int index = uniqueWords.indexOf(word);
                counts.set(index, counts.get(index) + 1);
            } else {
                uniqueWords.add(word);
                counts.add(1);
            }
        }

        for (int i = 0; i < uniqueWords.size(); i++) {
            System.out.println("Word: " + uniqueWords.get(i) + ", Occurrences: " + counts.get(i));
        }
    }

    public static List<WordOccurrence> findOccurrence(List<String> words) {
        List<String> uniqueWords = new ArrayList<>();
        List<Integer> counts = new ArrayList<>();
        List<WordOccurrence> occurrences = new ArrayList<>();

        for (String word : words) {
            if (uniqueWords.contains(word)) {
                int index = uniqueWords.indexOf(word);
                counts.set(index, counts.get(index) + 1);
            } else {
                uniqueWords.add(word);
                counts.add(1);
            }
        }

        for (int i = 0; i < uniqueWords.size(); i++) {
            occurrences.add(new WordOccurrence(uniqueWords.get(i), counts.get(i)));
        }

        return occurrences;
    }

    public static void main(String[] args) {
        //countOccurrence
        List<String> words = List.of("one", "two", "three", "two", "four", "five", "two", "six", "seven", "two");
        String target = "two";
        System.out.println("The word '" + target + "' occurs " + countOccurrence(words, target) + " times in the list");

        //toList
        int[] array = {1, 2, 3};
        List<Integer> list = toList(array);
        System.out.println("Was Array: " + Arrays.toString(array));
        System.out.println("List became: " + list);

        //findUnique
        List<Integer> numbers = List.of(1, 2, 3, 2, 4, 5, 5, 6, 7);
        List<Integer> uniqueNumbers = findUnique(numbers);
        System.out.println("Original List: " + numbers);
        System.out.println("Unique Numbers: " + uniqueNumbers);

        //calcOccurrence
        calcOccurrence(words);

        //findOccurrence
        List<WordOccurrence> occurrences = findOccurrence(words);
        for (WordOccurrence occurrence : occurrences) {
            System.out.println(occurrence);
        }

        //phonebook
        TelephoneDirectory directory = new TelephoneDirectory();
        directory.add(new Record("Kate", "666-555-1234"));
        directory.add(new Record("John", "323-555-7776"));
        directory.add(new Record("Kate", "646-333-5555"));
        System.out.println(directory.find("Kate"));
        System.out.println(directory.findAll("Kate"));
    }
}