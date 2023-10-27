package com.linkedlist;



public class LinkedList {
	
	static Node head;
	 
    static class Node {
 
        int data;
        Node next;
 
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
 
    /* Function to reverse the linked list */
    Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
 
    // prints content of double linked list
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    
    ///best way
    void reverseIterate() {
    	if(head==null || head.next==null) {
    		return;
    		
    	}
    	Node previous=head;
    	Node currentNode=head.next;
    	while(currentNode !=null) {
    		
    		Node nextNode=currentNode.next;
    		
    		currentNode.next=previous;
    		
    		//uipdate
    		previous=currentNode;
    		currentNode=nextNode;
    		
    	}
    	head.next=null;
   	head=previous;
    }
    
    //recersive 
    public Node rec(Node node) {
    	
    	Node newHead = rec(node.next);
    	head.next.next=head;
    	head.next=null;
    	
    	return newHead;
    } 
    
    
    
    
 
    // Driver Code
    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
 
        System.out.println("Given linked list");
        list.printList(head);
        //head = list.reverse(head);
        
        //list.reverseIterate();
        list.rec(list.head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }

}
