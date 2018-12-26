public class Main {

    public static void reverse( Node node ) {
        Node prev = null;
        Node current = node;
        Node next = node.getNext();
        while (next != null) {
            current.setNext(prev);
            prev = current;
            current = next;
            next=next.getNext();
        }
        current.setNext(prev);
    }

    public static void printf( Node current ) {
        while (current.getNext() != null) {
            System.out.print(current.getValue() + "->");
            current = current.getNext();
        }
        System.out.println(current.getValue());
    }

    public static Node segregateEvenOdd( Node head ) {

        Node evenStart = null;
        Node evenEnd = null;
        Node oddStart = null;
        Node oddEnd = null;
        Node currentNode = head;

        while (currentNode != null) {
            int element = currentNode.getValue();

            if (element % 2 == 0) {

                if (evenStart == null) {
                    evenStart = currentNode;
                    evenEnd = evenStart;
                } else {
                    evenEnd.setNext(currentNode);
                    evenEnd = evenEnd.getNext();
                }

            } else {

                if (oddStart == null) {
                    oddStart = currentNode;
                    oddEnd = oddStart;
                } else {
                    oddEnd.setNext(currentNode);
                    oddEnd = oddEnd.getNext();
                }
            }
            currentNode = currentNode.getNext();
        }


        if (oddStart == null || evenStart == null) {
            return null;
        }

        evenEnd.setNext(oddStart);
        oddEnd.setNext(null);
        return evenStart;
    }

    public static void bubbleSort( Node head ) {
        Node tail = null;
        while (head.getNext() != tail) {
            Node prev = null;
            Node current = head;
            Node next = current.getNext();
            while (current.getNext() != tail) {
                if (current.getValue() > next.getValue()) {
                    current.setNext(next.getNext());
                    if (prev == null) {
                        head = next;
                    } else {
                        prev.setNext(next);
                    }
                    next.setNext(current);

                    prev = next;
                    next = current.getNext();
                } else {
                    prev = current;
                    current = next;
                    next = next.getNext();
                }
            }
            tail = current;
        }
    }

    public static void selectionSort(Node head) {
        if (head.getNext() == null) {
            return;
        }
        Node tailOfSortingElements = null;
        do {
            Node beginningElement = tailOfSortingElements;
            if (beginningElement == null) {
                beginningElement = head;
            }
            else {
                beginningElement =  tailOfSortingElements.getNext();
            }
            Node prev = beginningElement;
            Node current = beginningElement.getNext();
            Node min = beginningElement;
            Node minPrev = tailOfSortingElements;
            while (current != null) {
                if (current.getValue() < min.getValue()) {
                    minPrev = prev;
                    min = current;
                }
                prev = current;
                current = current.getNext();
            }

            Node startNext = beginningElement.getNext();
            beginningElement.setNext(min.getNext());
            if (tailOfSortingElements != null) {
                tailOfSortingElements.setNext(min);
            }
            if (startNext == min) {
                min.setNext(beginningElement);
            } else {
                min.setNext(startNext);
                if (minPrev != null) {
                    minPrev.setNext(beginningElement);
                }
            }

            tailOfSortingElements = min;
        } while (tailOfSortingElements.getNext().getNext() != null);
    }



    public static void main( String[] args ) {

        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);

        a.setNext(b);
        b.setNext(c);
        c.setNext(d);
        d.setNext(e);
        e.setNext(f);
        f.setNext(g);
        g.setNext(h);


        reverse(a);

        printf(h);

        selectionSort(h);

        printf(a);

        segregateEvenOdd(a);

        printf(b);

        bubbleSort(b);

        printf(a);
    }
}