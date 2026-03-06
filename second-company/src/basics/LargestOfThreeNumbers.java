package basics;

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void checklargeNumber(int num1,int num2,int num3){
        if(num1>num2 && num1>num3){
            System.out.println(num1 + " is the large number");
        } else if (num2>num1 && num2>num3) {
            System.out.println(num2 + "is the large number");
        }else {
            System.out.println(num3 + " is the large number");
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        checklargeNumber(num1, num2, num3);

        scanner.close();
    }
}
//python
/*
class LargestOfThreeNumbers:

    @staticmethod
    def find_largest(num1, num2, num3):

        if num1 >= num2 and num1 >= num3:
            print(num1, "is the largest number")
        elif num2 >= num1 and num2 >= num3:
            print(num2, "is the largest number")
        else:
            print(num3, "is the largest number")


def main():
    num1 = int(input("Enter first number: "))
    num2 = int(input("Enter second number: "))
    num3 = int(input("Enter third number: "))

    LargestOfThreeNumbers.find_largest(num1, num2, num3)


if __name__ == "__main__":
    main()
 */

//javaScript
/*
class LargestOfThreeNumbers {

    static findLargest(num1, num2, num3) {

        if (num1 >= num2 && num1 >= num3) {
            console.log(num1 + " is the largest number");
        }
        else if (num2 >= num1 && num2 >= num3) {
            console.log(num2 + " is the largest number");
        }
        else {
            console.log(num3 + " is the largest number");
        }
    }
}

let num1 = 12;
let num2 = 45;
let num3 = 30;

LargestOfThreeNumbers.findLargest(num1, num2, num3);
*/