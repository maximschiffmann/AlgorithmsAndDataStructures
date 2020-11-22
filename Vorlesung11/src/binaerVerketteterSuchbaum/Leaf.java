package binaerVerketteterSuchbaum;

public class Leaf {
	private Object val;
	private Leaf left;
	private Leaf right;

	public Leaf() {
		this.val = null;
	}

	public Object getVal() {
		return this.val;
	}
	

	public void setVal(Object val) {
		this.val = val;
	}

	public Leaf getLeft() {
		return left;
	}

	public void setLeft(Leaf left) {
		this.left = left;
	}

	public Leaf getRight() {
		return right;
	}

	public void setRight(Leaf right) {
		this.right = right;
	}

}
