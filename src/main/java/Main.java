import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void mapWords (List<String> words, Map<String, String> vocabulary) {
        for (int i = 0; i < words.size(); i++) {
            if (vocabulary.containsKey(words.get(i))) {
                System.out.print(vocabulary.get(words.get(i)) + " ");
            } else {
                System.out.println("Неизвестное слово");
            }
        }


    }

    public static void main (String[] args) {
        Map<String, String> vocabulary = new TreeMap<>();
        vocabulary.put("Apple", "Яблоко");
        vocabulary.put("Cat", "Кошка");
        vocabulary.put("Dog", "Собака");
        vocabulary.put("Animal", "Животное");

        String str = "Apple Cat Dog Animal Tree";

        Function<String, String[]> map = x -> x.split(" ");
        String[] newStr = map.apply(str);

        List<String> words = Arrays.stream(newStr)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());

        mapWords(words, vocabulary);










    }


}

