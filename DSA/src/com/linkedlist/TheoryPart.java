package com.linkedlist;

import com.linkedlist.LinkedList.Node;

public class TheoryPart {

	
	
	//Three types of linked list 
	//1.circular 2.single 3.Double
	
	//In Double we can can move ahead  and previous 
	
	//cirular last point next points to first point 
	
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
	
	public void adddFirst(int data) {
		
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		newNode.next=head;
		head=newNode;
		
	}
	
	public void addLast(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		
		Node currNode=head;
		while(currNode.next!=null) {
			currNode=currNode.next; 
		}
		currNode.next=newNode;
	}
	
	public void printList() {
		if(head==null) {
			System.out.println("list is empty");
		}
		Node currNode=head;
		while(currNode!=null) {
			System.out.println(currNode.data+" ");
			currNode=currNode.next; 
		}
		System.out.println("null");
	}
	
	public static void main(String[] args) {
		
		TheoryPart ll=new TheoryPart();
		
		ll.adddFirst(16);
		ll.addLast(12);
		ll.printList();
	}
}
