package linked_list;
// addfirst, addlast,
// deletefirst, deletelast,
// add_specific_location, delete_specific_location,
// find the size .
public class SingleLinked_L {

    Node head=null;

    public class Node{
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }

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
   public void addFirst(String data){
        Node new_node=new Node(data);
        if(head==null){
            head=new_node;
            return;
        }

        new_node.next=head;
        head=new_node;


    }

   public void addLast(String data){
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

    public void add_SpecificPosition(String data,int n){
        Node new_node=new Node(data);
        Node temp=head;
        if(head==null){
            head=new_node;
            return;
        }
        for(int i=0;i<n-2;i++){
            temp=temp.next;
        }
        new_node.next=temp.next;
        temp.next=new_node;

    }

    public void removeFirst(){
        if(head==null){
           System.out.println("The list is empty");
           return;
        }
        head=head.next;
    }

    public void removeLast(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        Node temp=head;
        Node ptr=temp.next;

        while(ptr.next!=null){
            temp=ptr;
            ptr=ptr.next;
        }
        temp.next=null;
    }

    public void remove_SpecificElement(int n){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        Node temp=head;
        Node ptr= temp.next;

        for(int i=0;i<n-2;i++){
            temp=ptr;
            ptr=ptr.next;
        }
        temp.next=ptr.next;



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
        SingleLinked_L  list=new SingleLinked_L();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.addLast("List");
        list.add_SpecificPosition("bubble",3);
        list.remove_SpecificElement(4);
        list.printList();
        System.out.println("The size of a linked list is : " + list.length());
        list.remove_SpecificElement(2);
        list.printList();
        System.out.println("The size of a linked list is : " + list.length());


    }
}
