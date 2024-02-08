package practice;

import java.util.Scanner;

 class classAtcs2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Parse script
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        String line3 = scanner.nextLine();

        // Parse variable names
        String[] variableNames = scanner.nextLine().split(" ");

        // Parse variable values
        int[] variableValues = new int[variableNames.length];
        String[] values = scanner.nextLine().split(" ");
        for (int i = 0; i < values.length; i++) {
            variableValues[i] = Integer.parseInt(values[i]);
        }

        // Execute script
        if (line1.equals("is " + variableNames[0] + "<" + variableNames[1]) && line2.equals("Yes")) {
            System.out.println(variableValues[0]);
        } else if (line1.equals("is " + variableNames[0] + ">" + variableNames[1]) && line2.equals("Yes")) {
            System.out.println(variableValues[1]);
        } else if (line1.equals("is " + variableNames[0] + ">" + variableNames[1]) && line2.equals("Yes")
                && line3.equals("is " + variableNames[0] + ">" + variableNames[2]) && line3.equals("Yes")) {
            System.out.println(variableValues[0]);
        } else if (line1.equals("is " + variableNames[0] + ">" + variableNames[1]) && line2.equals("Yes")
        		  && line3.equals("is " + variableNames[0] + ">" + variableNames[2]) && line3.equals("No")
                  && line3.equals("is " + variableNames[1] + ">" + variableNames[2]) && line3.equals("Yes")) {
              System.out.println(variableValues[1]);
          } else if (line1.equals("is " + variableNames[0] + ">" + variableNames[1]) && line2.equals("Yes")
                  && line3.equals("is " + variableNames[0] + ">" + variableNames[2]) && line3.equals("No")
                  && line3.equals("is " + variableNames[1] + ">" + variableNames[2]) && line3.equals("No")) {
              System.out.println(variableValues[2]);
          }

          scanner.close();
      }
  }
