package Assignments_2D_Array;

import java.util.Scanner;

public class Raghu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        Node head = insertComplete(size);
        int l = length(head);
        Node middle = findMiddle(head,l);
        // 1 2 3 4 5 -> 5
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = middle;
//        printList(head);
        System.out.println(isCycle(head));
    }
    static void printList(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    static Node findMiddle (Node head, int length){
        int c = 0;
        int m = length/2;
        Node temp = head;
        while (c+1 != m){
            temp = temp.next;
            c++;
        }
        return temp;
    }
    static boolean isCycle (Node head){
        Node fast = head;
        Node slow = head;
        int l = 0;
        while (fast != null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == null || fast.next == null){
                return false;
            }
            if (fast == slow) {
                Node temp = slow;
                do {
                    temp = temp.next;
                    l++;
                } while (temp != slow);
                break;
            }
        }
        Node f = head;
        Node s = head;
        while (l > 0) {
            s = s.next;
            l--;
        }
        Node prev = null;
        while (f != s){
            prev = s;
            s = s.next;
            f = f.next;
        }
        prev.next = null;
        return true;
    }
    static Node insertComplete(int size){
        Scanner sc = new Scanner(System.in);
        Node head = new Node(sc.nextInt());
        Node temp = head;
        for (int i = 1; i < size; i++) {
            temp.next = new Node(sc.nextInt());
            temp = temp.next;
        }
        return head;
    }
    static int length(Node head){
        // 1 2 3 4 5 100
        // l = 6
        int l = 0;
        Node temp = head;
        while (temp != null){
            temp = temp.next;
            l++;
        }
        return l;
    }
}
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}
