package deveravaliativo;

public class exercicio6 {
public static void main(String args) {
	Scanner scanner = new Scanner(System.in);
	int somaidades = 0;
	
	for (int i=1; i <=20; i++) {
		System.out.print("digite a idade da pessoa " + i);
		int idade = scanner.netInt();
		somaidades += idade;
		
	}
	System.out.printl("A soma das idades é: " + somaidades);
}
