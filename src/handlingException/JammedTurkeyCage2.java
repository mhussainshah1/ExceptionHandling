package handlingException;

public class JammedTurkeyCage2 implements AutoCloseable{
    @Override
    public void close() throws IllegalArgumentException {
        throw new IllegalArgumentException("Cage door does not close"); //suppressed
    }

    public static void main(String[] args) {
        try(var t = new JammedTurkeyCage2()){
            throw new RuntimeException("Turkey ran off");//primary exception
        } finally {
            throw new RuntimeException(" and we couldn`t find them");
        }
    }
}
