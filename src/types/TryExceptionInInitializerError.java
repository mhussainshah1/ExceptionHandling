package types;

public class TryExceptionInInitializerError {
    static {
        int[] countOfMoose = new int[3];
        System.out.println(countOfMoose[-1]);
    }
     public static void main(String[] args) {

    }
}
