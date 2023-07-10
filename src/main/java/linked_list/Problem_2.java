package linked_list;
//Make a linked list and add the following elements to it: (1, 5,7, 3,8,2,3).
//Search for the number 7 and display its index.

public class Problem_2 {

   Node head=null;

    public class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }

    }

    public void addLast(int data){
      Node new_node=new Node(data);
        Node temp=head;
        if(head==null){
            head=new_node;
            return;
        }

        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=new_node;
    }

    public int length(){
        if(head==null){
            return 0;
        }
       Node temp=head;
        int count =0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    public int searchNumber(int size,int searchKey){
        Node temp=head;
        for(int i=0;i<size;i++){
            if(temp.data==searchKey){
                return i;
            }
            temp=temp.next;
        }
        return -1;
    }

    public void printList(){

        Node temp=head;

        while(temp!=null){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Problem_2 ll=new Problem_2();
        ll.addLast(1);
        ll.addLast(5);
        ll.addLast(7);
        ll.addLast(3);
        ll.addLast(8);
        ll.addLast(2);
        ll.addLast(3);
        ll.printList();
        int size=ll.length();
        System.out.println("The index of searchKey is : " + ll.searchNumber(size,7));
    }
}
