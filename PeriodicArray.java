/*
Kurt Kaiser
CTIM-168 E40
07.11.2018
*/

public class PeriodArray {

    public static void metals(PeriodicMetal[] metalsArray) {
        metalsArray[0] = new PeriodicMetal("Na", 11, 22.9897);
        metalsArray[1] = new PeriodicMetal("Ti", 22, 47.867);
        metalsArray[2] = new PeriodicMetal("Li", 3, 6.941);
    }

    public static void nonMetals(PeriodicNonMetal[] nonMetalsArray) {
        nonMetalsArray[0] = new PeriodicNonMetal("H", 1, 1.0079);
        nonMetalsArray[1] = new PeriodicNonMetal("He", 2, 4.0026);
        nonMetalsArray[2] = new PeriodicNonMetal("Se", 34, 78.96	);
    }

    public static void main(String[] args) {
        PeriodicMetal [] metalsArray = new PeriodicMetal[3];
        metals(metalsArray);
        int sum = 1;
        for (int i = 0; i < 3; i++){
            System.out.println("--- Metal " + sum + " ---\n" + metalsArray[i].toString());
            metalsArray[i].describeElement();
            sum++;
        }
        PeriodicNonMetal [] nonMetalsArray = new PeriodicNonMetal[3];
        nonMetals(nonMetalsArray);
        sum = 1;
        for (int c = 0; c < 3; c++){
            System.out.println("--- Non-Metal " + sum + " ---\n" + nonMetalsArray[c].toString());
            nonMetalsArray[c].describeElement();
            sum++;
        }
    }
}
