package deveravaliativo;

import java.util.Scanner;

public class PessoasMaioridade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pessoasMaioridade = 0;

        for (int i = 0; i < 20; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            
            int idade = scanner.nextInt();

            if (idade >= 18) {
                pessoasMaioridade++;
            }
        }

        System.out.println("O número de pessoas maiores de idade é: " + pessoasMaioridade);

        
    }
}
 	