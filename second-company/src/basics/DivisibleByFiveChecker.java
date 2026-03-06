package basics;

import java.util.Scanner;

class DivisibleByFiveChecker {

    // Method to check divisibility
    public static void checkDivisibleByFive(int number) {

        if (number % 5 == 0) {
            System.out.println(number + " is divisible by 5.");
        } else {
            System.out.println(number + " is NOT divisible by 5.");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        checkDivisibleByFive(number);

        scanner.close();
    }
}

//python
/*class DivisibleByFiveChecker:

    @staticmethod
    def check_divisible_by_five(number):

        if number % 5 == 0:
            print(number, "is divisible by 5.")
        else:
            print(number, "is NOT divisible by 5.")


def main():
    number = int(input("Enter a number: "))
    DivisibleByFiveChecker.check_divisible_by_five(number)


if __name__ == "__main__":
    main()

 */

//javaSript
/*
class DivisibleByFiveChecker {

    static checkDivisibleByFive(number) {

        if (number % 5 === 0) {
            console.log(number + " is divisible by 5.");
        } else {
            console.log(number + " is NOT divisible by 5.");
        }
    }
}

let number = 45;

DivisibleByFiveChecker.checkDivisibleByFive(number);
*/