package aufgabe3;

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

	private Node insert(Node elem, int o) {
		if (elem == null) {
			elem = new Node(o);
			elem.val = o;
			elem.height = 0;
			elem.left = null;
			elem.right = null;
		} else {
			if (o <= elem.val) {
				elem.left = insert(elem.left, o);
				elem = checkRotationRight(elem);
			} else {
				elem.right = insert(elem.right, o);
				elem = checkRotationLeft(elem);
			}
		}
		return elem;
	}

	//
	public void delete(int data) {
		root = delete(root, data);
	}

	private Node delete(Node root, int data) {
		if (root == null) {
			return root;
		}
		if (data < root.val) {
			root.left = delete(root.left, data);
		} else if (data > root.val) {
			root.right = delete(root.right, data);

		} else {
			if (root.left == null && root.right == null) {
				return null;
			}
			if (root.left == null || root.right == null) {
				Node temp;
				if (root.left != null)
					temp = root.left;
				else
					temp = root.right;
				root = temp;
			} else {
				Node temp = root.right;
				Node smallestNodeIterator = root.right;
				while (smallestNodeIterator != null) {
					if (smallestNodeIterator.val < temp.val) {
						temp = smallestNodeIterator;
					}
					smallestNodeIterator = temp.left;
				}
				root.val = temp.val;
				root.right = delete(root.right, temp.val);
			}
		}
		updateHeight(root);
		int balance = getBalance(root);
		if (balance == 2) {
			return checkRotationRight(root);
		} else if (balance == -2)
			return checkRotationLeft(root);
		return root;
	}

	private int getBalance(Node root) {

		if (root == null) {
			return 0;
		}

		return getHeight(root.left) - getHeight(root.right);

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

	private Node checkRotationRight(Node elem) {
		if (elem != null) {
			if (elem.left != null) {
				if (getHeight(elem.left) - getHeight(elem.right) == 2) {
					if (getHeight(elem.left.right) > getHeight(elem.left.left)) {
						elem = doubleRotationRight(elem);
					} else {
						elem = rotateRight(elem);
					}
				} else {
					updateHeight(elem);
				}
			} else {
				updateHeight(elem);
			}
		}
		return elem;
	}

	private Node checkRotationLeft(Node elem) {
		if (elem != null) {
			if (elem.right != null) {
				if (getHeight(elem.right) - getHeight(elem.left) == 2) {
					if (getHeight(elem.right.left) > getHeight(elem.right.right)) {
						elem = doubleRotationLeft(elem);
					} else {
						elem = rotateLeft(elem);
					}
				} else {
					updateHeight(elem);
				}
			} else {
				updateHeight(elem);
			}
		}
		return elem;
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

	private Node rotateLeft(Node a) {
		Node b = a.right;
		a.right = b.left;
		b.left = a;
		a = b;
		updateHeight(a.left);
		updateHeight(a);
		return a;
	}

	private Node doubleRotationLeft(Node a) {
		a.right = rotateRight(a.right);
		a = rotateLeft(a);
		return a;
	}

	private Node rotateRight(Node a) {
		Node b = a.left;
		a.left = b.right;
		b.right = a;
		a = b;
		updateHeight(a.right);
		updateHeight(a);
		return a;
	}

	private Node doubleRotationRight(Node a) {
		a.left = rotateLeft(a.left);
		a = rotateRight(a);
		return a;
	}

	public void insert(int o) {
		root = insert(root, o);
	}

	public void print() {
		print(root);
	}

}
