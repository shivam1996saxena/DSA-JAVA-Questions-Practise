package mock;

import java.util.Scanner;

public class Mock_challenge_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        LL head = input(size);
        printList(head);
        System.out.println();
        int length = length(head);
        sortList(head,length);
        removeDuplicate(head);
        printList(head);
        System.out.println();
        head = reverseList(head);
        printList(head);

    }
   static LL input(int size){
       Scanner sc = new Scanner(System.in);
        LL head = new LL(sc.nextInt());
        LL temp = head;
       for (int i = 1; i < size; i++) {
           temp.next = new LL(sc.nextInt());
           temp = temp.next;
       }
       return head;
   }
   static void printList (LL head){
        LL temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
   }
   static int length (LL head){
        LL temp = head;
        int l = 0;
       while (temp != null){
           temp = temp.next;
           l++;
       }
       return l;
   }
   static void sortList (LL head, int length){
       for (int i = 0; i < length; i++) {
           LL temp = head;
           for (int j = 0; j < length-i; j++) {
               if (temp.next != null && temp.data > temp.next.data){
                   int x = temp.data;
                   temp.data = temp.next.data;
                   temp.next.data = x;
               }
               temp = temp.next;
           }
       }
   }
   static LL removeDuplicate (LL head){
        LL temp = head;
        while (temp != null){
            if (temp.next!= null && temp.data == temp.next.data){
                temp.next = temp.next.next;
                temp = temp.next;
            }
            else temp = temp.next;
        }
        return head;
   }
   static LL reverseList (LL head){
        LL prev = null;
        LL current = head;
        LL next = null;
        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
   }
//   static LL rotate (LL head, int n){
//        int count = 0;
//        while (count != n){
//            LL temp = head;
//        }
//   }
}
class LL {
    int data;
    LL next;

    public LL(int data) {
        this.data = data;
    }

    public LL() {
    }
}
