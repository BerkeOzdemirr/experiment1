import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node (int d) {
        data = d;
        next = null;
    }
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter how much data you want to add:");

        int times = input.nextInt();

        Node head = null;
        Node current = null;

        for (int i = 1 ; i <= times ; i++) {
            System.out.println("enter data: ");

            int value = input.nextInt();

            Node newNode = new Node(value);

            if(head == null) {
                head = newNode;
                current = head;
            }else{
                current.next = newNode; //connection
                current = newNode;
				/*
				Example:
				head → [10 | •] → null
				current → [10 | •]
				Adding new node:
				newNode = [20 | null]
				current.next = newNode; → 10 of next show 20 now.
				*/

            }
            System.out.print("Linked elements: ");
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
        printReverse(head);
        input.close();
    }

    static void printReverse(Node head) {
        if (head == null) return;
        printReverse(head.next);
        System.out.println(head.data);
    }
}
