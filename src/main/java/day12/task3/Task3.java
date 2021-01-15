package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> bands = new ArrayList<>();
        bands.add(new MusicBand("q", 2005));
        bands.add(new MusicBand("sea", 1999));
        bands.add(new MusicBand("qas", 2008));
        bands.add(new MusicBand("qfaeff", 2009));
        bands.add(new MusicBand("qffef", 2010));
        bands.add(new MusicBand("qafdff", 2001));
        bands.add(new MusicBand("qff", 2002));
        bands.add(new MusicBand("qff", 1998));
        bands.add(new MusicBand("qss", 2004));
        bands.add(new MusicBand("qff", 2005));

        Collections.shuffle(bands);

        System.out.println(bands.toString());

        List<MusicBand> bandsAfter2000 = groupsAfter2000(bands);

        System.out.println(bandsAfter2000.toString());

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        Iterator<MusicBand> mbIterator = bands.iterator();
        while (mbIterator.hasNext()) {
            MusicBand band = mbIterator.next();
            if (band.getYear() < 2000) {
                mbIterator.remove();
            }
        }
        return bands;
    }

}
