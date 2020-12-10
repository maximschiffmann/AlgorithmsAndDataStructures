package aufgabe4;

import java.util.Random;

public class SkipList {

	public class SkipNode {

		public int key;
		public SkipNode right;
		public SkipNode down;
		public int Node_height;

	}

	public SkipNode head_first;
	public SkipNode head_last;
	public int list_height;

	public SkipList() {
		head_first = new SkipNode();
		head_last = new SkipNode();

		head_first.key = Integer.MIN_VALUE;
		head_first.down = null;
		head_first.right = head_last;
		head_first.Node_height = 0;

		head_last.key = Integer.MAX_VALUE;
		head_last.down = null;
		head_last.right = null;
		head_last.Node_height = 0;

	}

	public void delete(int key) {

		SkipNode curr = head_first;
		SkipNode prev = null;

		while (curr != null) {
			if (curr.key < key) {
				prev = curr;
				curr = curr.right;
			} else if (curr.key > key) {
				curr = prev.down;

			} else {
				prev.right = curr.right;
				curr = prev.down;
			}
		}
	}

	public void insert(int key) {

		SkipNode curr = head_first;
		SkipNode prev = null;

		while (curr.down != null) {
			if (curr.key < key) {
				prev = curr;
				curr = curr.right;
			} else if (curr.key > key) {
				curr = prev.down;

			}

		}

		if (curr.Node_height == 0) {
			while (curr.right.key < key) {
				curr = curr.right;
			}

		}

		SkipNode newNode = new SkipNode();
		newNode.key = key;
		newNode.right = curr.right;
		newNode.Node_height = 0;
		newNode.down = null;
		curr.right = newNode;

		Random rand = new Random();
		int randomNum = rand.nextInt(2);

		int height = newNode.Node_height + 1;

		while (randomNum != 0) {

			SkipNode layer = head_first;

			// int count=0;
			if (layer.Node_height < height) {

				SkipNode first = new SkipNode();
				SkipNode last = new SkipNode();

				first.key = Integer.MIN_VALUE;
				first.down = head_first;
				first.right = last;
				first.Node_height = height;

				last.key = Integer.MAX_VALUE;
				last.down = head_last;
				last.right = null;
				last.Node_height = height;

				head_first = first;
				head_last = last;

				layer = first;
				// count++;

			} else {

				while (layer.Node_height != height) {
					layer = layer.down;
				}

				while (layer.right.key < key) {
					layer = layer.right;
				}
			}

			SkipNode newNodeTop = new SkipNode();
			newNodeTop.key = key;
			newNodeTop.Node_height = height;
			newNodeTop.down = newNode;
			newNodeTop.right = layer.right;

			layer.right = newNodeTop;

			newNode = newNodeTop;
			height++;

			// if(count==0)
			randomNum = rand.nextInt(2);
			// else randomNum=0;
		}

	}

	public void printlist() {
		SkipNode currlayer = head_first;

		while (currlayer != null) {
			SkipNode curr = currlayer;

			while (curr != null) {

				if (curr.key == Integer.MIN_VALUE) {
					System.out.print("First");
				} else if (curr.key == Integer.MAX_VALUE) {
					System.out.print("Last");
				} else {
					System.out.print(curr.key);
				}

				if (curr.right != null) {
					System.out.print(" -> ");
				}
				curr = curr.right;
			}
			System.out.println();

			currlayer = currlayer.down;
		}
	}

	public boolean search(int key) {

		SkipNode curr = head_first;
		SkipNode prev = null;

		while (curr != null) {
			if (curr.key < key) {
				prev = curr;
				curr = curr.right;
			} else if (curr.key > key) {
				curr = prev.down;
			} else {
				return true;
			}
		}
		return false;
	}

}
