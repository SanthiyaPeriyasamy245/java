
public class LinkedList {
    private class node {
        int value;
        node next;
    }

    node head; // for traversal head will be used as starting point for adding elements and son
               // on.

    public void add(int value) {
        node n = new node(); // node obj created.
        n.value = value; // data will stored in the node object
        if (head == null) // head will be initially null
        {
            head = n; // both head and 1st node will point to same object
        } else {
            node n1 = head; // for second node
            while (n1.next != null)
            // run while loop untill the next object is being found as null for first node
            // the next object will be null.
            {
                n1 = n1.next;
            }
            n1.next = n;
        }

    }

    public void show() {
        node n1 = head;
        while (n1.next != null) {
            System.out.println(n1.value);
            n1 = n1.next;
        }
    }

    public static void main(String[] args) {
        LinkedList l = new LinkedList(); // object is being created.
        l.add(1);
        // adding first element to the linked list
        l.add(2);
        l.add(3);
        l.show();
    }
}
