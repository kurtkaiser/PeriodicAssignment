/*
Kurt Kaiser
CTIM-168 E40
07.11.2018
*/

public class PeriodicMetal extends Periodic
{
    public PeriodicMetal(){
        super();
    }

    public PeriodicMetal(String newSymbol, int newAtomicNumber, double newAtomicWeight){
        super(newSymbol, newAtomicNumber, newAtomicWeight);
    }

    public void describeElement(){
        System.out.println("Metals are good conductors.");
    }
}
