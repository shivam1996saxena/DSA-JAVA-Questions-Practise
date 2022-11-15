package mock;

import java.util.Scanner;

public class Mock_DSA_2_Easy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Node head = new Node(sc.nextInt());
        Node temp = head.next;
        for (int i = 1; i <= size; i++) {
            temp = new Node(sc.nextInt());
            temp = temp.next;
        }
        display(head);
    }
    static void display (Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data);
            temp = temp.next;
        }
    }
}
class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}