public class Main {

    public static Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
    public static Node segregateEvenOdd(Node head) {

        Node evenStart = null;
        Node evenEnd = null;
        Node oddStart = null;
        Node oddEnd = null;
        Node currentNode = head;

        while(currentNode != null) {
            int element = currentNode.getValue();

            if(element % 2 == 0) {

                if(evenStart == null) {
                    evenStart = currentNode;
                    evenEnd = evenStart;
                } else {
                    evenEnd.setNext(currentNode);
                    evenEnd=evenEnd.getNext();
                }

            } else {

                if(oddStart == null) {
                    oddStart = currentNode;
                    oddEnd = oddStart;
                } else {
                    oddEnd.setNext(currentNode);
                    oddEnd = oddEnd.getNext();
                }
            }
            currentNode = currentNode.getNext();
        }


        if(oddStart == null || evenStart == null) {
            return null;
        }

        evenEnd.setNext(oddStart);
        oddEnd.setNext(null);
        return evenStart;
    }

    private static void swap(Node a1, Node a2) {
        int n = a1.getValue();
        a1.setValue(a2.getValue());
        a2.setValue(n);
    }

    public static void bubbleSort(Node head) {
        boolean flag = true;
        Node tail = findLast(head);

        while (flag) {
            Node le = head;
            flag = false;
            while (le != tail) {
                if (le.getValue() > le.getNext().getValue()) {
                    swap(le, le.getNext());
                    flag = true;
                }
                le = le.getNext();
            }
        }
    }

    public static Node findLast (Node head) {
        Node current = head;
        while (current.getNext() != null) {
            System.out.print(current.getValue() + "->");
            current = current.getNext();
        }
        return current;
    }



    public static void main(String[] args) {

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

        Node current = a;

        a=segregateEvenOdd(a);

        current = a;


        while (current.getNext() != null) {
            System.out.print(current.getValue() + "->");
            current = current.getNext();
        }
        System.out.println(current.getValue());
        reverse (a);

        while (current.getNext() != null) {
            System.out.print(current.getValue() + "->");
            current = current.getNext();
        }
        System.out.println(current.getValue());
        System.out.println(a.getValue());


        bubbleSort(g);

        while (current.getNext() != null) {
            System.out.print(current.getValue() + "->");
            current = current.getNext();
        }
        System.out.println(current.getValue());
    }
}
