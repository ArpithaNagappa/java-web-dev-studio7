package org.launchcode.studio7;

public class CD  extends BaseDisc implements OpticalDisc{

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    public CD(String aName, int maxCapacity, String aType, int someUsedCapacity) {
        super(aName, maxCapacity, aType, someUsedCapacity);
    }

    @Override
    public void spinDisc() {
        System.out.println("CD spin rate is between 100 - 300 rpm.");
    }


    @Override
    public void readData() {
        System.out.println("Wanna hear classic 80s hits?");
    }
}
