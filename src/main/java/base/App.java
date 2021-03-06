/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Soroush Alinaghian
 */
package base;

import java.util.Scanner;

/*
Comparing one input to a known value is common enough, but you’ll often need to process a collection of inputs.

Write a program that asks for three numbers. Check first to see that all numbers are different. If they’re not different, then exit the program. Otherwise, display the largest number of the three.

Example Output

Enter the first number: 1
Enter the second number: 51
Enter the third number: 2
The largest number is 51.

Constraint

Write the algorithm manually. Don’t use a built-in function for finding the largest number in a list.

Challenges
Modify the program so that all entered values are tracked and the user is prevented from entering a number that’s already been entered.
Modify the program so that it asks for ten numbers instead of three.
Modify the program so that it asks for an unlimited number of numbers.
 */
public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int firstNum = getFirstNum();
        int secondNum = getSecondNum();
        int thirdNum = getThirdNum();
        findLargestNum(firstNum, secondNum, thirdNum);
    }

    private static void findLargestNum(int first, int sec, int third) {
        int numbers[] = {first, sec, third};
        int max = numbers[0];
        for (int i = 0; i < 3; i++) {
            if(numbers[i] > max)
                max = numbers[i];
        }
        System.out.println(String.format("The largest number is %d.", max));
    }

    private static int getFirstNum() {
        System.out.print("Enter the first number: ");
        return in.nextInt();
    }

    private static int getSecondNum() {
        System.out.print("Enter the second number: ");
        return in.nextInt();
    }

    private static int getThirdNum() {
        System.out.print("Enter the third number: ");
        return in.nextInt();
    }
}
