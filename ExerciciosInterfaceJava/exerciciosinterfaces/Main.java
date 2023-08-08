/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosinterfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IFuncionario> funcionarios = new ArrayList<>();

        Programador programador1 = new Programador(9000);
        Programador programador2 = new Programador(12000);
        funcionarios.add(programador1);
        funcionarios.add(programador2);

        Gerente gerente1 = new Gerente(6000);
        Gerente gerente2 = new Gerente(5000);
        funcionarios.add(gerente1);
        funcionarios.add(gerente2);

            for (IFuncionario funcionario : funcionarios) {
            System.out.println("Salário: " + funcionario.calcularSalario());
        }
    }
}
