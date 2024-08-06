package com.example;

public final class SelectInput {
    private static Exercise exe;

    public SelectInput(int selectedNumber) {
        generalSelection(selectedNumber);
    }

    static {
        System.out.println("*$* WELCOME *$*" + "\n Enter 1 to view the list of exercise 01"
                + "\n Enter 2 to view the list of exercise 02" + "\n Enter 0 to exit"
                + "\n ** Note: To see the answer to each exercise, just enter the corresponding number :)) ");
    }

    private static void generalSelection(int selectedNumber) {
        switch (selectedNumber) {
        case 1:
            Exe01 exe = new Exe01();
            exe.getNumbers(1, 10);
            break;
        case 2:
            Exe02 ex = new Exe02();
            ex.getNumbers(1, 6);
            break;
        case 0:
            System.out.println("You are out :))");
            break;
        default:
            System.out.println("✕✕✕ Enter the correct number ✕✕✕" + "\n Enter 1 to view the list of exercises"
                    + "\n Enter 0 to exit");
            generalSelection(selectedNumber);
            break;
        }
    }

    public static class Exe02 extends GetInput {
        @Override
        protected void showExercisesList() {
            System.out.println("1: Divide by zero" + "\n2: The longest word in a sentence"
                    + "\n3: The longest sentcen in a number of sentences"
                    + "\n4: The number of upper case and lower case letters in a sentence"
                    + "\n5: Managing the file involves writing to it, printing and modifying its information"
                    + "\n6: Sorting a 2D array" + "\n7: " + "\n8: " + "\n9: " + "\n10: " + "\n Choose one");
        }

        @Override
        protected void toSplit() {
            if (selectedExercise == 1) {
                exe = new Exercise();
                exe.divideByZero();
            } else if (selectedExercise == 6) {
                System.out.println("Please enter 9 numbers for create a 3*3 matrix");
                getNumbers(4, 6);
                exe = new Exercise(matrix);
                exe.sortingMatrix();
            } else if (selectedExercise == 5) {
                getNumbers(6, 6);
                exe = new Exercise(mixType);
                exe.managingFile();
            } else {
                switch (selectedExercise) {
                case 2:
                    System.out.println("Please write a sentence");
                    getNumbers(5, 6);
                    exe = new Exercise(string);
                    exe.theLongestWord();
                    break;
                case 3:
                    System.out.println(
                            "Please write number of sentences (your sentence must be end with [.?!] and do not press enter after each sentence)");
                    getNumbers(5, 6);
                    exe = new Exercise(string);
                    exe.theLongestSentence();
                    break;
                case 4:
                    System.out.println("Please write a sentence");
                    getNumbers(5, 6);
                    exe = new Exercise(string);
                    exe.charInSentence();
                    break;
                }
            }
            againExe(6);
        }

    }

    public static class Exe01 extends GetInput {
        @Override
        protected void showExercisesList() {
            System.out.println("1: Determining whether the input number is even or odd"
                    + "\n2: Print all odd numbers less than the input number"
                    + "\n3: Print all prime numbers less than 100"
                    + "\n4: Determining whether the input number matches to which day of the week"
                    + "\n5: Print all multiples of 5 that are less than the input number"
                    + "\n6: Print an isosceles right triangle with a height of 5"
                    + "\n7: Take 5 numbers and sort them and calculate their max, min and avg"
                    + "\n8: Calculate the sum of the main and minor diameter arrays in 3*3 matrix "
                    + "\n9: Which approach for reading and writing an array has the highest performance: in-rows or in-columns? "
                    + "\n10: A method that get an array with size 5 and return array with size 7" + "\n Choose one");
        }

        @Override
        protected void toSplit() {
            if (selectedExercise == 3 || selectedExercise == 6 || selectedExercise == 9)

            {
                exe = new Exercise();
                switch (selectedExercise) {
                case 3:
                    exe.primeNumbersUnder100();
                    break;
                case 6:
                    exe.makeTriangle();
                    break;
                case 9:
                    exe.rowOrColumn();
                    break;
                }
            } else if (selectedExercise == 1 || selectedExercise == 2 || selectedExercise == 4
                    || selectedExercise == 5) {
                System.out.println("Please enter the number");
                getNumbers(2, 10);
                exe = new Exercise(number);
                switch (selectedExercise) {
                case 1:
                    exe.evenOrOdd();
                    break;
                case 2:
                    exe.oddNumbers();
                    break;
                case 4:
                    exe.dayOfWeek();
                    break;
                case 5:
                    exe.listOfMultiple5();
                    break;
                }
            } else if (selectedExercise == 7 || selectedExercise == 10) {
                System.out.println("Please enter 5 numbers for create an array");
                getNumbers(3, 10);
                exe = new Exercise(array);
                switch (selectedExercise) {
                case 7:
                    exe.calculationOn5Numbers();
                    break;
                case 10:
                    System.out.println("The new size of array is : \n" + exe.extendedArray().length);
                    break;
                }
            } else {
                System.out.println("Please enter 9 numbers for create a 3*3 matrix");
                getNumbers(4, 10);
                exe = new Exercise(matrix);
                exe.calculationOnMatrix();
            }
            againExe(10);
        }
    }
}