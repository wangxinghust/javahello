import java.util.stream.Collectors;

public class Example {
    /**
     * 写入文本标题
     */
    private static void writeHeader(final String headerText) {
        final String headerSeparator = "=".repeat(headerText.length() + 4);
        System.out.println("\n" + headerSeparator);
        System.out.println(headerText);
        System.out.println(headerSeparator);
    }

    public static void demonstrateStringLines() {
        String originalString = "Hello\nWorld\n123";
        String stringWithoutLineSeparators = originalString.replaceAll("\\n", "\\\\n");
        writeHeader("String.lines() on '" + stringWithoutLineSeparators + "'");
        originalString.lines();
    }

    public static void demonstrateStringStrip() {
        String originalString = " biezhi.me 23333  ";
        writeHeader("String.strip() on '" + originalString + "'");
        System.out.println("'" + originalString.strip() + "'");
    }

    public static void demonstrateStringStripLeading() {
        String originalString = "  biezhi.me 23333  ";
        writeHeader("String.stripLeading() on '" + originalString + "'");
        System.out.println("'" + originalString.stripLeading() + "'");
    }

    public static void demonstrateStringStripTrailing() {
        String originalString = "  biezhi.me 23333  ";
        writeHeader("String.stripTrailing() on '" + originalString + "'");
        System.out.println("'" + originalString.stripTrailing() + "'");
    }
    public static void demonstrateStringIsBlank(){
        writeHeader("String.isBlank()");
        String emptyString="";
        System.out.println("null string    -> "+emptyString.isBlank());
        String onlyLineSeparator=System.getProperty("line.separator");
        System.out.println("line break     -> "+onlyLineSeparator.isBlank());

        String tabOnly="\t";
        System.out.println("tabs           -> "+tabOnly.isBlank());
        String spaceOnly="    ";
        System.out.println("space          -> "+spaceOnly.isBlank());
    }
    public static void lines(){
        writeHeader("String.lines()");
        String str="Hello \n World, I'm\nbiezhi.";
        System.out.println(str.lines().collect(Collectors.toList()));
    }
    public static void main(String[] args){
        writeHeader("User-Agent\tChrome/8.0 (Windows; AMD");
        demonstrateStringLines();
        demonstrateStringStrip();
        demonstrateStringStripLeading();
        demonstrateStringStripTrailing();
        demonstrateStringIsBlank();
        lines();
    }
}