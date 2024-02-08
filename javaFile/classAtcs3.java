package practice;

import java.util.Scanner;

public class classAtcs3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int N = scanner.nextInt();
        int[] logs = new int[N];
        for (int i = 0; i < N; i++) {
            logs[i] = scanner.nextInt();
        }
        int W = scanner.nextInt();

        // Output
        double[] angles = calculateAngles(N, logs, W);
        for (double angle : angles) {
            System.out.print(String.format("%.2f", angle) + " ");
        }
    }

    public static double[] calculateAngles(int N, int[] logs, int W) {
        double[] angles = new double[N];
        double x = 0, y = 0; // Starting point

        for (int i = 0; i < N; i++) {
            int length = logs[i];

            if (i == 0) {
                // First log in the left part
                angles[i] = calculateAngle(x, y, x + length, y);
            } else if (i == N - 1) {
                // Last log in the right part
                angles[i] = calculateAngle(x, y, W, 0);
            } else {
                // Logs in the middle part
                angles[i] = 0;
            }
            x += length * Math.cos(Math.toRadians(angles[i]));
            y += length * Math.sin(Math.toRadians(angles[i]));
        }

        return angles;
    }

    public static double calculateAngle(double x1, double y1, double x2, double y2) {
        double angleRad = Math.atan2(y2 - y1, x2 - x1);
        return Math.toDegrees(angleRad);
    }
}

