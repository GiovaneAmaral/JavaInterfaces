/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosinterfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MenuPrincipal {
    public static void main(String[] args) {
        List<Programador> programadores = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        programadores.add(new Programador("Alice", 25, 4500));
        programadores.add(new Programador("Bob", 30, 12000));
        programadores.add(new Programador("Carol", 28, 6500));

        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1 - Exibir por nome");
            System.out.println("2 - Exibir por idade");
            System.out.println("3 - Exibir por salário (menor para maior)");
            System.out.println("4 - Exibir por salário (maior para menor)");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Collections.sort(programadores, new ProgramadorComparatorNome());
                    exibirProgramadores(programadores);
                    break;
                case 2:
                    Collections.sort(programadores, new ProgramadorComparatorIdade());
                    exibirProgramadores(programadores);
                    break;
                case 3:
                    Collections.sort(programadores, new ProgramadorComparatorSalario());
                    exibirProgramadores(programadores);
                    break;
                case 4:
                    Collections.sort(programadores, Collections.reverseOrder(new ProgramadorComparatorSalario()));
                    exibirProgramadores(programadores);
                    break;
                case 5:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }
        } while (opcao != 5);

        scanner.close();
    }

    private static void exibirProgramadores(List<Programador> programadores) {
        for (Programador programador : programadores) {
            System.out.println("Nome: " + programador.nome +
                    ", Idade: " + programador.idade +
                    ", Salário: " + programador.salario);
        }
    }
}
