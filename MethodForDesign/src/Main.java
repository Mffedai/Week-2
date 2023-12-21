import java.util.Scanner;

public class Main {

    public static int program(int temp, int number){
        int constant = 5;

        if (temp == number) {
            System.out.println("Result : " + number);
            return 1;
        }
        if(number >= 0){
            System.out.println("if " + number);
            return program(temp, number - constant);
        }
        return program(temp, number + constant);
    }


    public static void main(String[] args) {
        int divide = 0;
        Scanner scan = new Scanner(System.in);

        //Enter value from users
        System.out.print("Please enter a number : ");
        int number = scan.nextInt();
        int temp = number + 5;
        program(temp, number);




    }
}