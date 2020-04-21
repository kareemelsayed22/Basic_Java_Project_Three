import java.util.Scanner; // Needed Scanner to read the dates 
// This class inheritce objects and methods from Date212List

public class SortedDate212List extends Date212List {
    public SortedDate212List() {
        super();
    }

    public void add(Date212 d) {
        Date212Node temp = new Date212Node(d);
        Date212Node before = this.head;
        while ((before.next != null) && (before.next.Date212).compareTo(d) < 0) {
            before = before.next;
        }
        temp.next = before.next;
        before.next = temp;
        this.length++;
    }

}