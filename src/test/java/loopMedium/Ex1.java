package loopMedium;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
      // One option - ran until the number is equal to -1
//        for (int i=0;i!=-1;){
//            System.out.println("Please enter your age...");
//            i=scanner.nextInt();
//            if (i!=-1){
//                System.out.println("Your age is: " + i);
//            }
//        }
        // Second option - ran once
        System.out.println("Please enter your age...");
        int num=scanner.nextInt();
        while (num!=-1){
            System.out.println("Your age is: " + num);
            break;
        }
    }
}
