package methodThrowException;

class NoMoreCarrotsException extends Exception{}

public class Bunny {
    public static void main(String[] args) {
/*        try{
            eatCarrot();
        } catch (NoMoreCarrotsException e){
            System.out.println("");
        }*/

        try{
            eatCarrot();
        } catch (NullPointerException e){
            System.out.println("");
        }

        try{
            eatCarrot();
        } catch (Exception e){
            System.out.println("");
        }
    }

    public void good() throws NoMoreCarrotsException{
        eatCarrot();
    }

    private static void eatCarrot() {
    }
}
