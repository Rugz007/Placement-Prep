package Codes;

import Codes.LinkedList.Node;

public class Stack {
    LinkedList list;
    public Stack()
    {
        list = new LinkedList();
    }
    void pop()
    {
        list.remove_tail();
    }
    void push(int data)
    {
        Node n = new Node(data);
        list.insert(n);
    }
    void printList()
    {
        list.printList();
    }
    void peek()
    {
        Node n = list.head;
        while(n.next != null)
        {
            n = n.next;
        }
        System.out.println(n.data);
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(0);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.peek();
    }
}
