package basics;

import java.util.Scanner;

public class DivisibleByThreeAndFiveChecker {
    public static void checkdivisible(int number){
        if(number % 3 == 0 && number % 5 == 0){
            System.out.println("number is divisible by 3 or 5");
        }else {
            System.out.println("number is not divisible by 3 or 5");
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter a number");
        int number= sc.nextInt();
        checkdivisible(number);
        sc.close();
    }
}

//python
/*class DivisibleByThreeAndFiveChecker:

    @staticmethod
    def check_divisible(number):

        if number % 3 == 0 and number % 5 == 0:
            print(number, "is divisible by both 3 and 5.")
        else:
            print(number, "is NOT divisible by both 3 and 5.")


def main():
    number = int(input("Enter a number: "))
    DivisibleByThreeAndFiveChecker.check_divisible(number)


if __name__ == "__main__":
    main()

 */

//javaScript
/*
class DivisibleByThreeAndFiveChecker {

    static checkDivisible(number) {

        if (number % 3 === 0 && number % 5 === 0) {
            console.log(number + " is divisible by both 3 and 5.");
        }
        else {
            console.log(number + " is NOT divisible by both 3 and 5.");
        }
    }
}

let number = 20;

DivisibleByThreeAndFiveChecker.checkDivisible(number);
 */
