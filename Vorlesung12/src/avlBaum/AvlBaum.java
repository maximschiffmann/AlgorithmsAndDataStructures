package avlBaum;

public class AvlBaum {

	public class Node {
		int height;
		int val;
		Node left;
		Node right;

		public Node(int val) {
			this.val = val;
		}
	}

	private Node root;

	public AvlBaum() {
		this.root = null;
	}

	private int max(int a, int b) {
		return (a > b) ? a : b;
	}

	private int getHeight(Node elem) {
		if (elem == null) {
			return -1;
		} else {
			return elem.height;
		}
	}

	private void updateHeight(Node elem) {
		elem.height = 1 + max(getHeight(elem.left), getHeight(elem.right));
	}

	private void insert(Node elem, int o) {
		if (elem == null) {
			elem = new Node(o);
			elem.val = o;
			elem.height = 0;
			elem.left = null;
			elem.right = null;
		} else {
			if (o <= elem.val) {
				insert(elem.left, o);
				checkRotationRight(elem);
			} else {
				insert(elem.right, o);
				checkRotationLeft(elem);
			}
		}
	}

	private void deleteTree(Node root) {
		if (root != null) {
			if (root.left != null)
				deleteTree(root.left);
			if (root.right != null)
				deleteTree(root.right);
			root = null;
		}
	}

	public void deleteTree() {
		deleteTree(root);
		root = null;
	}

	private void checkRotationRight(Node elem) {
		if (elem != null) {
			if (elem.left != null) {
				if (getHeight(elem.left) - getHeight(elem.right) == 2) {
					if (getHeight(elem.left.right) > getHeight(elem.left.left)) {
						doubleRotationRight(elem);
					} else {
						rotateRight(elem);
					}
				} else {
					updateHeight(elem);
				}
			} else {
				updateHeight(elem);
			}
		}
	}

	private void checkRotationLeft(Node elem) {
		if (elem != null) {
			if (elem.right != null) {
				if (getHeight(elem.right) - getHeight(elem.left) == 2) {
					if (getHeight(elem.right.left) > getHeight(elem.right.right)) {
						doubleRotationLeft(elem);
					} else {
						rotateLeft(elem);
					}
				} else {
					updateHeight(elem);
				}
			} else {
				updateHeight(elem);
			}
		}
	}

	private void print(Node curr) {
		if (curr != null) {
			System.out.print("(");
			print(curr.left);
			System.out.print("," + curr.val + ",");
			print(curr.right);
			System.out.print(")");
		} else {
			System.out.print("n");
		}
	}

	private void rotateLeft(Node a) {
		Node b = a.right;
		a.right = b.left;
		b.left = a;
		a = b;
		updateHeight(a.left);
		updateHeight(a);
	}

	private void doubleRotationLeft(Node a) {
		rotateRight(a.right);
		rotateLeft(a);
	}

	private void rotateRight(Node a) {
		Node b = a.left;
		a.left = b.right;
		b.right = a;
		a = b;
		updateHeight(a.left);
		updateHeight(a);
	}

	private void doubleRotationRight(Node a) {
		rotateLeft(a.left);
		rotateRight(a);
	}

	public void insert(int o) {
		insert(root, o);
	}

	public void print() {
		print(root);
	}

}
