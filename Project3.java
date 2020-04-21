import java.util.Scanner;
import java.util.StringTokenizer;

public class project3 {
    public static TextFileInput myFile;
    public static String line;
    public static StringTokenizer myTokens;
    public static int TokenCount;
    public static String[] stringArray = new String[6];
    public static Dates212[] dateArray;
    public static DatesGui myDatesGui;

    public static void main(String[] args) {

        // Take input
        /*
         * Open the file and read a line
         */
        myFile = new TextFileInput("input.txt");
        line = myFile.readLine();
        dateArray = new Dates212[6];
        int i = 0;
        while (line != null) {
            /*
             * Create a new StringTokenizer, passing the String and the delimeter (",")
             */
            String date;
            myTokens = new StringTokenizer(line, ",");
            while (myTokens.hasMoreTokens()) {
                date = myTokens.nextToken();
                dateArray[i] = new Dates212(date);
                stringArray[i] = date;
                i++;
            }
            // prepare input

            line = myFile.readLine();
        }

        myDatesGui = new DatesGui(stringArray, dateArray);

        // printGui
    }
}
