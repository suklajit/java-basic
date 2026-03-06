package basics;

import java.util.Scanner;

public class LeapYearChecker {
    public static void leapYearChecker(int year){
        if((year % 4 == 0 && year % 100 != 0 ) || (year % 400==0)){
            System.out.println("is a leap year");
        }else{
            System.out.println("is not a leap year");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the year");
        int year=sc.nextInt();
        leapYearChecker(year);
        sc.close();
    }
}
//python
/*class LeapYearChecker:

    @staticmethod
    def check_leap_year(year):

        if (year % 4 == 0 and year % 100 != 0) or (year % 400 == 0):
            print(year, "is a Leap Year.")
        else:
            print(year, "is NOT a Leap Year.")


def main():
    year = int(input("Enter a year: "))
    LeapYearChecker.check_leap_year(year)


if __name__ == "__main__":
    main()

 */
//javaScript
/*
class LeapYearChecker {

    static checkLeapYear(year) {

        if ((year % 4 === 0 && year % 100 !== 0) || year % 400 === 0) {
            console.log(year + " is a Leap Year.");
        }
        else {
            console.log(year + " is NOT a Leap Year.");
        }
    }
}

let year = 2024;

LeapYearChecker.checkLeapYear(year);
 */