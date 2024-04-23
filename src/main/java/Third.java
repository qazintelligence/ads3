import java.util.*;

public class Third {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] shelf = new int[2 * n];
        int leftIndex = 0;
        int rightIndex = shelf.length - 1;

        for (int i = 0; i < n; i++) {
            int operation = scanner.nextInt();
            if (operation == 1 || operation == 2) {
                int diskNumber = scanner.nextInt();
                if (operation == 1) {
                    shelf[leftIndex++] = diskNumber;
                } else {
                    shelf[rightIndex--] = diskNumber;
                }
            } else {
                if (operation == 3) {
                    System.out.println(shelf[--leftIndex]);
                } else {
                    System.out.println(shelf[++rightIndex]);
                }
            }
        }

        scanner.close();
    }
}

