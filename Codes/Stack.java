package Codes;

import Codes.LinkedList.Node;

public class Stack {
    LinkedList list;

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

    public static void main(String[] args) {
        
        
    }
}
