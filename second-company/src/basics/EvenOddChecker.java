package basics;

public class EvenOddChecker {
    public static void main(String[] args){
        int number =7;
        if(number % 2 ==0){
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }
}

//python version
/*
class EvenOddChecker:
def run(self):
number=7
        if number % 2 == 0:
print("even number")
        else:
print("odd number")

EvenOddChecker().run()
*/
//javaScript version
/*class EvenOddChecker{
    run(){
        let number =7;
        if(number %2==0){
            console.log("even");

        }else{
            console.log("odd");
        }
    }
}
new EvenOddChecker().run();
 */