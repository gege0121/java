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

    public static void main(String[] args){
        //print linkedlist without push();
            LinkedList linkedList=new LinkedList();
            linkedList.head=new Node(1);
            Node second=new Node(2);
            Node third=new Node(3);
            linkedList.head.next=second;
            second.next=third;
            linkedList.printList();

        //create likedlist with push();
        LinkedList ll=new LinkedList();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.push(4);

        //Create loop for testing
        ll.head.next.next.next.next = ll.head;

        //detect loop
        ll.detectLoop();
    }

    }

