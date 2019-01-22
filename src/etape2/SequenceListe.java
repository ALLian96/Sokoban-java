package etape2;

public class SequenceListe implements NodeInterface {
	int size;    //taille de Liste chainee
	Node head;   //tete
	
	public SequenceListe() {
		size = 0;
		head = null;
	}
	
	private class Node {
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
		
	public void insereTete(int element) {
			Node newHead = new Node(element);
			if(size == 0) {
				head = newHead;
			}
			else {
				newHead.next = head;
				head = newHead;
			}
			size++;
	}
		
	public void insereQueue(int element) {
			Node newQueue = new Node(element);
			Node temp = head;
			if(size == 0) {
				head = newQueue;
			}
			else {
				while(temp.next!=null) {
					temp = temp.next;
				}
				temp.next = newQueue;
			}
			size++;
	}
	
	public int extraitTete() throws Exception {
			int valTete;
			if(size == 0) {
				throw new RuntimeException("S¨¦quence vide");
			}
			else {
				valTete = head.data;
				
				head = head.next;
				System.out.println("valTete :"+ head.data);
				size--;
				return valTete;
			}
	}
		
	public boolean estVide() {
		return (size == 0);
			
	}
	
	public String toString() {
		String str = "tete";
		if(this.head == null) {
			str = "";
		}
		else{
			Node currentNode = this.head;
			while(currentNode!=null) {
				str = str+ "->" + Integer.toString(currentNode.data);
				currentNode = currentNode.next;
			}
		}
		return str;		
	}

}
