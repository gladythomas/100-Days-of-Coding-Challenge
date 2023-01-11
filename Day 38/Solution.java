class linkedlist {

    static class Node {
        int data;
        Node next;
    };

    static Node removeFirstNode(Node head) {
        if (head == null)
            return null;

        Node temp = head;
        head = head.next;

        return head;
    }

    static Node removeLastNode(Node head) {
        if (head == null)
            return null;

        if (head.next == null) {
            return null;
        }

        Node second_last = head;
        while (second_last.next.next != null)
            second_last = second_last.next;

        second_last.next = null;

        return head;
    }

    static Node insert(Node head_ref, int new_data) {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = (head_ref);
        (head_ref) = new_node;
        return head_ref;
    }

    public static void main(String args[]) {
        Node head = null;

        head = insert(head, 12);
        head = insert(head, 29);
        head = insert(head, 11);
        head = insert(head, 23);
        head = insert(head, 8);

        System.out.println("Linked list: ");
        for (Node temp = head; temp != null; temp = temp.next)
            System.out.print(temp.data + " ");
        System.out.println();
        System.out.println("Linked list after removing first node: ");
        head = removeFirstNode(head);
        for (Node temp = head; temp != null; temp = temp.next)
            System.out.print(temp.data + " ");
        System.out.println();
        System.out.println("Linked list after removing last node: ");
        head = removeLastNode(head);
        for (Node temp = head; temp != null; temp = temp.next)
            System.out.print(temp.data + " ");
    }
}