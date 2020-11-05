package handlingException;

class AnimalsOutForWalk extends RuntimeException{}
class ExhibitClosed extends RuntimeException{}
class ExhibitClosedForLunch extends ExhibitClosed{}

public class ChainingCatch {

    //uncecked exception
    public void visitPorcupine(){
        try{
            seeAnimals();
        } catch (AnimalsOutForWalk e){
            System.out.println("try back later");
        } catch (ExhibitClosed e){
            System.out.println("not today");
        }
    }
    //checked exception
    public void visitMonkey(){
        try{
            seeAnimals();
        } catch (ExhibitClosedForLunch e){ //subclass exception
            System.out.println("try back later");
        } catch (ExhibitClosed e){ //superclass exception
            System.out.println("not today");
        }

/*        try{
            seeAnimals();
        } catch (ExhibitClosed e){ //superclass exception
            System.out.println("not today");
        }catch (ExhibitClosedForLunch e){ //subclass exception
            System.out.println("try back later");
        } */

    }
    public void visitManatess(){
/*        try{

        }catch (NumberFormatException e1){
            System.out.println(e1);
        } catch (IllegalArgumentException e2){
            System.out.println(e1);
        }*/
    }

    private void seeAnimals() {
        throw new ExhibitClosed();
    }
}
