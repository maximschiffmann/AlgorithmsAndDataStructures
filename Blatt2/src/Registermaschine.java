import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Registermaschine {

	private int[] register = new int[1000];
	private List<String> code;
	private String[][] commands;
	private boolean errorFound = false;
	private Scanner sc = new Scanner(System.in);

	public Registermaschine() {
		this.code = readTextFile("code.txt");
		this.commands = getCommandsFromText();
		this.compile();
	}

	public void compile() {
		if (!errorFound) {
			int zero = 0;
			for (int i = 0; i < this.commands.length; i++) {
				zero = this.register[0];
				int value = Integer.parseInt(this.commands[i][1]);
				switch (this.commands[i][0]) {
				case "ADD":
					add(value);
					break;
				case "SUB":
					sub(value);
					break;
				case "MUL":
					mul(value);
					break;
				case "DIV":
					div(value);
					break;
				case "LDA":
					lda(value);
					break;
				case "LDK":
					ldk(value);
					break;
				case "STA":
					sta(value);
					break;
				case "INP":
					inp(value);
					break;
				case "OUT":
					out(value);
					break;
				case "HLT":
					hlt(value);
					break;
				case "JMP":
					i = value - 1;
					break;
				case "JEZ":
					i = zero == 0 ? value - 1 : i;
					break;
				case "JNE":
					i = zero != 0 ? value - 1 : i;
					break;
				case "JLZ":
					i = zero < 0 ? value - 1 : i;
					break;
				case "JLE":
					i = zero <= 0 ? value - 1 : i;
					break;
				case "JGZ":
					i = zero > 0 ? value - 1 : i;
					break;
				case "JGE":
					i = zero >= 0 ? value - 1 : i;
					break;
				}
			}
		}
	}

	public void add(int register) {
		this.register[0] += this.register[register];
	}

	public void sub(int register) {
		this.register[0] -= this.register[register];
	}

	public void mul(int register) {
		this.register[0] *= this.register[register];
	}

	public void div(int register) {
		this.register[0] /= this.register[register];
	}

	public void lda(int register) {
		this.register[0] = this.register[register];
	}

	public void ldk(int value) {
		this.register[0] = value;
	}

	public void sta(int register) {
		this.register[register] = this.register[0];
	}

	public void inp(int register) {
		int input = 0;
		System.out.println("Enter value: ");
		input = this.sc.nextInt();
		this.register[register] = input;
	}

	public void out(int register) {
		System.out.println("Output: " + this.register[register]);
	}

	public void hlt(int value) {
		// Hier Fehlerbehandlung abhängig von value
		System.out.println("End!");
	}

	private String[][] getCommandsFromText() {
		String[][] commands = new String[this.code.size()][2];
		int i = 0;
		boolean comments = false;
		for (String line : this.code) {
			String[] separateLine = line.split(" ");
			if(separateLine.length > 2 && separateLine[2].startsWith("//")) {
				comments = true;
			} else {
				comments = false;
			}
			// System.out.println(separateLine[0] + " " + separateLine[1]);
			if ((separateLine.length > 2 && comments == false) || separateLine.length < 2) {
				System.out.println("Wrong number of arguments on line: " + i);
				System.out.println(">>> " + this.code.get(i));
				errorFound = true;
				break;
			}
			commands[i][0] = separateLine[0];
			commands[i][1] = separateLine[1];
			i++;
		}

		return commands;
	}

	public void printCommands() {
		for (int i = 0; i < this.commands.length; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(this.commands[i][j] + " ");
			}
			System.out.println();
		}
	}

	private List<String> readTextFile(String filePath) {
		Path file = Paths.get(filePath);
		System.out.println(file.toAbsolutePath().toString());
		List<String> read = null;
		try {
			read = Files.readAllLines(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return read;
	}

	public void printCode() {
		int i = 0;
		for (String line : this.code) {
			System.out.println(i + ": " + line);
			i++;
		}
	}
}
