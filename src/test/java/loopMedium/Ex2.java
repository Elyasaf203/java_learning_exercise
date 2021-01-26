package loopMedium;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter your age...");
        int num=scanner.nextInt();
        if (num<18){
            System.out.println("You are young");
        }else if(num>65){
            System.out.println("You are pensioner");
        }else {
            System.out.println("Your age is: " +num);
        }
    }
}
