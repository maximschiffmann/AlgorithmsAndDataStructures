package Aufgabe1;

public class Programm {

	public static void main(String[] args) {
		BfsDfs g = new BfsDfs(9);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(0, 6);

		g.addEdge(1, 3);

		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(2, 4);

		g.addEdge(3, 6);

		g.addEdge(4, 1);
		g.addEdge(4, 5);
		g.addEdge(4, 8);

		g.addEdge(5, 2);
		g.addEdge(5, 3);
		g.addEdge(5, 4);
		g.addEdge(5, 7);

		g.addEdge(6, 7);

		g.addEdge(7, 3);
		g.addEdge(7, 8);

		g.addEdge(8, 5);

		System.out.println("DFS:");
		g.DFS(0);

		System.out.println();
		System.out.println("BFS:");
		g.BFS(0);
	}

}
