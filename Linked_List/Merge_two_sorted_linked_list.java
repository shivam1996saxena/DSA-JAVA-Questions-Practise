package Linked_List;

import java.util.Scanner;

public class Merge_two_sorted_linked_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lengthList1 = sc.nextInt();
        int lengthList2 = sc.nextInt();
        Node_List1 head1 = new Node_List1(sc.nextInt());
        Node_List1 x = head1;
        for (int i = 1; i < lengthList1; i++) {
            x.next = new Node_List1(sc.nextInt());
            x = x.next;
        }
        Node_List1 head2 = new Node_List1(sc.nextInt());
        Node_List1 y = head2;
        for (int i = 1; i < lengthList2; i++) {
            y.next = new Node_List1(sc.nextInt());
            y = y.next;
        }
        Node_List1 head;
        Node_List1 a = head1;
        Node_List1 b = head2;
        if (head1.data < head2.data){
            head = head1;
            a = head1.next;
        }
        else {
            head = head2;
            b = head2.next;
        }
        Node_List1 c = head;
        while (a != null && b != null){
            if (a.data < b.data){
                c.next = a;
                a = a.next;
                c = c.next;
            }
            else {
                c.next = b;
                b = b.next;
                c = c.next;
            }
        }
        while (a != null){
            c.next = a;
            a = a.next;
            c = c.next;
        }
        while (b != null){
            c.next = b;
            b = b.next;
            c = c.next;
        }
        printList(head);
    }
//            5 6
//            1 2 3 4 5
//            3 4 6 8 9 10
    static void printList(Node_List1 head1){
        Node_List1 temp = head1;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
class Node_List1 {
    int data;
    Node_List1 next;

    public Node_List1(int data) {
        this.data = data;
    }
}

