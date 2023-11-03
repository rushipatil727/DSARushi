package com.linkedlist;

import java.util.LinkedList;
import java.util.List;

import com.linkedlist.LinkedList.Node;

public class ImpEx1 {
	
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
	public static void main(String[] args) {
		
		
		ImpEx1 list=new ImpEx1();
		 list.head = new Node(85);
	     list.head.next = new Node(15);
	     list.head.next.next = new Node(4);
	     list.head.next.next.next = new Node(20);
	     
	     removeFromEnd(list.head,4);
	     printList(head);
	     
	}
	
	//by dsa
	public static Node removeFromEnd(Node head, int n) {
		
		if(head.next==null) {
			return null;
		}
		
		//size 
		int size=0;
		Node curr=head;
		while(curr !=null) {
			curr=curr.next;
			size++;
		}
		
		if(n==size) {
			System.out.println("tihi");
			return head.next;
			
		}
		
		int indexToSerch=size-n;
		Node prev=head;
		int i=1;
		while(i<indexToSerch) {
			prev=prev.next;
			i++;
			
		}
		prev.next=prev.next.next;
		
		return head;
		
	}
	 static void printList(Node node)
	    {
	        while (node != null) {
	            System.out.print(node.data + " ");
	            node = node.next;
	        }
	    }
	    
	
	
	
	
	/*
	 * for(int i=0; i<list.size(); i++) { System.out.print(list.get(i)+" "); }
	 * System.out.println(); Object element = getElement(list,2);
	 * System.out.println("Element At :"+element);
	 * 
	 * }
	 * 
	 * 
	 * //Find the nth elemnet from linked list from given size ...by collection
	 * defiend public static Object getElement(List list, int n) {
	 * 
	 * int elementIndex=list.size()-n;
	 * 
	 * Object element=list.get(elementIndex); return element;
	 * 
	 * }
	 */
	
	
	
	
	
	
	
	
	
}
