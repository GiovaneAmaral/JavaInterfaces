/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciosinterfaces;

import java.util.Comparator;

class ProgramadorComparatorNome implements Comparator<Programador> {
    @Override
    public int compare(Programador p1, Programador p2) {
        return p1.nome.compareTo(p2.nome);
    }
}
