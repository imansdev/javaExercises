package com.example;

import java.util.Scanner;

public class GetInput extends MultiType {
    protected static int selectedExercise;
    Scanner scanner = new Scanner(System.in);

    protected void getNumbers(int cases, int range) {
        switch (cases) {
        case 1:
            showExercisesList();
            selectedExercise = scanner.nextInt();
            if (1 <= selectedExercise && selectedExercise <= range) {
                toSplit();
            } else {
                System.out.println("Input number is out of the range please be careful in the next selection :))");
                getNumbers(1, range);
            }
            break;
        case 2:
            System.out.println("Plese enter a digit");
            number = scanner.nextInt();
            break;
        case 3:
            array = new int[5];
            System.out.println("Plese enter 5 digits");
            for (int i = 0; i < 5; i++) {
                array[i] = scanner.nextInt();
            }
            break;
        case 4:
            matrix = new int[3][3];
            System.out.println("Plese enter 9 digits");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
            break;
        case 5:
            // System.out.println("Please enter string");
            string = scanner.nextLine();
            string = scanner.nextLine();
            break;
        case 6:
            mixType = new String[4];
            System.out.println("Please enter your user name");
            mixType[0] = scanner.next();
            System.out.println("Please enter your password");
            mixType[1] = scanner.next();
            System.out.println("Please enter your account number ( must be 12 digits)");
            mixType[2] = Long.toString(scanner.nextLong());
            System.out.println("Please enter amount");
            mixType[3] = Long.toString(scanner.nextLong());
            break;
        default:
            System.out.println("You are out :))");
            break;
        }
    }

    protected final void againExe(int range) {
        int temp;
        System.out.println("Do you want to see the answers to the rest of the exercises?\n" + "Yes : 1\nNO : 0");
        temp = scanner.nextInt();
        if (temp == 1)
            getNumbers(temp, range);
        else if (temp == 0)
            getNumbers(temp, range);
        else {
            System.out.println("Your number selection is not 1 or 0");
            againExe(range);
        }

    }
    // TODO
    // scanner.close();

    protected void toSplit() {
    }

    protected void showExercisesList() {
    }

}
