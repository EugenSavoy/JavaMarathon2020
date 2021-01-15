package day12.task4;

public class MemberOfGroup {

    private String name;
    private String soname;

    public MemberOfGroup(String name, String soname) {
        this.name = name;
        this.soname = soname;
    }

    @Override
    public String toString() {
        return "Name=" + name + '\'' + soname +'}';
    }
}
