package handlingException;

public class JammedTurkeyCage implements AutoCloseable{
    @Override
    public void close() throws IllegalArgumentException {
        throw new IllegalArgumentException("Cage door does not close"); //suppressed
    }

    public static void main(String[] args) {
        try(var t = new JammedTurkeyCage()){
            throw new RuntimeException("Turkey ran off");//primary exception
        } catch (IllegalArgumentException e){
            System.out.println("caught: " + e.getMessage());
        }
    }
}
