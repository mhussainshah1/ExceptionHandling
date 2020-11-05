package handlingException;

import java.io.IOException;

public class Finally {
    String info;

    public static void main(String[] args) {
        Finally f = new Finally();
        System.out.println(f.goHome());
        System.out.println(f.goHome2());
        System.out.println(f.exceptionInFinallyBlock());
        f.exit();
    }

    int goHome(){
        try{
            System.out.print("1");
            return -1;
        } catch (Exception e){
            System.out.print("2");
            return -2;
        } finally {
            System.out.print("3");
            return -3;
        }
    }

    int goHome2(){
        try{
            fall();
            System.out.print("1");
            return -1;
        } catch (Exception e){
            System.out.print("2");
            return -2;
        } finally {
            System.out.print("3");
            return -3;
        }
    }

    String exceptionInFinallyBlock(){
        try{
            throw new IOException(); //primary exception
        } finally {
//            info.toString();//suppressed exception
            System.out.print("Exiting ");
            return "zoo";
        }
    }

    void exit(){
        try{
            System.exit(0);
            System.out.println("1");
        } finally {
            System.out.println("Never going to get here");
        }
    }

    private void fall() throws IOException {
        throw new IOException();
    }
}
