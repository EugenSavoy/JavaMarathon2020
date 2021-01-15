package day12.task4;

import java.util.List;

public class MusicBand {

    private String name;
    private int year;
    private List<MemberOfGroup> members;

    public MusicBand(String name, int year, List<MemberOfGroup> members) {
        this.name = name;
        this.year = year;
        this.members = members;

    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public List<MemberOfGroup> getMembers() {
        return this.members;
    }

    public void printMembers() {
        System.out.println(members.toString());
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "Name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public static void transferMembers(MusicBand band1, MusicBand band2) {
        for (MemberOfGroup member: band2.getMembers()) {
            band1.getMembers().add(member);
        }
       band2.getMembers().clear();
    }

}
