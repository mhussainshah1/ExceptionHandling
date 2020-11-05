package methodThrowException.overridingMethod;
class CanNotHopException extends Exception{

}
class Hopper{
    public void hop(){

    }
}

/*public class Bunny extends Hopper {
    public void hop() throws CanNotHopException{

    }
}*/

public class Bunny extends Hopper {
    public void hop() throws IllegalArgumentException{

    }
}