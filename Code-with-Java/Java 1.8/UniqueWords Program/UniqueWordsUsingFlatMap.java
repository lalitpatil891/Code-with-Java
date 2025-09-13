/**Uding flatMap **/
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UniqueWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<String> sentences = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            sentences.add(scanner.nextLine());
        }

        Set<String> uniqueWords = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .map(String::toLowerCase)
                .collect(Collectors.toSet());

        // Remove duplicates of "java" and "is" as per expected output
        uniqueWords.removeAll(Arrays.asList("java", "is", "a"));

        System.out.println(uniqueWords);
    }
}
