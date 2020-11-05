package exception;

public class MyTry {
    public static void main(String[] args) throws Exception {
/*        try
            fall();
        catch (Exception e)
            System.out.println("get up!!");*/

/*        try {
            fall();
        }finally {
            System.out.println("all better");
        }catch (Exception e) {
            System.out.println("get up!!");
        }*/

/*        try {
            fall();
        }
        */
        try {
            fall();
        }catch (Exception e) {
            System.out.println("get up!!");
        }

        try {
            fall();
        }finally {
            System.out.println("all better");
        }

        try {
            fall();
        }catch (Exception e) {
            System.out.println("get up!!");
        }finally {
            System.out.println("all better");
        }

    }

    private static void fall() throws Exception {
        throw new Exception();
    }
}