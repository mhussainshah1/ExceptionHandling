package handlingException;

import java.util.Scanner;

public class OrderOfOperation {
    public static void main(String[] args) throws Exception {
        try (MyFileClass f1 = new MyFileClass(1);
             MyFileClass f2 = new MyFileClass(2);) {
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("ex");
        } finally {
            System.out.println("finally");
        }

        try (var f1 = new MyFileClass(1);
             var f2 = new MyFileClass(2)) {
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("ex");
        } finally {
            System.out.println("finally");
        }

        try (var f1 = new MyFileClass(1);
             var f2 = new MyFileClass(2)) {
            throw new RuntimeException();
        }
    }

    public void scope(){
        /*try(Scanner s = new Scanner(System.in)){
            s.nextLine();
        } catch (Exception e){
            s.nextLine();
        } finally {
            s.nextLine();
        }*/
    }

    public void relax(){
/*        final var f1 = new MyFileClass(3);
        MyFileClass f2 = new MyFileClass(4);
        try (f1;
             f2) {
            throw new RuntimeException();
        } catch (Exception e) {
            System.out.println("ex");
        } finally {
            System.out.println("finally");
        }
        f2 = null;*/
    }
}
