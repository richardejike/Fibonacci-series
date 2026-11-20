import java.math.BigInteger;

public class Main{

    public static void main(String[]args){

        BigInteger first = BigInteger.ZERO;

        BigInteger second = BigInteger.ONE;

        System.out.println("first 100 numbers of the fibonacci series:");

        for(int i = 1; i <= 100; i++){
            System.out.print(first + "");
            BigInteger next = first.add(second);
            first = second;
            second = next;
        }

    }
}

