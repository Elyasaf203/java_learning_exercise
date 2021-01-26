package loopBase;

public class EX4 {
    public static void main(String[] args) {
        //Ran num 11-101 end print only the not zugi numbers
        int num=101;
        for (int i=11;i<=num;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
