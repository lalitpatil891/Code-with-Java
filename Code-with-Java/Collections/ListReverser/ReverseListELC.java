/**
 ReverseListELC
Create a program in java which will to reverse a list

Enter the size of the list: 5
Enter elements of the list: 4 5 6 7 8
Reversed list: [8, 7, 6, 5, 4]

Sample Input
5 5 4 3 2 1

Sample Output
Reversed list: [1, 2, 3, 4, 5]
------
*/
import java.util.*;

class ReverseListELC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the list: ");
        int size = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        System.out.println("Enter elements of the list:");
        for (int i = 0; i < size; i++) {
            int temp = sc.nextInt();
            list.add(temp);
        }

        Collections.reverse(list);

        System.out.println("Reversed list: " + list);

        sc.close();
    }
}
