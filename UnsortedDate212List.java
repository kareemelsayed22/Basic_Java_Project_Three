// This class inheritce methods and manipulates the objects within Date212List
public class UnsortedDate212List extends Date212List {

    public UnsortedDate212List() {
        super(); // method used inside subclass to call method from super class
    }

    public void add(Date212 d) {
        this.append(d);
    }

}