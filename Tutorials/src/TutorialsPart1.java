public class TutorialsPart1 {

    private static String sharedString = "shared";
    private String nonSharedString = "non shared";

    public static void setString(String s)
    {
        sharedString = s;
    }
    public static void printShared()
    {
        System.out.println(sharedString);
    }

    public void setNonSharedString(String s)
    {
        nonSharedString = s;
    }

    public void printNonShared()
    {
        System.out.println(nonSharedString);
    }
    public static void main(String[] args) {
        printShared();
        TutorialsPart1 t = new TutorialsPart1();

        t.printNonShared();

        TutorialsPart1 s = new TutorialsPart1();

        s.setNonSharedString("today");

        t.printNonShared();
        s.printNonShared();
        printShared();
    }
}
