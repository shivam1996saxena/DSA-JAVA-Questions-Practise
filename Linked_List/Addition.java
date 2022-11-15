package Linked_List;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int m = sc.nextInt();
        pointer head1 = new pointer(sc.nextInt());
        pointer temp = head1;
        for (int i = 1; i < n; i++) {
            temp.next = new pointer(sc.nextInt());
            temp = temp.next;
        }
        printList(head1);
        pointer x = head1.next.next;
        deleteNode(x);
        System.out.println();
        printList(head1);
    }
    static void deleteNode(pointer x){
        pointer temp = x;
        pointer temp2 = temp.next;
        int a = temp.data;
        temp.data = temp2.data;
        temp2.data = a;
        x.next = temp2.next;
    }
    static void printList(pointer head){
        pointer temp = head;
        while (temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("END");
    }
}
class pointer {
    int data;
    pointer next;

    public pointer(int data) { this.data = data; }
}
// 1 2 3 4 5 node f
// 1 2 3 node s
// new l h? 12345 + 123 =  12468

