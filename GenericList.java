public class GenericList<iType> {

    /**
     * Define the node object will be used to represent each element of our linked
     * list. This should be modified such that we are using a doubly linked list
     */
    private class Node {
        iType val;
        Node next;

        public Node(iType v) {
            val = v;
            next = null;
        }
    }

    /***************************************************************************
     * Instance variables
     *
     * The private variables that will be available to each instance of our class
     * You may add new instance variables here if you wish, make sure to init them
     * properly in the constructor
     **************************************************************************/
    private Node head;
    private Node tail;
    private int len;

    /***************************************************************************
     * Instance methods
     *
     * Theses are the methods that will be available to each instance of our class,
     * this is also where the public api is defined with the `public` modifier.
     * You may _not_ modify an existing method prototypes or add any new _public_
     * methods, but you may add new _private_ methods as helper functions.
     **************************************************************************/

    /**
     * List constructor, called when a new instance of our class is created. This
     * should initialize all instance variables to a known state.
     */
    public GenericList() {
        head = null;
        tail = null;
        len = 0;
    }

    /**
     * Prints the contents of the list from front to back.
     */
    public void print() {
        Node walker = head;

        StdOut.print("head --> ");
        print(head);
        StdOut.print("null\n");
    }

    /**
     * recursive print helper function
     *
     * @param n A reference to the node that should be printed
     */
    private void print(Node n) {
        if (n == null) {
            return;
        }
        StdOut.print(n.val);
        StdOut.print(" --> ");
        print(n.next);
    }

    /**
     * Prints the contents of the list in reverse order, from back to front
     */
    private void printRev() {

    }

    /**
     * Inserts a new node at the front of the list
     *
     * @param val The value to be inserted
     */
    public void insertFront(iType val) {

    }

    /**
     * Inserts a new node at the end of the list
     *
     * @param val The value to be inserted
     */
    public void insertBack(iType val) {

    }

    /**
     * Checks to see if a given value exists in the list
     *
     * @param val The value to search for
     * @return true or false
     */
    public boolean inList(iType val) {

    }

    /**
     * Removes the front node from the list
     */
    public void deleteFront() {

    }

    /**
     * removes the last node from the list
     */
    public void deleteBack() {

    }

    /**
     * Insert a node into the list at the given position. If the position in the
     * list does not exist the new node should be appeneded to the end of the
     * list. For example if we had the list
     * a -> b -> c -> d
     * and we call insertAt('z', 2); would result in the following list
     * a -> b -> z -> c -> d
     *
     * @param val      The value to insert
     * @param position The position in the list where the node should be placed
     */
    public void insertAt(iType val, int position) {

    }

    /**
     * Get the value located at the front of the list
     *
     * @return the value or null if list is empty
     */
    public iType getFront() {

    }

    /**
     * Get the value located at the end of the list
     *
     * @return the value or null if list is empty
     */
    public iType getBack() {

    }

    /**
     * retreives the value at position in the list. If that position does not
     * exist in the list then return null
     *
     * @param position The position in the list that a value should be retreived
     *                 from
     * @return the value at position or null
     */
    public iType getValueAt(int position) {

    }

    /**
     * Returns the current length of the list
     *
     * @return The length of the list
     */
    public int getLen() {
        return len;
    }

    public static void main(String[] args) {
        GenericList<Integer> ll = new GenericList<Integer>();

        while (!StdIn.isEmpty()) {
            int x = StdIn.readInt();
            ll.insertBack(x);
            ll.print();
            ll.printRev();
        }

        // insert something in the middle
        ll.insertAt(9999, ll.getLen() / 2);
        ll.print();
        ll.printRev();

        // insert something at the front, a few ways
        ll.insertAt(2222, 0);
        ll.print();
        ll.printRev();
        ll.insertFront(3333);
        ll.print();
        ll.printRev();

        // insert something at the back, a few ways
        ll.insertAt(4444, ll.getLen());
        ll.print();
        ll.printRev();
        ll.insertBack(5555);
        ll.print();
        ll.printRev();

        // try to find something that is in the list, and something thats not. Anything
        // that is < ll.getLen should be in the list, anything thats > ll.getlen
        // and not any of the values we inserted should not be
        if (ll.inList(ll.getLen() + 1)) {
            StdOut.printf("%d should not be in the list....\n", ll.getLen() + 1);
        }
        else {
            StdOut.println("inList returned false as expected");
        }

        if (!ll.inList(1)) {
            StdOut.printf("%d should have been in the list but it wasnt found..\n",
                          1);
        }
        else {
            StdOut.println("inList returned true as expected");
        }
    }
}
