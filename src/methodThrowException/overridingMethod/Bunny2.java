package methodThrowException.overridingMethod;
class CanNotHopException2 extends Exception{
}

class Hopper2{
    public void hop() throws Exception{
    }
}

public class Bunny2 extends Hopper2 {
    public void hop() throws CanNotHopException{
    }
}