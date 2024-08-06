package com.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;

public class Exercise extends MultiType {

    public Exercise() {
    }

    public Exercise(int number) {
        super(number);
    }

    public Exercise(long longg) {
        super(longg);
    }

    public Exercise(int[] array) {
        super(array);
    }

    public Exercise(int[][] matrix) {
        super(matrix);
    }

    public Exercise(String string) {
        super(string);
    }

    public Exercise(String[] mixType) {
        super(mixType);
    }

    // 1.1: Determining whether the input number is even or odd
    public void evenOrOdd() {
        if (number % 2 == 0) {
            System.out.println("This number is even");
        } else
            System.out.println("This number is odd");
    }

    // 2.1: Print all odd numbers less than the input number
    public void oddNumbers() {
        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 0; i <= number; i++) {
            if (i % 2 != 0) {
                numbers.add(i);
            }
        }
        System.out.println("all odd numbers less than" + number + "are : \n" + numbers.toString());
    }

    // 3.1: Print all prime numbers less than 100
    public void primeNumbersUnder100() {
        boolean flage = true;
        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 2; i < 100; i++) {
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flage = false;
                }
            }
            if (flage) {
                numbers.add(i);
            }
            flage = true;
        }
        System.out.println("All prime numbers less than 100 are :\n" + numbers.toString());
    }

    // 4.1: Determining whether the input number matches to which day of the week
    public void dayOfWeek() {
        switch (number) {
        case 1:
            System.out.println("Sunday");
            break;
        case 2:
            System.out.println("Monday");
            break;
        case 3:
            System.out.println("Tuesday");
            break;
        case 4:
            System.out.println("Wednesday");
            break;
        case 5:
            System.out.println("Thursday");
            break;
        case 6:
            System.out.println("Friday");
            break;
        case 7:
            System.out.println("Saturday");
            break;

        default:
            System.out.println("Number is not valied!");
            break;
        }

    }

    // 5.1: Print all multiples of 5 that are less than the input number
    public void listOfMultiple5() {
        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 1; i <= number; i++) {
            if (i % 5 == 0) {
                numbers.add(i);
            }
        }
        System.out.println("All multiples of 5 that are less than" + number + "are :\n" + numbers.toString());
    }

    // 6.1: Print an isosceles right triangle with a height of 5
    public void makeTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 7.1: Take 5 numbers and sort them and calculate their max, min and avg
    public void calculationOn5Numbers() {
        double sum = 0;
        double avg;
        Arrays.sort(array);
        for (int i : array) {
            sum += i;
        }
        avg = sum / array.length;
        System.out.println("The sorted array is :\n" + Arrays.toString(array) + "\nThe min is :\n" + array[0]
                + "\nThe max is :\n" + array[4] + "\nThe avg is :\n" + avg);
    }

    // 8.1: Calculate the sum of the main and minor diameter arrays in 5*5 matrix
    public void calculationOnMatrix() {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (i == j || i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }
        System.out.println("The sum of the main and minor diameter arrays is : \n" + sum);
    }

    // 9.1: Which approach for reading and writing an array has the highest
    // performance: in-rows or in-columns?
    public void rowOrColumn() {
        System.out.println("[in-rows approach\n" + "Because accessing arrays in a row-major order tends to be faster,\n"
                + "this is because java store arrays in a row-major order,\n"
                + "meaning that elements in the same row are stored in contignous memory location]");
    }

    // 10.1: A method that get an array with size 5 and return array with size 7
    public int[] extendedArray() {
        int length = array.length + 2;
        int[] newArray = Arrays.copyOf(array, length);

        return newArray;
    }

    // 1.2: Divide by zero
    public void divideByZero() {
        System.out.println("When you attempt to divide an integer by zero, java throws an (ArithmeticException)");
        try {
            int divide = 10 / 0;
            System.out.println(divide);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    // 2.2: The longest word in a sentence
    public void theLongestWord() {
        String[] words = string.split("\\s+");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("The longest word in this sentence is :\n" + longestWord);
    }

    // 3.2: The longest sentcen in a number of sentences
    public void theLongestSentence() {
        String[] sentences = string.split("[.?!]");
        String longestSentence = "";
        String trimSentence;
        for (String sentence : sentences) {
            trimSentence = sentence.trim().replaceAll("\\s{2,}", " ");
            if (trimSentence.length() > longestSentence.length()) {
                longestSentence = trimSentence;
            }
        }
        System.out.println("The longest word in this sentence is :\n" + longestSentence);

    }

    // 4.2: The number of upper case and lower case letters in a sentence
    public void charInSentence() {
        int upperCase = 0;
        int lowercase = 0;
        for (char c : string.toCharArray()) {
            if (Character.isUpperCase(c))
                upperCase++;
            else if (Character.isLowerCase(c))
                lowercase++;
        }
        System.out.println(
                "The number of upper case is :\n" + upperCase + "\n The number of lower case is :\n" + lowercase);
    }

    // 5.2: Managing the file involves writing to it, printing and modifying its
    // information
    public void managingFile() {
        String userName;
        String password;
        long accountNumber;
        long amount;
        String masqPassword;
        String masqAccountNumber;
        System.out.println(mixType[1]);
        userName = mixType[0];
        password = mixType[1];
        accountNumber = Long.parseLong(mixType[2]);
        amount = Long.parseLong(mixType[3]);

        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter("/Users/imans/Desktop/Iman-Abbasizadeh/myFile3.txt"))) {
            writer.write("User name : " + userName + "\n");
            writer.write("Password : " + password + "\n");
            writer.write("Account number : " + accountNumber + "\n");
            writer.write("Amount : " + amount + "\n");

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("The orginal data is");

        try (BufferedReader reader = new BufferedReader(
                new FileReader("/Users/imans/Desktop/Iman-Abbasizadeh/myFile3.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        masqPassword = password.replaceAll(".", "*");
        masqAccountNumber = Long.toString(accountNumber).substring(0, 3) + "******"
                + Long.toString(accountNumber).substring(9);

        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter("/Users/imans/Desktop/Iman-Abbasizadeh/myFile3.txt"))) {
            writer.write("User name : " + userName + "\n");
            writer.write("Password : " + masqPassword + "\n");
            writer.write("Account number : " + masqAccountNumber + "\n");
            writer.write("Amount : " + amount + "\n");

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("The masqed data is");

        try (BufferedReader reader = new BufferedReader(
                new FileReader("/Users/imans/Desktop/Iman-Abbasizadeh/myFile3.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // 6.2: Sorting a 2D array
    public void sortingMatrix() {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] flatArray = new int[rows * cols];
        int index = 0;
        System.out.println("The orginal matrix is :");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
            for (int num : row) {
                flatArray[index++] = num;
            }
        }
        Arrays.sort(flatArray);
        index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = flatArray[index++];
            }
        }
        System.out.println("Sorted matrix is :");
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
