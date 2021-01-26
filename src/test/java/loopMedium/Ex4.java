package loopMedium;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        //Get the number from user end multiplier the num  by itself end print the results only
        //if results not bigger then 30 or if the num from user not =0;
        Scanner scanner =new Scanner(System.in);
        int results;
        for (int i=1;i!=-0;){
            System.out.println("Please enter a number...");
            i=scanner.nextInt();
            results=i*i;
            if (results<=30&&i!=0){
                System.out.println("The results is: " + results);
            }else {
                System.out.println("The results is bigger then 30 or your number is 0");
                break;
            }
        }
    }
}

