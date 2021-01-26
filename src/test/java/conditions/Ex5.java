package conditions;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter number please...");
        int results=scanner.nextInt();
        if (results%2==0){
            System.out.println(results + " is zugi number");
        }else {
            System.out.println(results + " is not zugi number");
        }

    }
}
