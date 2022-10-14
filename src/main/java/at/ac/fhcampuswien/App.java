package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber() {
        // input your solution here
        Scanner scanner = new Scanner(System.in);

        double highestNumber = 0;

        for (int i = 1; i >= 1; i++) {

            System.out.print("Number " + i + ": ");
            double number = scanner.nextDouble();

            if (number > highestNumber) {

                highestNumber = number;
            }

            if (number <= 0 && i == 1) {
                System.out.println("No number entered.");
                break;
            }

            if (number <= 0) {
                System.out.printf("The largest number is %.2f", highestNumber); // print f um das Format anzugeben
                System.out.println(); //without this app test fails
                break;
            }
        }
    }

    //todo Task 2
    public void stairs() {
        // input your solution here
        Scanner scanner = new Scanner(System.in);

        System.out.print("n: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Invalid number!");
        }


        int counter = 1;

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter++ + " ");
            }
            System.out.println();
        }

    }

    //todo Task 3
    public void printPyramid() {
        // input your solution here
        int row = 6;
        int space = row - 1;
        int base = 1;

        for (int i = 0; i < row; i++) {
            if (i > 0) {
                base += 2;
            }

            for (int j = 0; j < space + base; j++) {
                if (j >= space) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            space -= 1;

            System.out.println();

        }
    }

    //todo Task 4
    public void printRhombus() {
        // input your solution here
        Scanner scanner = new Scanner(System.in);

        System.out.print("h: ");
            int h = scanner.nextInt();
        System.out.print("c: ");
            int c = scanner.next().charAt(0);

        if (h % 2 != 0) {
            for (int i = 0; i <= h / 2; i++) {
                for (int j = i; j < h / 2; j++) {
                    System.out.print(" ");
                }
                for (int k = - i; k <= i; k++) {
                    System.out.print((char) (c - Math.abs(k)));
                }
                    System.out.println();
// upper part of the diamond shape
            }
            for (int i = h / 2; i > 0; i--) {
                for (int j = i; j <= h / 2; j++) {
                    System.out.print(" ");
                }
                for (int k = - i + 1; k < i; k++) {
                    System.out.print((char) (c - Math.abs(k)));
                }
                    System.out.println();
            }
//lower part of the diamond shape

        } else {
            System.out.println("Invalid number!");

        }
    }
// https://www.youtube.com/watch?v=YKdB1kpeA_c good explanation to this problem (but numeric)
// https://codereview.stackexchange.com/questions/40417/print-an-ascii-diamond also a good help

    //todo Task 5
    public void marks() {
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int nmarks = 0;
        int sum = 0;
        double avrg = 0.00;
        int input;

        do {
            System.out.print("Mark " + counter + ": ");
            input = scanner.nextInt();

            if(input < 6 && input != 0) {
                    sum+=input;

                    if (input == 5) {
                        nmarks++;
                    }
                    counter++;
                }else if (input != 0) {
                    System.out.println("Invalid mark!");

                }else {
                        counter--;
                    }
        }while(input != 0);
                if(counter != 0) {
                        avrg = (double) sum / counter;
                    }
            System.out.printf("Average: %.2f", avrg);
            System.out.println(); // empty so average and negative marks get shown in different lines
            System.out.println("Negative marks: " + nmarks);
        }



    //todo Task 6
    public void happyNumbers() {
        // input your solution here
        Scanner scanner = new Scanner(System.in);
        System.out.print("n: ");
        int number = scanner.nextInt();
        int sum = 0;
        int var;

        while (number != 1 && number != 4) { //tried with | but didn´t work out quite well bc then it would be active all the time

            while (number > 0) {
                var = number % 10;
                sum = sum + (var * var);
                number = number / 10;
            }
            number = sum;
            sum = 0;
            }
            if (number == 1) {
                System.out.println("Happy number!");
            } else {
                System.out.println("Sad number!");
            }

        }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}