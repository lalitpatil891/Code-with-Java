import java.util.*;
import java.util.stream.Collectors;

public class StartWithVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<String> words = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            words.add(scanner.nextLine());
        }

        List<String> filteredWords = words.stream()
                .filter(word -> word.length() > 5 && word.toLowerCase().matches("^[aeiou].*"))
                .collect(Collectors.toList());

        System.out.println(filteredWords);
    }
}
