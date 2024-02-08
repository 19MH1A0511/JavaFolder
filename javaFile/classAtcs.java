package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class classAtcs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read names
        String[] names = scanner.nextLine().split(" ");

        // Read N
        int N = Integer.parseInt(scanner.nextLine());

        // First round elimination
        ArrayList<String> remainingNames = firstRoundElimination(names);

        // Second round elimination
        String winner = secondRoundElimination(remainingNames, N);

        // Print the winner
        System.out.println(winner);

        scanner.close();
    }

    // Function for the first round elimination
    private static ArrayList<String> firstRoundElimination(String[] names) {
        ArrayList<String> remainingNames = new ArrayList<>();

        for (String name : names) {
            if (!isMirrorWord(name)) {
                remainingNames.add(name);
            }
        }

        return remainingNames;
    }
    // Function to check if a word is a mirror word
    private static boolean isMirrorWord(String word) {
        StringBuilder reversed = new StringBuilder(word).reverse();
        return word.equalsIgnoreCase(reversed.toString());
    }

    // Function for the second round elimination
    private static String secondRoundElimination(ArrayList<String> names, int N) {
        int index = 0;

        while (names.size() > 1) {
            index = (index + N - 1) % names.size();
            names.remove(index);
        }

        return names.get(0);
    }
}