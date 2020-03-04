package ProjetoInss;

import javax.swing.JOptionPane;

public class CalcularInss {
    
public static void main (String args[]){
    double salario = 0, aliquota = 0, desconto = 0, liquido = 0;
    String aux = "";
    
    aux = JOptionPane.showInputDialog(null, "Insira o sálario: ");
//    aux.replace('.', '');
    aux.replace(',', '.');
    salario = Double.parseDouble(aux);
  
    if (salario <= 965.67){
        aliquota = 8;
    }
    else if (salario >= 965.68 && salario <= 1609.45){
        aliquota = 9;
    }
    else if (salario >= 1609.46 && salario <= 3218.90){
        aliquota = 11;
    }
    
    
    aux = JOptionPane.showInputDialog(null, "Insira o : ");
}
}

