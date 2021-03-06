package aufgabe1;

public class Searchtree {
	private Leaf root;

	public Searchtree() {
		this.root = null;
	}

	private void insert(Leaf currRoot, Leaf elem) {
		int elemVal = getValue(elem.getVal());
		int currVal = getValue(currRoot.getVal());
		if (elemVal <= currVal) {
			if (currRoot.getLeft() == null) {
				currRoot.setLeft(elem);
			} else {
				insert(currRoot.getLeft(), elem);
			}
		} else {
			if (currRoot.getRight() == null) {
				currRoot.setRight(elem);
			} else {
				insert(currRoot.getRight(), elem);
			}
		}

	}

	private void deleteTree(Leaf root) {
		if (root != null) {
			if (root.getLeft() != null)
				deleteTree(root.getLeft());
			if (root.getRight() != null)
				deleteTree(root.getRight());
			root = null;
		}
	}

	private void print(Leaf root) {
		if (root != null) {
			System.out.print("(");
			print(root.getLeft());
			System.out.print("," + root.getVal() + ",");
			print(root.getRight());
			System.out.print(")");
		} else {
			System.out.print("n");
		}
	}

	public void deleteTree() {
		deleteTree(root);
		root = null;
	}

	public void insert(int o) {
		System.out.println(o);
		Leaf elem = new Leaf();
		elem.setVal(o);
		elem.setLeft(null);
		elem.setRight(null);
		if (root == null) {
			root = elem;
		} else {
			insert(root, elem);
		}
	}

	public boolean contains(Object o) {
		Leaf curr = root;
		while (curr != null) {
			if (curr.getVal() == o) {
				return true;
			} else {
				int oVal = getValue(o);
				int currVal = getValue(curr.getVal());
				if (oVal <= currVal) {
					curr = curr.getLeft();
				} else {
					curr = curr.getRight();
				}
			}
		}
		return false;
	}

	public void deleteValueIter(int o) {
		Leaf curr = root;
		Leaf prev = null;

		while (curr != null && getValue(curr.getVal()) != o) {
			prev = curr;
			if (o < getValue(curr.getVal())) {
				curr = curr.getLeft();
			} else {
				curr = curr.getRight();
			}
		}

		if (curr == null) {
			System.out.println("Item not found!");
			return;
		}

		if (curr.getLeft() == null || curr.getRight() == null) {
			Leaf newCurr;

			if (curr.getLeft() == null) {
				newCurr = curr.getRight();
			} else {
				newCurr = curr.getLeft();
			}

			if (prev == null) {
				return;
			}

			if (curr == prev.getLeft()) {
				prev.setLeft(newCurr);
			} else {
				prev.setRight(newCurr);
			}

		} else {
			Leaf p = null;
			Leaf temp;

			temp = curr.getRight();
			while (temp.getLeft() != null) {
				p = temp;
				temp = temp.getLeft();
			}

			if (p != null) {
				p.setLeft(temp.getRight());
			} else {
				curr.setRight(temp.getRight());
			}

			curr.setVal(temp.getVal());
		}

	}

	public void deleteValue(Object o) {
		root = deleteRecursive(root, getValue(o));
	}

	private Leaf deleteRecursive(Leaf curr, int o) {
		if (curr == null) {
			return null;
		}
		int oVal = o;
		int currVal = getValue(curr.getVal());

		if (oVal == currVal) {
			if (curr.getLeft() == null && curr.getRight() == null) {
				return null;
			}

			if (curr.getRight() == null) {
				return curr.getLeft();
			}

			if (curr.getLeft() == null) {
				return curr.getRight();
			}

			Leaf smallestValue = findSmallestValue(curr.getRight());
			curr.setVal(smallestValue.getVal());
			curr.setRight(deleteRecursive(curr.getRight(), getValue(smallestValue.getVal())));
		}
		if (oVal < currVal) {
			curr.setLeft(deleteRecursive(curr.getLeft(), o));
			return curr;
		}
		curr.setRight(deleteRecursive(curr.getRight(), o));
		return curr;
	}

	private Leaf findSmallestValue(Leaf root) {
		return root.getLeft() == null ? root : findSmallestValue(root.getLeft());
	}

	public int getValue(Object o) {
		return Integer.parseInt(o.toString());
	}

	public void print() {
		print(root);
	}

	public void printPre() {
		printPre(root);
	}

	private void printPre(Leaf root) {
		if (root != null) {
			System.out.print("(" + root.getVal() + ",");
			printPre(root.getLeft());
			System.out.print(",");
			printPre(root.getRight());
			System.out.print(")");
		} else {
			System.out.print("n");
		}
	}

	public void printPost() {
		printPost(root);
	}

	public void printPost(Leaf root) {
		if (root != null) {
			System.out.print("(");
			printPre(root.getLeft());
			System.out.print(",");
			printPre(root.getRight());
			System.out.print("," + root.getVal() + ")");
		} else {
			System.out.print("n");
		}
	}
}
