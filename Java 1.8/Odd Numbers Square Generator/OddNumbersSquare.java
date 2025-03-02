import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OddNumbersSquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<Integer> oddSquares = Stream.iterate(1, i -> i + 2) // Generate odd numbers
                .limit(n / 2 + 1) // Limit to odd numbers up to N
                .map(i -> i * i) // Square each odd number
                .collect(Collectors.toList());

        System.out.println(oddSquares);
    }
}
