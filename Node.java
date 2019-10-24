package classes;

public class Node {
	private Card data;
	private Node next;
	private Node previous;
	
	public Node (Card data, Node previousNode, Node nextNode) {
		this.data = data;
		previous = previousNode;
		next = nextNode;
	}

	public Node (Card data) {
		this(data, null, null);
	}

	public Card getData() {
		return data;
	}

	public Node getNext () {
		return next;
	}
	
	public Node getPrevious() {
		return previous;
	}

	public void setData (Card newData) {
		data = newData;
	}
	

	public void setNext (Node nextNode) {
		next = nextNode;
	}
	
	public void setPrevious (Node previousNode) {
		previous = previousNode;
	}

	public Node copyData() {
		return new Node (data);
	}
}
