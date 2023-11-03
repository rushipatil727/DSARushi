package com.linkedlist;



public class PalindromCheck {
	
	public static void main(String[] args) {
		
		PalindromCheck list =new PalindromCheck();
		 list.head = new Node(85);
	     list.head.next = new Node(4);
	     list.head.next.next=new Node(40);
	     list.head.next.next.next = new Node(4);
	     list.head.next.next.next.next = new Node(85);
	     
	     boolean palindrom = isPalindrom(PalindromCheck.head);
	     System.out.println(palindrom);
	}
	
	
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
	
	public static boolean isPalindrom(Node head) {
		
		if(head==null || head.next ==null) {
			return true;
			
		}
		
		Node middle=findMiddle(head);   //1 st half ka end
		Node secomdHalfStart=reverse(middle.next); 
		
		Node firstHalfStart=head;
		while(secomdHalfStart !=null) {
			if(firstHalfStart.data != secomdHalfStart.data ) {
				return false;
				
			}
			firstHalfStart=firstHalfStart.next;
			secomdHalfStart=secomdHalfStart.next;
		}
		return true;
		
	}

	
	
	
	private static Node reverse(Node head) {
		Node prev=null;
		Node curr=head;
		
		while(curr !=null) {
			Node next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
			
		}
		
		return prev;
	}

	private static Node findMiddle(Node head) {
		
		Node hare=head;
		Node turtle=head;
		
		while(hare.next !=null  && hare.next.next !=null)
			hare =hare.next.next;
		turtle=turtle.next;
		
		return turtle;
		
	}

}
