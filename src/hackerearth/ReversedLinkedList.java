package hackerearth;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReversedLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node head = null;

    public static void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    public static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Node reverseSegment(Node start, Node end) {
        Node prev = null;
        Node current = start;
        Node stop = end.next;

        while (current != stop) {
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static Node reverseEven(Node head) {

        Node dummy = new Node(0);
        dummy.next = head;

        Node prev = dummy;
        Node current = head;

        while (current != null) {

            if (current.data % 2 == 0) {

                Node start = current;

                while (current.next != null && current.next.data % 2 == 0) {
                    current = current.next;
                }

                Node end = current;
                Node nextSegment = current.next;

                Node newHead = reverseSegment(start, end);

                prev.next = newHead;
                start.next = nextSegment;

                prev = start;
                current = nextSegment;
            }
            else {
                prev = current;
                current = current.next;
            }
        }

        return dummy.next;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            insert(Integer.parseInt(st.nextToken()));
        }

        head = reverseEven(head);

        printList();
    }
}