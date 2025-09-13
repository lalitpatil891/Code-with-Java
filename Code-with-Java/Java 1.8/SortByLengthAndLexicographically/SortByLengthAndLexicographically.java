import java.util.*;
import java.util.stream.Collectors;

public class SortByLengthAndLexicographically {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<String> words = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            words.add(scanner.nextLine());
        }

        List<String> sortedWords = words.stream()
                .sorted(Comparator.comparingInt(String::length).thenComparing(String::compareToIgnoreCase))
                .collect(Collectors.toList());

        System.out.println(sortedWords);
    }
}
