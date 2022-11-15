package Linked_List;

public class Sara_s_Students_Contest {
    public static void main(String[] args) {
      LL list = new LL();
      list.insertlast(10);
      list.insertlast(20);
      list.insertlast(30);
      list.insertlast(40);
      list.insertlast(50);
      list.insertlast(60);
      list.dispplay();
    }
    }
class LL {
    private Nodee head;
      void insertlast(int val) {
          if (head == null) {
              Nodee n = new Nodee(val);
              head = n;
          } else {
              Nodee temp = head;
              while (temp.next != null) {
                  temp = temp.next;
              }
              Nodee n = new Nodee(val);
              temp.next = n;
          }
      }
    void dispplay(){
        Nodee temp = head;
        while (temp != null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }
        System.out.print("END");
    }
}

class Nodee {
    Nodee next;
    int val;

    public Nodee(int val) {
        this.val = val;
        next = null;
    }
}
