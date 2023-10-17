package lesson6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(8, 1, 2, 3, 4, 5, 6, 7));
        printOddNumbers(nums);
        List<Integer> nums2 = new ArrayList<>(List.of(14, 16, 13, 8, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        printUniqueEvenNumbers(nums2);
        Collection<String> words = new ArrayList<>(List.of("Hello", "java", "ok", "hello", "bye", "good", "java", "luck", "bye"));
        printUniqueWords(words);
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        printNumberOfDuplication(strings);
    }

    public static void printOddNumbers(Collection<Integer> numbers) {
        System.out.println("Задание №1");

        for (Integer number : numbers) {
            if (!(number % 2 == 0)) {
                System.out.println(number);
            }
        }
    }

    public static void printUniqueEvenNumbers(Collection<Integer> numbers) {
        System.out.println("Задание №2");

        Set<Integer> nums = new HashSet<>(numbers);
        List<Integer> numbersList = new ArrayList<>(nums);
        Collections.sort(numbersList);
        for (Integer number : numbersList) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

    public static void printUniqueWords(Collection<String> words) {
        System.out.println("Задание №3");

        Collection<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);
    }

    public static void printNumberOfDuplication(List<String> words) {
        System.out.println("Задание №4");

        List<String> words2 = new ArrayList<>(words);

        String word = "";
        for (int i = 0; i < words2.size(); i++) {
            int numOfDuplication = 1;
            word = words2.get(i);
            for (int i1 = i + 1; i1 < words2.size(); i1++) {
                if (words2.get(i) != null && word.equals(words2.get(i1))) {
                    words2.set(i1, null);
                    numOfDuplication++;
                }
            }
            if (word != null) {
                System.out.println("Количество повторений слова " + word + " равно " + numOfDuplication);
            }

        }
    }
}
