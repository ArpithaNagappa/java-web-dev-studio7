package org.launchcode.studio7;

public class VinylRecords extends OldDisc implements OpticalDisc{

    public VinylRecords(String aName, String aType) {
        super(aName, aType);
    }

    @Override
    public void spinDisc() {
        System.out.println("Vinyl records spin rate is between 5 - 30 rpm.");
    }

    @Override
    public void readData() {
        System.out.println("Wanna hear old songs on LP?");
    }
}
