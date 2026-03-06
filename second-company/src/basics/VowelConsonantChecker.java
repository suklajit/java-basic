package basics;

import java.util.Scanner;

public class VowelConsonantChecker {

    public static void checkalphabet(char ch){
        ch=Character.toLowerCase(ch);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("alphabet is a vowel");
        }else {
            System.out.println("is a consonant");
        }
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        checkalphabet(ch);

        scanner.close();
    }
}
//python
/*
class VowelConsonantChecker:

    @staticmethod
    def check_character(ch):

        ch = ch.lower()

        if ch in ['a','e','i','o','u']:
            print(ch, "is a Vowel")
        else:
            print(ch, "is a Consonant")


def main():
    ch = input("Enter a character: ")
    VowelConsonantChecker.check_character(ch)


if __name__ == "__main__":
    main()
 */

//javaScript
/*
class VowelConsonantChecker {

    static checkCharacter(ch) {

        ch = ch.toLowerCase();

        if (ch === 'a' || ch === 'e' || ch === 'i' || ch === 'o' || ch === 'u') {
            console.log(ch + " is a Vowel");
        }
        else {
            console.log(ch + " is a Consonant");
        }
    }
}

let ch = 'O';

VowelConsonantChecker.checkCharacter(ch);
 */