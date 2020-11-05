package methodThrowException.overridingMethod;
class CanNotHopException1 extends Exception{
}

class Hopper1{
    public void hop() throws CanNotHopException{
    }
}

public class Bunny1 extends Hopper1 {
    public void hop() {
    }
}