package conditions;

public class Ex1 {
    public static void main(String[] args) {
        int age=23;
        if (age<18){
            System.out.println("You are a young");
        }else if (age>66){
            System.out.println("You are a pensioner");
        }else if (age==18){
            System.out.println("Your age is: 18");
        }else {
            System.out.println("Invalid age :)");
        }
    }
}
