import java.util.Scanner;

class MatrixNew {
	private int lines;
	private int rows;
	private int[][] matrix;
	private Scanner sc = new Scanner(System.in);
	static int matrixCounter = 0;
	private int num;
		
	public MatrixNew(int lines, int rows) {
		this.lines = lines;
		this.rows = rows;
		this.matrix = new int[lines][rows];
		this.num = ++matrixCounter;
	}

	public void init() {
		for (int i = 0; i < this.lines; i++) {
			for (int j = 0; j < this.rows; j++) {
				this.matrix[i][j] = 0;
			}
		}
	}

	public void print() {
		System.out.println("Matrix " + this.num);
		for (int i = 0; i < this.lines; i++) {
			for (int j = 0; j < this.rows; j++) {
				System.out.print(this.matrix[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public void input() {
		int input = 0;
		System.out.println("Werte Eingabe:");
		for (int i = 0; i < this.lines; i++) {
			for (int j = 0; j < this.rows; j++) {
				System.out.println("Zeile: " + i + " Spalte: " + j);
				input = this.sc.nextInt();
				this.matrix[i][j] = input;				
			}
		}
	}
	
	public void randomFill() {
		for (int i = 0; i < this.lines; i++) {
			for (int j = 0; j < this.rows; j++) {
				this.matrix[i][j] = (int) (Math.random() * 10) + 1;
			}
		}
	}
	
	public void add(MatrixNew m) {
		System.out.println("Matrix Addition:");
		if(this.lines != m.lines || this.rows != m.rows) {
			System.out.println("Matrixgroessen stimmen nicht ueberein!");
			return;
		}
		long startTime = System.nanoTime(); 
		long steps = 0;
		int temp = 0;
		for (int i = 0; i < this.lines; i++) {
			for (int j = 0; j < this.rows; j++) {
				temp = this.matrix[i][j] + m.matrix[i][j];
			//	System.out.print(temp + " ");
				temp = 0;
				steps++;
			}
			//System.out.println();
		}
		long endTime = System.nanoTime();
		long estimatedTime = (endTime - startTime) / 1000000;
		System.out.println("Time: " + estimatedTime + " ms");
		System.out.println("Steps: " + steps);
	}
	
	public void mult(MatrixNew m) {
		System.out.println("Matrix Multiplikation:");
		if(this.rows != m.lines) {
			System.out.println("Spaltenzahl der ersten Matrix stimmt nicht mit der Zeilenzahl der zweiten Matrix ueberein!");
			return;
		}
		long startTime = System.nanoTime(); 
		long steps = 0;
		int temp = 0;
		for (int i = 0; i < this.lines; i++) {
			for (int j = 0; j < m.rows; j++) {
				for (int k = 0; k < m.lines; k++) {
					temp +=	this.matrix[i][k] * m.matrix[k][j];
					steps++;
				}
			//	System.out.print(temp + " ");
				temp = 0;
			}
		//	System.out.println();
		}
		long endTime = System.nanoTime();
		long estimatedTime = (endTime - startTime) / 1000000;
		System.out.println("Time: " + estimatedTime + " ms");
		System.out.println("Steps: " + steps);
	}
}

public class Aufgabe4Matrix {

	public static void main(String[] args) {
		MatrixNew matrix = new MatrixNew(500,500);
		matrix.init();
		// matrix.print();
		// matrix.input();
		// matrix.print();
		matrix.randomFill();
		// matrix.print();
		
		MatrixNew matrix2 = new MatrixNew(500,500);
		matrix2.init();
		matrix2.randomFill();
		// matrix2.print();
		
		matrix.add(matrix2);

		matrix.mult(matrix2);
	}

}
// 500:		add 7ms	-steps    250 000		mult 310ms				-steps    125 000 000
// 1000: 	add 11ms-steps  1 000 000		mult 8000ms		8s		-steps	1 000 000 000
// 1500:	add 11ms-steps  2 250 000		mult 37200ms	37s		-steps  3 375 000 000
// 2000: 	add 11ms-steps  4 000 000		mult 105800ms	1m45s	-steps  8 000 000 000
// 2500:	add	11ms-steps  6 250 000		mult 213901ms	3m33s	-steps 15 625 000 000
// 3000: 	add 11ms-steps  9 000 000		mult 411409ms	6m51s	-steps 27 000 000 000
// 3500:	add 11ms-steps 12 250 000		mult 659825ms	11m		-steps 42 875 000 000					

