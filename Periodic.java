/*
Kurt Kaiser
CTIM-168 E40
07.11.2018
*/

import java.util.Objects;

public abstract class Periodic
{
    // Instance Variables
    private String symbol;
    private int atomicNumber;
    private double atomicWeight;

    // Constructors
    public Periodic()
    {
        symbol = "none";
        atomicNumber = 0;
        atomicWeight = 0;
    }

    public Periodic(String newSymbol, int newAtomicNumber, double newAtomicWeight)
    {
        symbol = newSymbol;
        atomicNumber = newAtomicNumber;
        atomicWeight = newAtomicWeight;
    }

    // Getters
    public String getSymbol() {
        return symbol;
    }

    public int getAtomicNumber() {
        return atomicNumber;
    }

    public double getAtomicWeight() {
        return atomicWeight;
    }

    // Setters
    public void setAtomicNumber(int atomicNumber) {
        this.atomicNumber = atomicNumber;
    }

    public void setAtomicWeight(double atomicWeight) {
        this.atomicWeight = atomicWeight;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String toString() {
        return "Symbol:" + symbol +
                "\nAtomic Number: " + atomicNumber +
                "\nAtomicWeight: " + atomicWeight;
    }

    @Override
    public boolean equals(Object otherObject) {
        if (this == otherObject) return true;
        if (otherObject == null || getClass() != otherObject.getClass()) return false;
        Periodic periodic = (Periodic) otherObject;
        return atomicNumber == periodic.atomicNumber &&
                Double.compare(periodic.atomicWeight, atomicWeight) == 0 &&
                Objects.equals(symbol, periodic.symbol);
    }

    // Abstract method
    public abstract void describeElement();

}
