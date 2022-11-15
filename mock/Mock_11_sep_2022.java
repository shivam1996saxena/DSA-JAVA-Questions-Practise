package mock;

import java.util.Scanner;

public class Mock_11_sep_2022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
//        link head = new link(sc.nextInt());
//        link temp = head;
//        for (int i = 1; i < size; i++) {
//            temp.next = new link(sc.nextInt());
//            temp = temp.next;
//        }
//        printList(head);
//        System.out.println();
//        System.out.println("The output of reversed List is : - ");
//        printList(reverseList(head));
        int [] arr = {1,5,5,10,17,17};
        System.out.println(Kth_largest(arr));
    }
    static int Kth_largest(int [] arr){
        int max = 0;
        int secondMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max <= arr[i]) {
                max = arr[i];
            }
            else if (secondMax < arr[i]){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
    static link reverseList(link head){
        if (head == null){
            return null;
        }
        link prev = null;
        link current = head;
        link next = null;
        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }
    static void printList(link head){
        if (head == null){
            System.out.print("Your List is Empty");
        }
        link temp = head;
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
class link{
    int data;
    link next;

    public link(int data) {
        this.data = data;
    }
}
