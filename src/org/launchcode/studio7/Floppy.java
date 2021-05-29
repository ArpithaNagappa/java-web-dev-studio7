package org.launchcode.studio7;

public class Floppy extends BaseDisc implements OpticalDisc{

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    public Floppy(String aName, int maxCapacity, String aType, int someUsedCapacity) {
        super(aName, maxCapacity, aType, someUsedCapacity);
    }

    @Override
    public void spinDisc() {
        System.out.println("Floppy spin rate is between 50 - 100 rpm.");
    }

    @Override
    public void readData() {
        System.out.println("Wanna see old docs?");
    }
}
