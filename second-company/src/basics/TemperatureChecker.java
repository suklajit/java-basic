package basics;

import java.util.Scanner;

/*
if temperature < 15
       Cold
else if temperature >= 15 AND temperature <= 30
       Warm
else
       Hot
 */
public class TemperatureChecker {
    public static void checkTemp(int temperature){
        if(temperature <= 15){
            System.out.println("temp is cold");
        } else if (temperature >=15 && temperature <=30) {
            System.out.println("warm");
        }else {
            System.out.println("hot");
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        int temperature = scanner.nextInt();

        checkTemp(temperature);

        scanner.close();
    }
}
//python
/*
class TemperatureChecker:

    @staticmethod
    def check_temperature(temp):

        if temp < 15:
            print("Cold")

        elif 15 <= temp <= 30:
            print("Warm")

        else:
            print("Hot")


def main():
    temp = int(input("Enter temperature: "))
    TemperatureChecker.check_temperature(temp)


if __name__ == "__main__":
    main()
 */
//javaScript
/*
class TemperatureChecker {

    static checkTemperature(temp) {

        if (temp < 15) {
            console.log("Cold");
        }
        else if (temp >= 15 && temp <= 30) {
            console.log("Warm");
        }
        else {
            console.log("Hot");
        }
    }
}

let temp = 28;

TemperatureChecker.checkTemperature(temp);
 */