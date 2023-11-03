package com.linkedlist;

import com.linkedlist.LinkedList.Node;

public class List2 {

	
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
    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    
    Node reverse(Node head ,int k) {
    	
    	if(head == null) 
            return null; 
    	Node current=head;
    	Node next=null;
    	Node previous=null;
    	
    	
    	int count =0;
    	
    	while(count<k && current!=null) {
    		
    		next=current.next;
    		current.next=previous;
    		previous=current;
    		current=next;
    		
    		count++;
    		
    		
    		
    	}
    	if (next != null) 
            head.next = reverse(next, k); 
		return previous;
    	
    }
    
    //by for llop
     public static void reverseByF(int [] arr ,int k) {
    	 int leng=arr.length;
    	 
    for(int i=0; i<leng; i=i+k) {
    	
    	int start=i;
    	int end=Math.min(i+k-1, leng-1);
    	//int end=2;
    	
    	while(start<end) {
    		int temp=arr[start];
    		arr[start]=arr[end];
    		arr[end]=temp;
    		start++;
    		end--;
    		
    	}
    }
     }
	public static void main(String[] args) {
		
		List2 list = new List2();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);
        System.out.println("Given linked list");
        list.printList(head);
        
        list.head=list.reverse(list.head, 3);
        
        System.out.println("sorted linked list");
        list.printList(head);
        
        int[] arr= {1,2,3,4,5};
       System.out.println("-----");
        reverseByF(arr,3);
        for(int a:arr) {
        	System.out.print(a+" ");
        }
	}
}
