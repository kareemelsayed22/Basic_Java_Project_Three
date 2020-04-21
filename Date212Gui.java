import javax.swing.*;
import java.awt.*;

public class DateGui extends JFrame {
    SortedDateList sorted;
    UnsortedDateList unsorted;
    TextArea left;
    TextArea right;

    public DateGui(String title, int height, int width) {
        setTitle(title);
        setSize(height, width);
        setLocation(200, 200);
        setLayout(new GridLayout(1, 2));
        left = new TextArea();
        right = new TextArea();
        getContentPane().add(left);
        getContentPane().add(right);
        createFileMenu();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        sorted = new SortedDateList();
        unsorted = new UnsortedDateList();
        setVisible(true);
    }

    private void createFileMenu() {
        JMenuItem item;
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");

        FileMenuHandler fmh = new FileMenuHandler(this);

        item = new JMenuItem("Open"); // Open...
        item.addActionListener(fmh);
        fileMenu.add(item);

        fileMenu.addSeparator(); // add a horizontal separator line

        item = new JMenuItem("Quit"); // Quit
        item.addActionListener(fmh);
        fileMenu.add(item);

        setJMenuBar(menuBar);
        menuBar.add(fileMenu);
        JMenu editMenu = new JMenu("Insert");
        EditMenuHandler emh = new EditMenuHandler(this);

        item = new JMenuItem("Input"); // Open...
        item.addActionListener(emh);
        editMenu.add(item);

        editMenu.addSeparator(); // add a horizontal separator line

        setJMenuBar(menuBar);
        menuBar.add(editMenu);
    }

    public void readFile(String filePath) {
        TextFileInput myFile = new TextFileInput(filePath);
        String line = myFile.readLine();
        while (line != null) {
            String date;
            String[] array = line.split(",");

            for (int i = 0; i < array.length; i++) {
                date = array[i];
                unsorted.add(date);
                sorted.add(date);
            }
            line = myFile.readLine();
        }
    }

    // method that prints only to right of the gui
    public void printToLeft() {
        left.setText("");
        left.append("Unsorted Dates: " + "\n");
        left.append(unsorted.toString());
    }

    // method that prints only to the left side of gui (left textarea)
    public void printToRight() {
        right.setText("");
        right.append("Sorted Dates: " + "\n");
        right.append(sorted.toString());

    }

}
