package basics;

import java.util.Scanner;

public class LargerNumberChecker {
    public static void checkLargeNumber(int number1,int number2){
        if(number1>number2){
            System.out.println(number1+"is the large number");
        } else if (number2>number1) {
            System.out.println((number2+"is the large number"));
        }else {
            System.out.println("both number are equal");
        }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your firs number");
        int num1= sc.nextInt();

        System.out.println("enter your second number");
        int num2=sc.nextInt();
        checkLargeNumber(num1,num2);
        sc.close();
    }
}
//python
/*class LargerNumberChecker:

    @staticmethod
    def find_larger(num1, num2):

        if num1 > num2:
            print(num1, "is larger")
        elif num2 > num1:
            print(num2, "is larger")
        else:
            print("Both numbers are equal")


def main():
    num1 = int(input("Enter first number: "))
    num2 = int(input("Enter second number: "))
    LargerNumberChecker.find_larger(num1, num2)


if __name__ == "__main__":
    main()

 */
//javaScript
/*
class LargerNumberChecker {

    static findLarger(num1, num2) {

        if (num1 > num2) {
            console.log(num1 + " is larger");
        }
        else if (num2 > num1) {
            console.log(num2 + " is larger");
        }
        else {
            console.log("Both numbers are equal");
        }
    }
}

let num1 = 30;
let num2 = 18;

LargerNumberChecker.findLarger(num1, num2);
 */