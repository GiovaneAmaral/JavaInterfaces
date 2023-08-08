/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosinterfaces;

import java.util.Comparator;

class ProgramadorComparatorSalario implements Comparator<Programador> {
    @Override
    public int compare(Programador p1, Programador p2) {
        return Double.compare(p1.salario, p2.salario);
    }
}
