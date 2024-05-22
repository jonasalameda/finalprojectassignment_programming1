package util;

public class Util {
    /**
     * converts each word in a string to title case, such as `Yi Wang`, `Computer Science`.
     * @param strIn String of any length to be converted
     * @return Title case of strIn, ex: yi -> Yi, comPutER sciENCE -> Computer Science
     */
    public static String toTitleCase(String strIn) {
        String[] strArray = strIn.split(" ");
        String strOut = "";
        for (String string : strArray) {
            String upperStr = string.substring(0, 1).toUpperCase();
            String lowerStr = string.substring(1).toLowerCase();
            strOut += upperStr + lowerStr + " ";
        }
        return strOut.substring(0, strOut.length() - 1);
    }
}
