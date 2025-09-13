import java.util.*;
import java.util.stream.Collectors;

public class UniqueWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        List<String> words = new ArrayList<>();
        while (n-- > 0) {
            words.addAll(Arrays.asList(scanner.nextLine().toLowerCase().split(" ")));
        }
        scanner.close();

        // Remove duplicates while maintaining order
        List<String> uniqueWords = words.stream().distinct().collect(Collectors.toList());

        System.out.println(uniqueWords);
    }
}
