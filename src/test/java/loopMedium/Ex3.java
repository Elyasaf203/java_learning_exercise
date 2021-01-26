package loopMedium;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        //Ran end checks if num is zugi or not as long as the number is not -1
        Scanner scanner =new Scanner(System.in);
        for (int i=0;i!=-1;){
            System.out.println("Please enter your number...");
            i=scanner.nextInt();
            if (i%2==0){
                System.out.println("Zugi number " + i);
            }else if(i%2!=0&&i!=-1){
                System.out.println("Not zugi number " + i);
            }
        }
    }
}
