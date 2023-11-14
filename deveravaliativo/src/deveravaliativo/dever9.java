package deveravaliativo;

import java.util.Scanner;

public class PessoaMaisJovem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nomeMaisJovem = "";
        int idadeMaisJovem = Integer.MAX_VALUE;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            
            String nome = scanner.nextLine();

            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");

            int idade = scanner.nextInt();
            scanner.nextLine();

            if (idade < idadeMaisJovem) {
                nomeMaisJovem = nome;
                idadeMaisJovem = idade;
            }
        }

        System.out.println("A pessoa mais jovem é: " + nomeMaisJovem + " com " + idadeMaisJovem + " anos.");


    }
}
      