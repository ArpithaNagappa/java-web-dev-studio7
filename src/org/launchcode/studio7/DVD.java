package org.launchcode.studio7;

public class DVD  extends BaseDisc implements OpticalDisc{

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.
    public DVD(String aName, int maxCapacity, String aType, int someUsedCapacity) {
        super(aName, maxCapacity, aType, someUsedCapacity);
    }

    @Override
    public void spinDisc() {
        System.out.println("DVD spin rate is between 250 - 2000 rpm.");
    }

    @Override
    public void readData() {
        System.out.println("Wanna hear latest hits?");
    }
}
