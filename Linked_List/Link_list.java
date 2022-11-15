package Linked_List;

import java.util.Scanner;

public class Link_list {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node2 head = new Node2(sc.nextInt());
        Node2 temp = head;
        for (int i = 1; i < n; i++) {
            temp.next = new Node2(sc.nextInt());
           temp = temp.next;
        }

    }
    static Node2 reverse(Node2 head){
        Node2 present = head;
        Node2 prev = null;
        while (present != null){
            Node2 next = present.next;
            present.next = prev;
            prev = present;
            present = next;
        }
        head = prev;
        return head;
    }
    static Node2 reverseMid(Node2 mid){
        Node2 present = mid.next;
        Node2 prev = null;
        while (present != null){
            Node2 next = present.next;
            present.next = prev;
            prev = present;
            present = next;
        }
        mid.next = prev;
        return mid;
    }
    static int findMiddle(Node2 head){
        Node2 slow = head;
        Node2 fast = head;
        int counter = 0;
        while (fast.next != null){
            if (fast.next.next == null){
                return counter+1;
            }
            slow = slow.next;
            fast = fast.next.next;
            counter++;
        }
        return counter+1;
    }
    static Node2 findMiddleNode(Node2 head, int counter){
        Node2 slow = head;
        Node2 fast = head;
        Node2 mid;
        while (fast.next != null){
            if (fast.next.next == null){
                mid = slow;
                counter = counter+1;
                return mid;
            }
            slow = slow.next;
            fast = fast.next.next;
            counter++;
        }
        mid = slow;
        counter = counter+1;
        return mid;
    }
    static void printList(Node2 head){
        Node2 temp = head;
        while (temp!=null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("END");
    }
    static Node2 deleteMiddle(Node2 head){
        Node2 current = head;
        int listSize = 0;
        while (current!=null){
            listSize++;
            current = current.next;
        }
        Node2 temp = head;
        int counter = 0;
        while (temp!=null){
            counter++;
            if (counter==listSize/2){
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        return head;
    }
}
class Node2 {
    int data;
    Node2 next;

    Node2(int data) {
        this.data = data;
    }
}