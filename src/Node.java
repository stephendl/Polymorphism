
public class Node {
	private Node left;
	private Node right;
	private char operation;
	private int value;
	
	public Node (Node left, Node right, char operation, int value) {
		this.left  = left;
		this.right = right;
		this.operation = operation;
		this.value = value;
	}
	
	public int evaluate() {
		int result = value;
		
		if (operation != '#') {
			if (operation == '+') {
				result = left.evaluate() + right.evaluate();
			} else if (operation == '*') {
				result = left.evaluate() * right.evaluate();
			}
		}
		
		return result;
	}
}
