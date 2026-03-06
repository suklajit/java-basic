package basics;

import java.util.Scanner;

class CharacterTypeChecker {

    // Method to check character type
    public static void checkCharacterType(char ch) {

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an Uppercase Letter.");
        }
        else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a Lowercase Letter.");
        }
        else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a Digit.");
        }
        else {
            System.out.println(ch + " is a Special Character.");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        checkCharacterType(ch);

        scanner.close();
    }
}
//python
/*
class CharacterTypeChecker:

    @staticmethod
    def check_character_type(ch):

        if 'A' <= ch <= 'Z':
            print(ch, "is an Uppercase Letter")

        elif 'a' <= ch <= 'z':
            print(ch, "is a Lowercase Letter")

        elif '0' <= ch <= '9':
            print(ch, "is a Digit")

        else:
            print(ch, "is a Special Character")


def main():
    ch = input("Enter a character: ")
    CharacterTypeChecker.check_character_type(ch)


if __name__ == "__main__":
    main()
 */

//javaScript
/*
class CharacterTypeChecker {

    static checkCharacterType(ch) {

        if (ch >= 'A' && ch <= 'Z') {
            console.log(ch + " is an Uppercase Letter");
        }
        else if (ch >= 'a' && ch <= 'z') {
            console.log(ch + " is a Lowercase Letter");
        }
        else if (ch >= '0' && ch <= '9') {
            console.log(ch + " is a Digit");
        }
        else {
            console.log(ch + " is a Special Character");
        }
    }
}

let ch = '#';

CharacterTypeChecker.checkCharacterType(ch);
 */