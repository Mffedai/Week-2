import java.util.Scanner;

public class Main {

    public static String prime(int number, int primeNumb){
        String primeStr ="Sayı asaldır.", NotPrimeStr = "Sayı asal değildir.";

        if (primeNumb > 1 && number % primeNumb == 0){
            return NotPrimeStr;
        }
        else if (primeNumb == 1){
            return primeStr;
        }
        return prime(number, primeNumb-1);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a number : ");
        int number = scan.nextInt();
        int primeNumb = number-1;
        System.out.println(prime(number, primeNumb));

    }
}