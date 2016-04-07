class Node {
	Node next = null;
	int value;

	public Node(int value) {
	    this.value = value;
	}		
	
	public void appendToTail(int value) {
	    Node end = new Node(value);
	    Node n = this;
	    while (n.next != null) {
		    n = n.next;	
		}
	    n.next = end;
	}
} 
