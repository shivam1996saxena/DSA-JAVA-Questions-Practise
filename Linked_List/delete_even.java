package Linked_List;

import java.util.Scanner;

public class delete_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        Node head = new Node(sc.nextInt());
        Node x = head;
        for (int i = 1; i < n; i++) {
            x.next = new Node(sc.nextInt());
            x = x.next;
        }
        if (head.data%2==0){
            head = head.next;
        }
        Node temp = head;
        Node prev = null;
        while (temp != null){
            if (temp.data%2==0){
              temp = prev;
              temp.next = prev.next.next;
            }
            prev = temp;
            temp = temp.next;
        }
        print(head);
    }
    static void print(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}
