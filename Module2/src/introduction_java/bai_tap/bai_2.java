package introduction_java.bai_tap;

import java.util.Scanner;

public class bai_2 {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);

        System.out.print("Nhap vao mot so co 3 chu so : ");
        int number = inputNumber.nextInt();
        String hundreds = "", tens = "", ones = "", output = "";

        if (number < 10 && number >= 0) {
            switch (number) {
                case 0:
                    output = "zero";
                    break;
                case 1:
                    output = "one";
                    break;
                case 2:
                    output = "two";
                    break;
                case 3:
                    output = "three";
                    break;
                case 4:
                    output = "four";
                    break;
                case 5:
                    output = "five";
                    break;
                case 6:
                    output = "six";
                    break;
                case 7:
                    output = "seven";
                    break;
                case 8:
                    output = "eight";
                    break;
                case 9:
                    output = "nine";
                    break;
            }
        }
        if (number >= 10 && number < 20) {
            switch (number % 10) {
                case 1:
                    output = "eleven";
                    break;
                case 2:
                    output = "twelve";
                    break;
                case 3:
                    output = "thirteen";
                    break;
                case 4:
                    output = "fourteen";
                    break;
                case 5:
                    output = "fifteen";
                    break;
                case 6:
                    output = "sixteen";
                    break;
                case 7:
                    output = "seventeen";
                    break;
                case 8:
                    output = "eighteen";
                    break;
                case 9:
                    output = "nineteen";
                    break;
            }
        }
        if (number >= 20) {
            switch ((int) (number - ((int) (number / 100)) * 100) / 10) {
                case 9:
                    tens = "ninety";
                    break;
                case 8:
                    tens = "eighty";
                    break;
                case 7:
                    tens = "seventy";
                    break;
                case 6:
                    tens = "sixty";
                    break;
                case 5:
                    tens = "fifty";
                    break;
                case 4:
                    tens = "forty";
                    break;
                case 3:
                    tens = "thirty";
                    break;
                case 2:
                    tens = "twenty";
                    break;
                case 0:
                    tens = "";
                    break;
            }
            switch ((int) number % 10) {
                case 1:
                    ones = "one";
                    break;
                case 2:
                    ones = "two";
                    break;
                case 3:
                    ones = "three";
                    break;
                case 4:
                    ones = "four";
                    break;
                case 5:
                    ones = "five";
                    break;
                case 6:
                    ones = "six";
                    break;
                case 7:
                    ones = "seven";
                    break;
                case 8:
                    ones = "eight";
                    break;
                case 9:
                    ones = "nine";
                    break;
            }
            output = tens + " " + ones;

        }
        if (number >= 100) {
            switch (number / 100) {
                case 1:
                    hundreds = "one hundred";
                    break;
                case 2:
                    hundreds = "two hundreds";
                    break;
                case 3:
                    hundreds = "three hundreds";
                    break;
                case 4:
                    hundreds = "four hundreds";
                    break;
                case 5:
                    hundreds = "five hundreds";
                    break;
                case 6:
                    hundreds = "six hundreds";
                    break;
                case 7:
                    hundreds = "seven hundreds";
                    break;
                case 8:
                    hundreds = "eight hundreds";
                    break;
                case 9:
                    hundreds = "nine hundreds";
                    break;
            }

            int tensAndOnesOfNumber = number % 100;
            String output1 = "";

            if (tensAndOnesOfNumber < 10) {
                switch (tensAndOnesOfNumber) {
                    case 0:
                        output1 = "zero";
                        break;
                    case 1:
                        output1 = "one";
                        break;
                    case 2:
                        output1 = "two";
                        break;
                    case 3:
                        output1 = "three";
                        break;
                    case 4:
                        output1 = "four";
                        break;
                    case 5:
                        output1 = "five";
                        break;
                    case 6:
                        output1 = "six";
                        break;
                    case 7:
                        output1 = "seven";
                        break;
                    case 8:
                        output1 = "eight";
                        break;
                    case 9:
                        output1 = "nine";
                        break;
                }
            }
            if (tensAndOnesOfNumber >= 10 && tensAndOnesOfNumber < 20) {
                switch (tensAndOnesOfNumber % 10) {
                    case 1:
                        output1 = "eleven";
                        break;
                    case 2:
                        output1 = "twelve";
                        break;
                    case 3:
                        output1 = "thirteen";
                        break;
                    case 4:
                        output1 = "fourteen";
                        break;
                    case 5:
                        output1 = "fifteen";
                        break;
                    case 6:
                        output1 = "sixteen";
                        break;
                    case 7:
                        output1 = "seventeen";
                        break;
                    case 8:
                        output1 = "eighteen";
                        break;
                    case 9:
                        output1 = "nineteen";
                        break;
                }
            }
            if (tensAndOnesOfNumber >= 20) {
                switch ((int) (tensAndOnesOfNumber - ((int) (tensAndOnesOfNumber / 100)) * 100) / 10) {
                    case 9:
                        tens = "ninety";
                        break;
                    case 8:
                        tens = "eighty";
                        break;
                    case 7:
                        tens = "seventy";
                        break;
                    case 6:
                        tens = "sixty";
                        break;
                    case 5:
                        tens = "fifty";
                        break;
                    case 4:
                        tens = "forty";
                        break;
                    case 3:
                        tens = "thirty";
                        break;
                    case 2:
                        tens = "twenty";
                        break;
                    case 0:
                        tens = "";
                        break;
                }
                switch ((int) tensAndOnesOfNumber % 10) {
                    case 1:
                        ones = "one";
                        break;
                    case 2:
                        ones = "two";
                        break;
                    case 3:
                        ones = "three";
                        break;
                    case 4:
                        ones = "four";
                        break;
                    case 5:
                        ones = "five";
                        break;
                    case 6:
                        ones = "six";
                        break;
                    case 7:
                        ones = "seven";
                        break;
                    case 8:
                        ones = "eight";
                        break;
                    case 9:
                        ones = "nine";
                        break;
                }
                output1 = tens + " " + ones;
            }
            if (number % 100 == 0) {
                output = hundreds;
            } else {
                output = hundreds + " and " + output1;
            }
        }
        System.out.println(output);
    }
}