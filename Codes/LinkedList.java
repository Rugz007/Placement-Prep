package Codes;
public class LinkedList
{
    Node head;
    static class Node
    {
        int data;
        Node next;
        
        Node(int d)
        {
            this.data = d;
        }
    }

    void printList()
    {
        if(head == null)
        {
            System.out.println("The list is empty");
            return;
        }
        Node curr = head;
        while(curr.next != null)
        {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println(curr.data);
    }
    void insert(Node node)
    {
        Node tail = head;
        while(tail.next != null)
        {
            tail = tail.next;
        }
        tail.next = node;
    }
    void remove_tail()
    {
        Node tail = head;
        Node new_tail;
        while(tail.next != null)
        {
            if (tail.next.next == null)
            {
                tail.next = null;
                break;
            }
            tail = tail.next;
        }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        Node new_node = new Node(3);
        ll.head = new_node;
        ll.insert(new Node(10));
        ll.insert(new Node(13));
        ll.insert(new Node(12));
        ll.insert(new Node(11));
        ll.printList();
        ll.remove_tail();
        ll.printList();
    }

}