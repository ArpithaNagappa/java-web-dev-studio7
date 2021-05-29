package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.

        CD cd = new CD("Classic", 800, "CD", 240);
        DVD dvd = new DVD("Latest Hits", 1600, "DVD", 670);
        VinylRecords lps = new VinylRecords("Old", "LP");
        Floppy f = new Floppy("School Docs", 200, "FLOPPY", 190);

        // TODO: Call each CD and DVD method to verify that they work as expected.

        cd.spinDisc();
        dvd.spinDisc();
        lps.spinDisc();
        f.spinDisc();

        cd.readData();
        dvd.readData();
        lps.readData();
        f.readData();

        System.out.println(cd.writeData(456));
        System.out.println(dvd.writeData(120));
        System.out.println(f.writeData(1));

        System.out.println(cd.diskInfo());
        System.out.println(dvd.diskInfo());
        System.out.println(f.diskInfo());

    }
}
