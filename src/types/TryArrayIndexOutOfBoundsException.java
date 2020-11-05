package types;

public class TryArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] countOfMoose = new int[3];
        System.out.println(countOfMoose[-1]);
    }
}
