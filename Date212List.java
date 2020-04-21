public abstract class Date212List { // inheritce from Date212?
    protected Date212Node head;
    protected Date212Node last;
    protected int length;

    public Date212List() {
        head = null; // head pointing to empty node
        last = null; // last pointing to empty node
        length = 0; // length = 0;
    }

    /*
     * append method used to add nodes on
     */
    public void append(Date212 data) {
        // before creating a new node, must first instantiate a new object with data for
        // new node
        Date212Node node = new Date212Node(data);
        if (head == null) { // the first node points to null, therefore the list is empty with no nodes
            head = node;
            last = node;
        } else {
            last.next = node;
            last = node;
        }
        length++; // keep track of the number of nodes within the list
    }
    /* the nodes represented as strings */

    public String toString() {

        String data = "";

        Date212 node = head;

        while (node != null) {

            data += node.Date212.toString() + "\n";

            node = node.next;

        }

        return data;

    }

}