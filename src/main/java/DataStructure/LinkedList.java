package DataStructure;

public class LinkedList {
    //define linkedlist
    Node head;
       //define node
    public static class Node {

        int val;
        Node next;

        Node(int d) {
            val = d;
            }

        }

    //print list
    public void printList(){
        Node n = head;
        while (n != null) {
            System.out.print(n.val + " ");
            n = n.next;
        }
    }

    //121
    //reserve list
    public Node reserve(Node head){
        Node pre=null;
        Node curr=head;
        while(curr!=null){
            Node temp=curr.next;
            curr.next=pre;
            pre= curr;
            curr=temp;
        }
        return pre;
    }

    //insert node at the head of the list
    public void push(int newVal){
        Node newNode = new Node(newVal);
        newNode.next = head;
        head = newNode;
    }

    //detect circle in the list
    //two pointer fast-slow
    public Boolean detectLoop(){
        Node slowPointer = head, fastPointer = head;
        while (slowPointer != null && fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if (slowPointer == fastPointer) {
                System.out.println("Found loop");
                return true;
            }
        }
        System.out.println("no loop");
        return false;
    }

    //Write a Java program to remove duplicates from a sorted linked list.
    void remove_duplicates(){
        Node current=head;
        Node next1;
        if(head==null){
            return;
        }
        while(current.next!=null){
            if(current.val==current.next.val){
                next1=current.next.next;
                current.next=null;
                current.next=next1;
            }
            else{
                current=current.next;
            }
        }

    }

    //143
    //merge two sorted list
    //revursive
    static Node mergeList(Node n1, Node n2){
        if (n1 == null)
            return n2;
        if (n2 == null)
            return n1;

        if (n1.val < n2.val) {
            n1.next = mergeList(n1.next, n2);
            return n1;
        }
        else {
            n2.next = mergeList(n1, n2.next);
            return n2;
        }
    }

    //143.2
    public static Node mergeTwoLists(Node list1, Node list2) {
        //先给个头
        Node head = new Node(0);
        Node mlist = head;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                mlist.next = new Node(list1.val);
                mlist = mlist.next;
                list1 = list1.next;
            } else {
                mlist.next = new Node(list2.val);
                mlist = mlist.next;
                list2 = list2.next;
            }
        }
        while (list1 != null) {
            mlist.next = new Node(list1.val);
            mlist = mlist.next;
            list1 = list1.next;
        }
        while (list2 != null) {
            mlist.next = new Node(list2.val);
            mlist = mlist.next;
            list2 = list2.next;
        }

        head = head.next;
        return head;
    }

    //145 remove the nth node from the end
    static Node removeNode(Node head, int n){
        Node p = head;
        int size = 0;
        while (p != null) {
            size++;
            p = p.next;
        }
        if (n == size) {
            head = head.next;
        } else {
            int index = size - n;
            Node t = head;
            while (index > 1) {
                t = t.next;
                index--;
            }
            t.next = t.next.next;
        }
        return head;
    }




    public static void main(String[] args){
       // print linkedlist without push();
            LinkedList linkedList=new LinkedList();
            linkedList.head=new Node(1);
            Node second=new Node(1);
            Node third=new Node(3);
            linkedList.head.next=second;
            second.next=third;
           // linkedList.printList();
        linkedList.remove_duplicates();
        linkedList.printList();;

        //create likedlist with push();
        LinkedList ll=new LinkedList();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.push(4);

        //Create loop for testing
        ll.head.next.next.next.next = ll.head;

        //reserve
        LinkedList list=new LinkedList();
        Node head=list.head;
        list.head=new Node(1);
        list.head.next=new Node(3);
        list.head.next.next=new Node(5);
        list.head.next.next.next=new Node(7);

        list.printList();
        list.reserve(head);

        //detect loop
        ll.detectLoop();
    }

    }

