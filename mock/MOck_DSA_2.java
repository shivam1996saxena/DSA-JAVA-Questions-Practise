package mock;

import java.util.Scanner;

public class MOck_DSA_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        pointer head = new pointer(sc.nextInt());
        pointer temp = head;
        for (int i = 1; i < size; i++) {
            temp.next = new pointer(sc.nextInt());
            temp = temp.next;
        }
        int m = length(head)/2;
        printList(head);
        reverseHalf(head,m);
        System.out.println();
        printList(head);
    }
    static pointer middleNode(pointer head, int m){
        int c = 0;
        pointer temp = head;
        while (c < m){
            temp = temp.next;
            c++;
        }
        return temp;
    }
    static void reverseHalf(pointer head,int m){
        if (m==1){
            return;
        }
        pointer p = middleNode(head,m);
        pointer mid = p;
        pointer prev = null;
        pointer curr = mid.next;
        while (curr != null){
            pointer next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        mid.next = prev;
    }
    static int  length(pointer head){
        int length = 0;
        pointer temp = head;
        while (temp!=null){
            temp = temp.next;
            length++;
        }
        return length;
    }
    static void printList(pointer head){
        pointer temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
class pointer {
    int data;
    pointer next;

    public pointer(int data) {
        this.data = data;
    }
}
