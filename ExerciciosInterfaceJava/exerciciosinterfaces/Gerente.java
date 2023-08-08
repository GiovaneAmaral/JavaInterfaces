/**/
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

package exerciciosinterfaces;

class Gerente implements IFuncionario {
    private double salarioMensal;

    public Gerente(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario() {
        return salarioMensal * 1.1; 
    }
}
