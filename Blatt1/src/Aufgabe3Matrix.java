import java.util.Scanner;

class Matrix {
	private int lines;
	private int rows;
	private int[][] matrix;
	private Scanner sc = new Scanner(System.in);
	static int matrixCounter = 0;
	private int num;

	public Matrix(int lines, int rows) {
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
	
	public void add(Matrix m) {
		System.out.println("Matrix Addition:");
		if(this.lines != m.lines || this.rows != m.rows) {
			System.out.println("Matrixgroessen stimmen nicht ueberein!");
			return;
		}
		int temp = 0;
		for (int i = 0; i < this.lines; i++) {
			for (int j = 0; j < this.rows; j++) {
				temp = this.matrix[i][j] + m.matrix[i][j];
				System.out.print(temp + " ");
				temp = 0;
			}
			System.out.println();
		}
	}
	
	public void mult(Matrix m) {
		System.out.println("Matrix Multiplikation:");
		if(this.rows != m.lines) {
			System.out.println("Spaltenzahl der ersten Matrix stimmt nicht mit der Zeilenzahl der zweiten Matrix ueberein!");
			return;
		}
		int temp = 0;
		for (int i = 0; i < this.lines; i++) {
			for (int j = 0; j < m.rows; j++) {
				for (int k = 0; k < m.lines; k++) {
					temp +=	this.matrix[i][k] * m.matrix[k][j];
				}
				System.out.print(temp + " ");
				temp = 0;
			}
			System.out.println();
		}
	}
}

public class Aufgabe3Matrix {

	public static void main(String[] args) {
		Matrix matrix = new Matrix(2,2);
		matrix.init();
		matrix.print();
		matrix.input();
		matrix.print();
		matrix.randomFill();
		matrix.print();
		
		Matrix matrix2 = new Matrix(2,2);
		matrix2.init();
		matrix2.randomFill();
		matrix2.print();
		
		matrix.add(matrix2);
		
		matrix.mult(matrix2);
	}

}
