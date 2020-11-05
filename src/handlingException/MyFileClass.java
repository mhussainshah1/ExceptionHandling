package handlingException;

public class MyFileClass implements AutoCloseable{
    private final int num;

    public MyFileClass(int num) {
        this.num = num;
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing: " + num);
    }
}
