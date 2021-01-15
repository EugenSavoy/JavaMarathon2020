package day12.task4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("Ivar", 2005, Arrays.asList(new MemberOfGroup("Ivar", "Ragnarson")));
        MusicBand band2 = new MusicBand("Solar", 2005, Arrays.asList(new MemberOfGroup("John", "Do")));
        MusicBand.transferMembers(band1, band2);
        band1.printMembers();
    }
}
