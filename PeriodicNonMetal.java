/*
Kurt Kaiser
CTIM-168 E40
07.11.2018
*/

public class PeriodicNonMetal extends Periodic
{
    public PeriodicNonMetal(){
        super();
    }

    public PeriodicNonMetal(String newSymbol, int newAtomicNumber, double newAtomicWeight){
        super(newSymbol, newAtomicNumber, newAtomicWeight);
    }

    public void describeElement(){
        System.out.println("Non-metals are not good conductors.");
    }
}