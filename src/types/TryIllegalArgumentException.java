package types;

public class TryIllegalArgumentException {
    int numberEggs;

    public void setNumberOfEggs(int numberEggs){
        if(numberEggs >= 0)
            this.numberEggs = numberEggs;
        else
            throw new IllegalArgumentException("# eggs muct not be negative");
    }

    public static void main(String[] args) {
        new TryIllegalArgumentException().setNumberOfEggs(-2);
    }
}
