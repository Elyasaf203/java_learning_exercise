package arrayMaedium;

public class Ex3 {
    public static void main(String[] args) {
        //Print the sum of the numbers in array
        double []num={2,3,5,66,7};
        double sum=1;
        for (int i=0;i<num.length;i++){
            sum=sum*num[i];
        }
        System.out.println(sum);
    }
}
