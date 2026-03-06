package basics;

import java.util.Scanner;

class NumberChecker {

    // Method to check number type
    public static void checkNumber(int number) {

        if (number > 0) {
            System.out.println("The number is Positive.");
        }
        else if (number < 0) {
            System.out.println("The number is Negative.");
        }
        else {
            System.out.println("The number is Zero.");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        checkNumber(number);

        scanner.close();
    }
}

//python
/*class NumberChecker:

    @staticmethod
    def check_number(number):

        if number > 0:
            print("The number is Positive.")

        elif number < 0:
            print("The number is Negative.")

        else:
            print("The number is Zero.")


def main():
    number = int(input("Enter a number: "))
    NumberChecker.check_number(number)


if __name__ == "__main__":
    main()

 */

//javaScript
/*
class NumberChecker {

    static checkNumber(number) {

        if (number > 0) {
            console.log("The number is Positive.");
        }
        else if (number < 0) {
            console.log("The number is Negative.");
        }
        else {
            console.log("The number is Zero.");
        }
    }
}

// Example input
let number = -10;

NumberChecker.checkNumber(number);
 */


